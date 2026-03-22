class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>outer=new ArrayList<>();
        List<Integer>inner=new ArrayList<>();
        generate(1,n,k,inner,outer);
            return outer;
        }
        void generate(int index,int n,int k,List<Integer>inner,List<List<Integer>>outer){
            if(inner.size()==k){
                outer.add(new ArrayList<>(inner));
                return;
            }
            for(int i=index;i<=n;i++){
                inner.add(i);
                generate(i+1,n,k,inner,outer);
                inner.remove(inner.size()-1);
            }
    }
}