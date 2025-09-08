class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(s.isEmpty()) return true;
        if(n1>n2) return false;
        int j=0;
        for(int i=0;i<n2;i++){
            if(t.charAt(i)==s.charAt(j)){
                 j++;
                if(j==n1){
                    return true;
                }
               
            }
        }
        return false;
    }
}
