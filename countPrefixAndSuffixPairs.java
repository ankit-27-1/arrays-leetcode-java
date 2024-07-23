class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i]) && i<j){
                    ans++;
                }
            }
        }
        return ans;
    }
    static boolean solve(String s,String t){
        if(s.length()>=t.length()){
            return false;
        }
        String suf=t.substring(0,s.length());
        String pre=t.substring(t.length()-s.length(),t.length());
        if(s.equals(suf) && s.equals(pre)){
            return true;
        }
        return false;
    }
}
