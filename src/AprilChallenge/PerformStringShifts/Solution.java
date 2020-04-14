package AprilChallenge.PerformStringShifts;

class Solution {
    public String stringShift(String s, int[][] shift) {
        int steps = 0;
        final int LEN = s.length();
        for (int[] sh : shift){
            steps += sh[0] == 1? -sh[1] : sh[1];
        }
        steps = steps % LEN;
        if (steps < 0) steps = LEN + steps;

        return s.substring(steps,LEN) + s.substring(0,steps);
    }

    public static void main(String[] args) {

        Solution one = new Solution();

        String ts = "abcdefg";
        int[][] tst = {{1,1},{1,1},{0,2}};

        System.out.printf(one.stringShift(ts,tst));
    }
}