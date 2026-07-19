class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        int []copy=Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        int rank=1;
         for(int i=0;i<copy.length;i++){
            if(!map.containsKey(copy[i]))
            map.put(copy[i],rank++);
       }
       int result[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
           result[i]=map.get(arr[i]);
        }
        return result;
    }
}