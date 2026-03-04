// DFS traversal of graph (using recursion)

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_DFS_Traversal {
    

    public static void undirected_graph(ArrayList<ArrayList<Integer>> adj, int e, Scanner sc) {

        for (int i = 0; i < e; i++) {

            System.out.println("Enter edge (u,v):");

            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
    }

    // Display list representation
    public static void display(ArrayList<ArrayList<Integer>> adj, int v) {

        for (int i = 1; i <= v; i++) {

            System.out.print(i + " -> ");

            for (int node : adj.get(i)) {
                System.out.print(node + " ");
            }

            System.out.println();
        }
    }

    //DFS traversal
    // TC - O(V+E)
    //SC - O(V)

    public static ArrayList<Integer> dfsGraph(int v, ArrayList<ArrayList<Integer>> adj){


        ArrayList<Integer> dfs = new ArrayList<>();

        boolean visit[] = new boolean[v+1];

        dfs_helper(1,adj, visit, dfs);

        return dfs;
    }

    public static void dfs_helper(int node , ArrayList<ArrayList<Integer>> adj, boolean[] visit, ArrayList<Integer>dfs){

        visit[node] = true;
        dfs.add(node);

        for(Integer it : adj.get(node)){

            if(visit[it] == false){
                dfs_helper(it, adj, visit, dfs);
            }
        }
    }


    public static void main(String[] args) {
        
         int v = 4 ;
    
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(3).add(4);
        adj.get(4).add(3);

        adj.get(2).add(4);
        adj.get(4).add(2);

        display(adj, v);

        System.out.println("DFS Representation of graph: "+dfsGraph(v, adj));
    }
}
