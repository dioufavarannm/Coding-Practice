class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0) return res;

        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(res, digits, "", 0, map);
        return res;
    }

    void backtrack(List<String> res, String d, String cur, int i, String[] map){
        if(i == d.length()){
            res.add(cur);
            return;
        }

        String letters = map[d.charAt(i)-'0'];
        for(char c : letters.toCharArray())
            backtrack(res, d, cur + c, i+1, map);
    }
}