class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int score=0;
        for(int i=0;i<n-1;i++){
            int first=s.charAt(i);
            int second=s.charAt(i+1);
            score+=Math.abs(first-second);

        }
        return score;
    }
}
