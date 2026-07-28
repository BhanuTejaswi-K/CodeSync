class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i<=heights.length;i++){
            int currheight=i==heights.length ? 0:heights[i];
           while(!stack.isEmpty() && currheight<heights[stack.peek()]) {
            int index=stack.pop();
        int width = stack.isEmpty() ? i : i - stack.peek() - 1;
        int area = heights[index] * width;
            maxarea=Math.max(maxarea,area);
           }
           stack.push(i);
        }
        return maxarea;
    }
}