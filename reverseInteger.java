class Solution {
    public int reverse(int x) {
        ArrayList<Integer> list=new ArrayList<>();
        boolean ans=true;
        if(x<0){
            ans=false;
        }
        x=Math.max(x,-1*x);
        while(x>0){
            list.add(x%10);
            x=x/10;
        }
        long num=0;
        for(int i=0,j=list.size()-1;i<list.size();i++,j--){
            num=num+(int)(list.get(i)*Math.pow(10,j));
        }
        if(Integer.MAX_VALUE<num){
            return 0;
        }
        if(ans==false){
            return -1*(int)num;
        }
        return (int)num;
    }
}
