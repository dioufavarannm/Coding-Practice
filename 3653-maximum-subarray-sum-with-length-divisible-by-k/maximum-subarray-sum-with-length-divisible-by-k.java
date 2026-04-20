class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long[] min = new long[k];
        Arrays.fill(min, Long.MAX_VALUE);
        min[0] = 0;

        long sum = 0, ans = Long.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int m = (i+1) % k;

            if(min[m] != Long.MAX_VALUE)
                ans = Math.max(ans, sum - min[m]);

            min[m] = Math.min(min[m], sum);
        }

        return ans;
    }
}