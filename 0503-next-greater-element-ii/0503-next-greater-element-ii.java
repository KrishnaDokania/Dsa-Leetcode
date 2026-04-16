class Solution {
    public int[] nextGreaterElements(int[] nums) {
            int arr[]=new int[nums.length];
            Arrays.fill(arr,-1);
            Deque<Integer>stack=new ArrayDeque<>();
            for(int i=0;i<nums.length*2;i++){
               int num=i%nums.length;
                while(!stack.isEmpty() && nums[num]>nums[stack.peek()]){
               int index= stack.pop();
               arr[index]=nums[num];
            }
            if (i < nums.length) stack.push(i);
    }
    return arr;
    }
}