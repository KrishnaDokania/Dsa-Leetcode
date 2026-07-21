class Solution {
    public long gcdSum(int[] nums) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        int max=arr[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            arr[i]=gcd(max,nums[i]);
        }
        Arrays.sort(arr);
        long sum=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            sum+=gcd(arr[left],arr[right]);
            left++;
            right--;
        }
        return sum;
    }
    public int gcd(int a, int b){
        while(b!=0){
                int tmp=b;
                b=a%b;
                a=tmp;
            }
            return a;
    }
}