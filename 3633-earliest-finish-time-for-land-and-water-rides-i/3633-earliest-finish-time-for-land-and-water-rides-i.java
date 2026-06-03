class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        int land=Integer.MAX_VALUE;
        int water=Integer.MAX_VALUE;
        for(int i=0;i<landStartTime.length;i++){
            min1=Math.min(min1,landStartTime[i]+ landDuration[i]);
        }
         for(int i=0;i<waterStartTime.length;i++){
            min2=Math.min(min2,waterStartTime[i]+ waterDuration[i]);
        }
          for(int i=0;i<waterStartTime.length;i++){
            water=Math.min(water, Math.max(min1,waterStartTime[i])+waterDuration[i]);
          }
         for(int i=0;i<landStartTime.length;i++){
             land=Math.min(land, Math.max(min2,landStartTime[i])+landDuration[i]);
         }
         return Math.min(land,water);
       
        
    }
}