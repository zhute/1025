package src;

public class 二维数组的查找 {
    public boolean Find(int x,int[][]array){
        if(array==null){
            return false;
        }
        int i=0;
        int j=array[0].length-1;
        while(i<array.length&&j>=0){
            if(x<array[i][j]){
                j--;
            }
            else if(x>array[i][j]){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
