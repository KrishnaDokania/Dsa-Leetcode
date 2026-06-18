class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int max=0;
        for(int i=0;i<=heights.length;i++){
            int current=(i==heights.length)?0:heights[i];
        while(!st.isEmpty()&&heights[st.peek()]>current){
            int height=heights[st.pop()];
            int width=st.isEmpty()?i:i-st.peek()-1;
            max=Math.max(max,height*width);

        }
        st.push(i);
        }
        return max;
    
    }
}