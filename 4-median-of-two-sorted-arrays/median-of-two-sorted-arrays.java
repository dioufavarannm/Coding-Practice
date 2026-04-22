class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
        if(a.length > b.length) return findMedianSortedArrays(b, a);

        int m = a.length, n = b.length;
        int l = 0, r = m;

        while(l <= r){
            int i = (l + r) / 2;
            int j = (m + n + 1) / 2 - i;

            int maxL1 = (i == 0) ? Integer.MIN_VALUE : a[i-1];
            int minR1 = (i == m) ? Integer.MAX_VALUE : a[i];

            int maxL2 = (j == 0) ? Integer.MIN_VALUE : b[j-1];
            int minR2 = (j == n) ? Integer.MAX_VALUE : b[j];

            if(maxL1 <= minR2 && maxL2 <= minR1){
                if((m+n)%2==0)
                    return (Math.max(maxL1,maxL2)+Math.min(minR1,minR2))/2.0;
                else
                    return Math.max(maxL1,maxL2);
            }
            else if(maxL1 > minR2) r = i - 1;
            else l = i + 1;
        }

        return 0;
    }
}