class Solution {
    public int minOperations(int[][] grid, int x) {
       int arr[]=new int[grid.length*grid[0].length];
       int k=0;
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            arr[k]=grid[i][j];
            k++;
        }
       } 
       Arrays.sort(arr);
       int mid=arr.length/2;
       int count=0;
       for(int i=0;i<arr.length;i++){
        while(arr[i]!=arr[mid]){
            if(arr[i]<arr[mid]){
                arr[i]=arr[i]+x;
                if(arr[i]>arr[mid])
                return -1;
            }
            else{
            arr[i]=arr[i]-x;
            if(arr[i]<arr[mid])
            return -1;
             }

        count++;
        }
       }
       return count;
    }
}