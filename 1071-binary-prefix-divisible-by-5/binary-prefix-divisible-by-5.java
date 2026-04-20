class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int rem = 0;

        for(int n : nums){
            rem = (rem * 2 + n) % 5;
            res.add(rem == 0);
        }

        return res;
    }
}