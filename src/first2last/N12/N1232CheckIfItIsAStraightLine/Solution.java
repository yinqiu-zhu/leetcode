package first2last.N12.N1232CheckIfItIsAStraightLine;

class Solution {

    public boolean checkStraightLine(int[][] coordinates) {

        // according to the first 2 elements, we get a equation y =  nx + a;

//        if (coordinates == null || coordinates.length < 2 )
//            return false;
        float n;
        if (coordinates[0][0] - coordinates[1][0] == 0) n = 0;
        else
            n = (coordinates[0][1] - coordinates[1][1]) / (coordinates[0][0] - coordinates[1][0]);
        float a = coordinates[0][1] - coordinates[0][0] * n;

        for ( int i = 2; i < coordinates.length; i++){
            if (coordinates[i][1] != coordinates[i][0] * n + a)
                return false;
        }
        return true;
    }
}