class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int result=0;
        for(int i=0;i<n;i++){
        int prod=1;        
        int gcd=0;
        long lcm=1;
            for(int j=i;j<n;j++){
            prod*=nums[j];
            gcd=GCD(gcd,nums[j]);
            lcm = (lcm / GCD((int)lcm, nums[j])) * nums[j];
            if(prod==lcm*gcd)
            result=Math.max(result,j-i+1);
            if(prod>lcm*gcd) 
            break;
        }
    }
    return result;
    }
        public int GCD(int a, int b) {
         while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
}