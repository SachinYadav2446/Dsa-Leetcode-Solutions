class Solution {
    public boolean isPrime(int n) {
          //your code goes here
          boolean isPrime=true;
          if(n==1){
            return false;
          }
          else{
            for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
          }
          return isPrime;
          }
          
    }
}