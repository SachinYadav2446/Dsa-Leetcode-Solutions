class Solution {
    public boolean isPalindrome(int x) {
        int num=0;
        int n=x;
        int i=0;
        while(i<n){
            int lastDigit=n%10;
            n=n/10;
            num=num*10+lastDigit;
        }
        if(num==x){
            return true;
        }else{
            return false;
        }

    }
}