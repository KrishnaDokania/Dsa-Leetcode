class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String>set=new HashSet<>(wordList);
        if(!set.contains(endWord))return 0;
        Queue<String>q=new LinkedList<>();
        q.offer(beginWord);
        if(set.contains(beginWord))set.remove(beginWord);
        int level=0;
        while(!q.isEmpty()){
            int newsize=q.size();
            for(int i=0;i<newsize;i++){
                String node=q.poll();
                if(node.equals(endWord))return level+1;
                List<String>neigh=neighbour(node,set);
                for(String word:neigh){
                    if(set.contains(word)){
                        q.offer(word);
                        set.remove(word);
                    }
                }
            }
            level++;
        }
            return 0;
    }
     public List<String>neighbour(String node,Set<String>set){
        List<String>list=new ArrayList<>();
        for(int j=0;j<node.length();j++){
            String prefix=node.substring(0,j);
            String suffix=node.substring(j+1,node.length());
                for(char i='a';i<='z';i++){
                    if(set.contains(prefix+i+suffix)){
                        list.add(prefix+i+suffix);
                    }
                }
        }
        return list;
    }
}