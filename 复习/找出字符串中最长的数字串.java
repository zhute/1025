package src;

import java.util.Scanner;

public class  找出字符串中最长的数字串 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str = sc.next();

            char[] array = str.toCharArray();
            int l=0,r=0;
            int maxL = l, maxR = r;
            int max = 0;

            while(r != array.length){
                if(l == r){
                    if(array[l] >= 'a' && array[l] <= 'z'){
                        l++;
                        r++;
                    }else{
                        r++;
                    }
                }else{
                    if(array[r] >= 'a' && array[r] <= 'z'){
                        if(r-l > max){
                            max = r-l;
                            maxL = l;
                            maxR = r;
                        }
                        l = r;
                    }else{
                        r++;
                        if(r == array.length){
                            if(r-l > max){
                                max = r-l;
                                maxL = l;
                                maxR = r;
                            }
                        }
                    }
                }
            }
            for(int i=maxL; i<maxR; i++){
                System.out.print(array[i]);
            }
        }
    }

