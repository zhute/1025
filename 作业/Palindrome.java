Public class Palindrome{
	public bookean isPalindrome(int x){
		
		 if(x<0){
        return false;
        }
        int i=0;
        int j=0;
        int n=x;
        while(n !=0){
            i=n%10;
            j=j*10+i;
            n=n/10;
        }
        return true;
    }
}