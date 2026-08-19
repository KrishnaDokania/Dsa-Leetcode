class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
           Map<Integer, Set<Integer>> reserved = new HashMap<>();

        for (int[] seat : reservedSeats) {
            int row = seat[0];
            int col = seat[1];

            reserved.computeIfAbsent(row, x -> new HashSet<>()).add(col);
        }
        int count=2*n;
           for (Map.Entry<Integer, Set<Integer>> entry : reserved.entrySet()) {
            boolean left=true;
            boolean mid=true;
            boolean right=true;
            Set<Integer> seats = entry.getValue();
            for(int i=2;i<=5;i++){
                if(seats.contains(i)){

                left=false;
                break;
                }
            }
             for(int i=4;i<=7;i++){
                if(seats.contains(i)){
                mid=false;
                break;
                }
            }
             for(int i=6;i<=9;i++){
                if(seats.contains(i)){   
                right=false;
                break;
                }
            }
            if(left&&right)continue;
            else if(left||right||mid)count--;
            else count-=2;
           }
           return count;
    }
}