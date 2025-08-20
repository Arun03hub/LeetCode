class Solution {
    public int[] beautifulArray(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        while(ans.size()<n){
            ArrayList<Integer> temp=new ArrayList<>();
            //Even number
            for(int i=0;i<ans.size();i++){
                int val=ans.get(i)*2;
                if(val<=n){
                    temp.add(val);
                }
            }
            //Odd number
            for(int i=0;i<ans.size();i++){
                int val=ans.get(i)*2-1;
                if(val<=n){
                    temp.add(val);
                }
            }
            ans=temp;
        }
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}
