class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList=new ArrayList<List<Integer>>();

        for(int i=0;i<n;i++){
           adjList.add(new ArrayList<Integer>());
        }
        for(int edge[]:edges){
            int u=edge[0],v=edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        boolean[] visited=new boolean[n];
        return dfs(adjList,visited,source,destination);
    }
    public boolean dfs( List<List<Integer>> adjList,boolean[] visited,int node,int destination){
        if(node==destination) return true;
        visited[node]=true;
        for(int i:adjList.get(node)){
            if(!visited[i]){
                if(dfs(adjList,visited,i,destination)) return true;
            }
        }
    return false;
    }

}