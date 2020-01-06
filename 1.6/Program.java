package bankersAlgorithm;

public class Program {
     private String pName;//进程名
     public int[] allocation;//进程已分配的各个资源个数
     public int[] need;//进程还需的各个资源个数
     public int[] max;//进程所需的各个资源最大个数

    public Program(String pName,int[] allocation,int[] need,int[] max) {
        this.pName = pName;
        this.allocation=allocation;
        this.need=need;
        this.max=max;
    }

    public String getpName() {
        return pName;
    }

    public StringBuilder getAllocation() {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < allocation.length; i++) {
            str.append(allocation[i] + " ");
        }
        return str;
    }

    public StringBuilder getNeed() {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < allocation.length; i++) {
            str.append(need[i] + " ");
        }
        return str;
    }

    public StringBuilder getMax() {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i<max.length; i++) {
            str.append(max[i] + " ");
        }
        return str;
    }
}
