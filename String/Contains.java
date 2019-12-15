public boolean container(String s,String str){
   boolean flag = false;
   try {
       byte[] s1 = s.getBytes();
       byte[] s2 = str.getBytes();
       int len1 = s1.length, len2 = s2.length;
       int i = 0, j = 0;
       while (i < len1 && j < len2) {
           if (s1[i] == s2[j]) {
               i++;
               j++;
           } else {
               i = i - j + 1;
               j = 0;
           }
       }
       if (j == s2.length) {
          flag = true ;
       } else {
           flag = false;
       }
   }catch (Exception e){
       e.printStackTrace();
       System.out.println("空指针");
   }finally {
       return flag;
   }
}