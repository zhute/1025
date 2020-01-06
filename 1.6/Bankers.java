package bankersAlgorithm;

import java.util.Scanner;

public class Bankers {
    private final int SOURCE_SIZE = 100;//能够存放的最大资源数
    private final int PROGRAM_SIZE=100;//能够存放的最大进程数
    private Source[] source;//存放资源
    private int sourceNum;
    private Program[] program;//存放进程
    private int programNum;

    //对进程及资源进行初始化
    public Bankers() {
        this.source = new Source[SOURCE_SIZE];
        this.program=new Program[PROGRAM_SIZE];
        this.sourceNum=0;
        this.programNum=0;
    }

    //目录
    public void menu() {
        Scanner in = new Scanner(System.in);
        for (; ; ) {
            System.out.println("**************银行家算法***********");
            System.out.println("1.动态录入可用资源");
            System.out.println("2.动态录入进程");
            System.out.println("3.打印资源和进程的总体情况");
            System.out.println("4.银行家算法");
            System.out.println("5.某个进程请求资源,进行安全性检查");
            System.out.println("6.退出!");
            System.out.println("请选择:");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    addSource();
                    break;
                case 2:
                    if(sourceNum<=0){
                        System.out.println("请先录入可用资源的种类及个数!");
                    }else {
                        addProgram();
                    }
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    int[] Request=new int[programNum];
                    String pName="0";
                    myBankersAlgorithm(Request,pName);
                    break;
                case 5:
                    check();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("无效的输入，请重新输入!");
            }
        }
    }
    //动态录入资源的名称及个数
    public void addSource (){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入资源的种类个数:");
        int num=in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + i + "个资源的名称:");
            in.nextLine();
            String sName=in.nextLine();
            System.out.println("请输入第" + i + "个资源的个数:");
            int sNum=in.nextInt();
            this.source[this.sourceNum++]=new Source(sName,sNum);
        }
        showSource();
    }

    //动态录入进程的名称
    public void addProgram(){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入进程的种类个数:");
        int num=in.nextInt();
        for (int i = 0; i <num; i++) {
            System.out.println("请输入第" + i + "个进程的名称:");
            in.nextLine();
            String gName=in.nextLine();
            System.out.println("请输入第" + i + "个进程的已分配资源数:");
            int allocation[]=new int[this.sourceNum];
            for (int j = 0; j < allocation.length; j++) {
                allocation[j]=in.nextInt();
            }
            System.out.println("请输入第" + i + "个进程的名称还需资源数:");
            in.nextLine();
            int need[]=new int[this.sourceNum];
            for (int j = 0; j <need.length; j++) {
                need[j]=in.nextInt();
            }
            int max[]=new int[this.sourceNum];
            for (int j = 0; j <max.length; j++) {
                max[j]=allocation[j]+need[j];
            }
            this.program[this.programNum++]=new Program(gName,allocation,need,max);
        }
        showProgram();
    }

    //打印已经录入好的资源的情况
    public void showSource(){
        System.out.println("资源名称 资源个数");
        for (int i = 0; i < sourceNum; i++) {
            System.out.println(source[i].getsName()+"          "+source[i].getsNum());
        }
    }

    //打印已经录入好的进程的情况
    public  void showProgram(){
        System.out.println("pName  Allocation     Need         Max");
        for (int i = 0; i < programNum; i++) {
            System.out.println(program[i].getpName()+"      "+program[i].getAllocation()+"           "+
                    program[i].getNeed()+"         "+program[i].getMax());
        }
    }

    //打印资源及进程的总体情况
    public void show(){
        System.out.println("pName  Allocation     Need         Max             Available");
        System.out.print("       ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < sourceNum; j++) {
                System.out.print(source[j].getsName() + " ");
            }
                System.out.print("           ");
        }
        for (int i = 0; i < sourceNum; i++) {
            System.out.print(source[i].getsNum() + " ");
        }
        System.out.println();
        for (int i = 0; i < programNum; i++) {
            System.out.println(program[i].getpName()+"      "+program[i].getAllocation()+"            "+
                    program[i].getNeed()+"         "+program[i].getMax());
        }
    }

    //银行家算法
    public void myBankersAlgorithm(int[] Request,String pName) {
        String[] array = new String[programNum];//用来存放安全序列
        boolean[] finish = new boolean[programNum];
        int size = 0;//array数组的大小
        int k = 0;//记录need是否小于等于可用资源数
        int first = 0;
        int[] Work = new int[sourceNum];//复制可用资源的个数
        for (int i = 0; i < sourceNum; i++) {
            Work[i] = source[i].getsNum();
        }
        for (int i = 0; i < finish.length; i++) {//finish[i]的初始值为false
            finish[i] = false;
        }
        for (; ; ) {
            int i;
            for (i = 0; i < programNum; i++) {
                if (finish[i] == false) {
                    first = 0;
                    k = 0;//每循环一次，k置0
                    for (int j = 0; j < sourceNum; j++) {
                        if ((program[i].need[j] <= Work[j]) && finish[i] == false) {
                            k++;//记录是否都满足
                        }
                    }
                    if (k == sourceNum) {//满足
                        first++;
                        finish[i] = true;//改变finish的值
                        array[size++] = program[i].getpName();//将进程名放入数组
                        for (int p = 0; p < sourceNum; p++) {
                            Work[p] = Work[p] + program[i].allocation[p];//该表可用资源的值
                        }
                    }
                }
            }
            if (size == programNum) {
                System.out.println("安全序列为:");
                for (int j = 0; j < array.length; j++) {//输出安全序列
                    System.out.print(array[j] + " ");
                }
                System.out.println();
                return;
            }
            if (first == 0) {
                System.out.println("无安全序列,无法分配!");
                for (int j = 0; j < programNum; j++) {
                    if (program[j].getpName().equals(pName)) {
                        for (int p = 0; p < sourceNum; p++) {
                            source[p].sNum = source[p].sNum+Request[p];
                            program[j].allocation[p] = program[j].allocation[p]-Request[p];
                            program[j].need[p] = program[j].need[p]+Request[p];
                        }
                    }
                }
                return;
            }
        }
    }

    //某个进程发出请求，使用银行家算法对其进行检查
    public void check(){
        Scanner in=new Scanner(System.in);
        int[] Request=new int[sourceNum];
        String pName;
        System.out.println("请输入请求的各个资源的个数:");
        for (int i = 0; i < Request.length; i++) {//Request数组，存放请求的各个资源的数值
            Request[i]=in.nextInt();
        }
        System.out.println("请输入请求资源的进程名称:");
        in.nextLine();
        for(;;) {
            pName = in.nextLine();
            int count = 0;
            for (int i = 0; i < programNum; i++) {
                if (!pName.equals(program[i].getpName())) {//名字不符合
                    count++;
                }
            }
            if (count == programNum) {//检测完毕，没有符合的名字
                System.out.println("名称输入错误，请重新输入:");
            }else{
                for (int i = 0; i < programNum; i++) {
                    if(program[i].getpName().equals(pName)){//找到符合的名称
                        for (int p = 0; p < sourceNum; p++) {
                            if(Request[p]>program[i].need[p] || Request[p]>source[p].sNum){//请求资源不符合要求
                                System.out.println("请求出错，无法分配!");
                                return;
                            }
                        }
                        //修改Allocation,Need,Avalable的值
                        int sum=0;
                        for (int j = 0; j < sourceNum; j++) {
                            source[j].sNum=source[j].sNum-Request[j];
                            program[i].allocation[j]=program[i].allocation[j]+Request[j];
                            program[i].need[j]=program[i].need[j]-Request[j];
                            if(program[i].need[j]==0){
                                sum++;
                            }
                        }
                        if (sum==sourceNum) {
                            for (int k = 0; k < sourceNum; k++) {
                                source[k].sNum = source[k].sNum + program[i].allocation[k];
                                program[i].allocation[k] = 0;
                            }
                        }
                    }
                }
                break;
            }
        }
        myBankersAlgorithm(Request,pName);//调用银行家算法
    }
    public static void main(String[] args) {
        Bankers bankers=new Bankers();
        bankers.menu();
    }
}
