class TreeAncestor {
    int row;
    int col;
    int ancestor[][];
    public TreeAncestor(int n, int[] parent) {
    row=n;
    col = 32 - Integer.numberOfLeadingZeros(n);
    ancestor=new int[row][col];
    for(int[]ances:ancestor)
    Arrays.fill(ances,-1);
        for(int i=0;i<n;i++){
            ancestor[i][0]=parent[i];
        }
        for(int j=1;j<col;j++){
            for(int i=0;i<row;i++){
                if(ancestor[i][j-1]!=-1)
                ancestor[i][j]=ancestor[ancestor[i][j-1]][j-1];
            }
        }
    }
    
    public int getKthAncestor(int node, int k) {
        for(int i=0;i<col;i++){
            if((k&(1<<i))!=0)
            node=ancestor[node][i];
            if(node==-1)return -1;
        }
        return node;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */