class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
int earliestLandFinish = Integer.MAX_VALUE;
int earliestWaterFinish = Integer.MAX_VALUE;

for (int i = 0; i < landStartTime.length; i++) {
    earliestLandFinish =
        Math.min(earliestLandFinish,
                 landStartTime[i] + landDuration[i]);
}

for (int i = 0; i < waterStartTime.length; i++) {
    earliestWaterFinish =
        Math.min(earliestWaterFinish,
                 waterStartTime[i] + waterDuration[i]);
}

int landThenWater = Integer.MAX_VALUE;
for (int i = 0; i < waterStartTime.length; i++) {
    landThenWater = Math.min(
        landThenWater,
        Math.max(earliestLandFinish, waterStartTime[i])
            + waterDuration[i]
    );
}

int waterThenLand = Integer.MAX_VALUE;
for (int i = 0; i < landStartTime.length; i++) {
    waterThenLand = Math.min(
        waterThenLand,
        Math.max(earliestWaterFinish, landStartTime[i])
            + landDuration[i]
    );
}

return Math.min(landThenWater, waterThenLand);
    }
}