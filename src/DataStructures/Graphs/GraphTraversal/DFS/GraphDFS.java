package DataStructures.Graphs.GraphTraversal.DFS;

import java.util.*;

public class GraphDFS {

    // Recursive DFS function
    private void dfsRec(int node, boolean[] visited,
                        ArrayList<ArrayList<Integer>> adjList,
                        ArrayList<Integer> ans) {

        visited[node] = true;
        ans.add(node);

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfsRec(neighbor, visited, adjList, ans);
            }
        }
    }

    // DFS Traversal function
    ArrayList<Integer> dfsTraversal(int n, ArrayList<ArrayList<Integer>> adjList) {

        boolean[] visited = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();

        // Handle disconnected graph
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfsRec(i, visited, adjList, ans);
            }
        }

        return ans;
    }
}

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes and edges: ");
        int n = sc.nextInt();
        int e = sc.nextInt();

        // Adjacency list
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Input edges
        for (int i = 1; i <= e; i++) {
            System.out.print("Enter edge " + i + " : ");
            int u = sc.nextInt();
            int v = sc.nextInt();

            adjList.get(u).add(v);

            // If undirected graph, add below line
            // adjList.get(v).add(u);
        }

        GraphDFS df = new GraphDFS();
        ArrayList<Integer> ans = df.dfsTraversal(n, adjList);

        System.out.println("DFS Traversal:");
        for (int i : ans) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}