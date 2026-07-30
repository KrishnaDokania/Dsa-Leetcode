class Solution {
    public int assignEdgeWeights(int[][] edges) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<=edges.length+1;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int maxdepth=depth(adj,1,-1);
        return (int)power(2,maxdepth-1);
    }
    long power(long b,int e){
        int mod=1000000007;
        long ans=1;
        while(e>0){
            if((e&1)==1){
            ans=(ans*b)%mod;
            }
            b=(b*b)%mod;
            e=e>>1;
        }
        return ans;
    }
    int depth(List<List<Integer>>adj,int root,int parent){
        int max=0;
        for(int neigh:adj.get(root)){
            if(neigh==parent)continue;
            max=Math.max(max,depth(adj,neigh,root)+1);
        }
        return max;
    }
}