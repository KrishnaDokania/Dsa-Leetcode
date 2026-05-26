class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int edge[]:edges){
            int v=edge[0];
            int u=edge[1];
            map.put(v,map.getOrDefault(v,0)+1);
            map.put(u,map.getOrDefault(u,0)+1);
            if(map.get(v)==n)return v;
            if(map.get(u)==n)return u;
        }
        return 0;
    }
}