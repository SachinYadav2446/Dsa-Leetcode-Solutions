class Solution {
    public boolean isArmstrong(int n) {
       
        int finalnumber=0;
        int dup=n;
        int count=0;
        while(dup>0){
            dup=dup/10;
            count++;
        }

        while(dup>0){
            int ld=dup%10;
            dup=dup/10;
            ld=(int) Math.pow(ld,count);
            finalnumber=finalnumber+ld;
        }
        if(n==finalnumber)return true;
        else return false;
    }
}