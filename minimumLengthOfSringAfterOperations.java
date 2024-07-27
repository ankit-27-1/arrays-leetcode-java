class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int p=map.get(s.charAt(i));
                map.put(s.charAt(i),p+1);
                if(map.get(s.charAt(i))==3){
                    map.put(s.charAt(i),1);
                    count++;
                }
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        return s.length()-(count*2);
    }
}
