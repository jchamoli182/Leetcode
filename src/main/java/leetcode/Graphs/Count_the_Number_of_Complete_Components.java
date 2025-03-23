package leetcode.Graphs;

public class Count_the_Number_of_Complete_Components {
    
    public static void main(String[] args) {

        // time complexity O(n)
        // space complexity O(n)
        int n = 5;
        int edges[][] = {{0,1},{1,2},{3,4}};
        int ans = 0;
        int adj[][] = new int[n][n];
        for(int i=0;i<edges.length;i++){
            adj[edges[i][0]][edges[i][1]] = 1;
            adj[edges[i][1]][edges[i][0]] = 1;
        }

        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i, adj, visited);
                ans++;
            }
        }

        System.out.println(ans);
    }

    private static void dfs(int i, int[][] adj, boolean[] visited) {
        visited[i] = true;
        for(int j=0;j<adj.length;j++){
            if(adj[i][j] == 1 && !visited[j]){
                dfs(j, adj, visited);
            }
        }
    }
}
