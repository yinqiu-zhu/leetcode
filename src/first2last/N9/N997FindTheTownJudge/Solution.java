package first2last.N9.N997FindTheTownJudge;


class Solution {
    public int findJudge(int N, int[][] trust) {

        if (N == 1 && (trust.length == 0 || trust == null)) return 0;
        if (trust == null || trust.length == 0) return -1;

        int[] personWhoTrustNobody = new int[N + 1];
        int[] personTrustedNumber = new int[N + 1];

        for (int i = 0; i < trust.length; i++){
            int[] temp = trust[i];
            personWhoTrustNobody[temp[0]] = -1;
            personTrustedNumber[temp[1]] ++;
        }

        int  x = 0;
        for (int i = 1; i <= N; i++){
            if (personWhoTrustNobody[i] == 0){
                x = i;
                break;
            }
        }
        return personTrustedNumber[x] == N - 1? x : -1;
    }
}
