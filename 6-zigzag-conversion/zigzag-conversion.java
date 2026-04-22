class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++) rows[i] = new StringBuilder();

        int cur = 0, dir = 1;

        for(char c : s.toCharArray()){
            rows[cur].append(c);
            if(cur==0) dir=1;
            else if(cur==numRows-1) dir=-1;
            cur += dir;
        }

        StringBuilder res = new StringBuilder();
        for(StringBuilder r : rows) res.append(r);

        return res.toString();
    }
}