package DataStructures.Graphs.GraphTraversal.BFS;

import java.util.*;

public class GraphBFS {
    int V;

    GraphBFS(int v){
        this.V = v;
    }

    ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>>adjList){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);//start from zero
        visited[0] = true;
        while(!q.isEmpty()){
            int front = q.poll();
            ans.add(front);
            for(int neighbour : adjList.get(front)) {
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        return ans;
    }
}

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes and edges: ");
        int n = sc.nextInt();//nodes
        int e = sc.nextInt();//edges

        //Adjacency list
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++) {
            adjList.add(new ArrayList<>());
        }

        //Add edges in the graph and creating adjList
        for(int i=1;i<=e;i++) {
            System.out.print("enter edge " + i + " : ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
        }

        GraphBFS bf = new GraphBFS(n);
        ArrayList<Integer> ans = bf.bfsTraversal(adjList);
        for(int i : ans) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}