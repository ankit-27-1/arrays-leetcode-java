class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        ArrayList<String> str=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                if(map.get(list2[i])+i<min){
                    str.clear();
                    str.add(list2[i]);
                    min=map.get(list2[i])+i;
                }
                else if(map.get(list2[i])+i==min){
                    str.add(list2[i]);
                }
            }
        }
        String[] s=new String[str.size()];
        for(int i=0;i<str.size();i++){
            s[i]=str.get(i);
        }
        return s;
    }
}
