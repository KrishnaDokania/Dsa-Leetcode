class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            for(int j=i+1;j<nums2.length;j++){
            if(nums2[i]<nums2[j]){
            map.put(nums2[i],nums2[j]);
            break;}
        }
        }
        int arr[]=new int[nums1.length];
        int i=0;
        for(int num: nums1){
            if(map.containsKey(num))
            arr[i]=map.get(num);
            else
            arr[i]=-1;
            i++;
        }
        return arr;
    }
}