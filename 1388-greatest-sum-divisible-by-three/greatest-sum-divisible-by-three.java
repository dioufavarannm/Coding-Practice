class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        int r1a=10001,r1b=10001,r2a=10001,r2b=10001;

        for(int n: nums){
            sum += n;
            if(n%3==1){
                if(n<r1a){ r1b=r1a; r1a=n; }
                else if(n<r1b) r1b=n;
            }
            else if(n%3==2){
                if(n<r2a){ r2b=r2a; r2a=n; }
                else if(n<r2b) r2b=n;
            }
        }

        if(sum%3==1) sum -= Math.min(r1a, r2a+r2b);
        else if(sum%3==2) sum -= Math.min(r2a, r1a+r1b);

        return sum;
    }
}