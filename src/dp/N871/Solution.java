package dp.N871;


import java.util.ArrayList;
import java.util.List;

class Solution {

    int[][] stations;

    public int minRefuelStops(int target, int startFuel, int[][] stations) {

        if (target == 0 || startFuel == target) return 0;
        if ( stations == null || stations.length == 0) return -1;

        this.stations = new int[stations.length + 2][3];
        int  end = 0;
        this.stations[0] = new int[] {0,startFuel,startFuel};

        for(; end < stations.length && stations[end][0] <= target; end ++){
            this.stations[end+1][0] = stations[end][0];
            this.stations[end+1][1] = stations[end][1];
            this.stations[end+1][2] = this.stations[end][2] + stations[end][1];
            if (this.stations[end][])
        }
        this.stations[end+1][0] = target;
        this.stations[end+1][1] = 0;
        this.stations[end+1][2] = this.stations[end][2];

        {
            for (int[] a : this.stations){
                for (int b: a)
                    System.out.println(b);
                System.out.println( );
            }
        }

        return dp(end+1, target);
    }

    public int dp(int pos, int target){

        if (stations[pos][2] < target) return -1;
        if (pos ==  0) return 0;

        target = stations[pos][0];

        for (pos--;pos >= 0 && stations[pos][2] >= target; pos--){
            if (target - stations[pos][1] <= stations[pos][1] )
                target = stations[pos][1];
            else target = target - stations[pos][1];
            int temp = dp(pos, target);
            if (temp >= 0) res = Math.min(res, temp);
        }
        return res == Integer.MAX_VALUE? -1 : res+1;
    }

    public static void main(String[] args) {
        int[][] stat = {{10,60},{20,30},{30,30},{60,40}};
        Solution one= new Solution();
        System.out.println(one.minRefuelStops(100,10,stat));
    }
}
