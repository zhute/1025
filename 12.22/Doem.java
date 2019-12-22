
public class Main {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  String s1 = input.nextLine();
  String s2 = input.nextLine();
  StringBuffer s3 = new StringBuffer();
  int [] a = new int[s1.length()];
  char []ss1 = s1.toCharArray();
  char [] ss2 = s2.toCharArray();
  for (int i = 0; i < ss2.length; i++) {
   char tmp = ss2[i];
   for (int j = 0; j < ss1.length; j++) {
    if(tmp == ss1[j]){
     a[j] = 1;
    }
   }
  }
  for (int i = 0; i < ss1.length; i++) {
   if(a[i]==0){
    s3.append(ss1[i]);
   }
  }
  System.out.println(s3);
 }
}
