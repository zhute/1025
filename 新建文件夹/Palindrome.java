class Solution {
   public boolean isPalindrome(String s) {
int  l=s.length();
    System.out.println(l/2);
    int result=1;
    for (int i=0;i<l/2;i++){
      if (s.charAt(i)==s.charAt(l-i-1)){
        result=0;
      }else{
        result=1;
        break; 
      }
    }
    if (result==0){
     return true;
    }else {
      return false;
    }
  }