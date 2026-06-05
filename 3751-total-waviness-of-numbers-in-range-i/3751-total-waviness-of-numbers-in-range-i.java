class Solution {
    public int totalWaviness(int num1, int num2) {
        int waviness=0;
       for(int i=num1;i<=num2;i++){
        int tmp=i;
        while(tmp/100!=0){
            int a=tmp%10;
            int b=((tmp%100)-a)/10;
            int c=((tmp%1000)-(tmp%100))/100;
            if((a>b&&b<c)||(a<b&&b>c)){waviness++;}
            tmp=tmp/10;
        }
       } 
       return waviness;
    }
}