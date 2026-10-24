class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {
        int[] sum = {31, 28, 31, 30, 31, 30,
                     31, 31, 30, 31, 30, 31};

        int aa = convert(arriveAlice, sum);
        int al = convert(leaveAlice, sum);
        int ba = convert(arriveBob, sum);
        int bl = convert(leaveBob, sum);

        int start = Math.max(aa, ba);
        int end = Math.min(al, bl);

        if (start > end) return 0;
        return end - start + 1;
    }

    private int convert(String date, int[] sum) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        for (int i = 0; i < month - 1; i++) {
            day += sum[i];
        }

        return day;
    }
}