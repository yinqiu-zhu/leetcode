package first2last.N2.N278FirstBadVersion;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution implements VersionControl {
    @Override
    public boolean isBadVersion(int x) {
        return false;
    }
    public int firstBadVersion(int n) {

        int m = 1;
        while (m < n){
            int mid = m + (n - m)/2;
            if (isBadVersion(mid)){
                n = mid;
            }
            else {
                m = mid + 1;
            }
        }

        return m;
    }
}