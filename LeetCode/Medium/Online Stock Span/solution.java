class StockSpanner {
    Stack<int[]> st;
    public StockSpanner() {
        st=new Stack<int[]>();

    } 
    public int next(int price) {
        int span=1;
        while(!st.isEmpty() && price>=st.peek()[1]){
            span+=st.pop()[0];
        
        }  
        st.push(new int[]{span,price});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */