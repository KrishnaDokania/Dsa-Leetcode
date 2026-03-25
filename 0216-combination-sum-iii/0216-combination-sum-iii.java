class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>>result=new ArrayList<>();
         List<Integer>inner=new ArrayList<>();
         generate(k,n,1,inner,result);
         return result;
    }
    void generate(int k,int n,int index,List<Integer>inner, List<List<Integer>>result){
        if(inner.size()==k && n==0){
            result.add(new ArrayList<>(inner));
            return;
        }
        if(inner.size()==k&&n!=0)return;
        for(int i=index;i<=9;i++){
            if(inner.size()!=0&&inner.get(inner.size()-1)==i)continue;
            inner.add(i);
            generate(k,n-i,i+1,inner,result);
            inner.remove(inner.size()-1);
        }
    }
}