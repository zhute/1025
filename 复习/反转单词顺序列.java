package src;

public class 反转单词顺序列 {
        public String ReverseSentence(String str) {
            if((str==null)||str.trim().length()==0)return str; //判断为空和只有空格的形式
            String[] str1=str.split(" ");                //按照" "进行分组
            StringBuilder sbu=new StringBuilder();
            for(int i=str1.length-1;i>=0;i--){
                if(i==0){
                    sbu.append(str1[i]);             //如果是最后一个遍历的，则不需要加" ";
                }else{
                    sbu.append(str1[i]);             //如果不是最后一个，则add" "
                    sbu.append(" ");
                }
            }
            return sbu.toString();    //将StringBuilder转换为String。
        }
    }
