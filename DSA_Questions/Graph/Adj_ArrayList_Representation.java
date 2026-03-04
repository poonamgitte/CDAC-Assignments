// Adjacency list representation of graph 

import java.util.*;

public class Adj_ArrayList_Representation {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Undirected graph representation

        System.out.println("List representation for undirected graph:");
        System.out.println("Enter number of vertices :");
        int v = sc.nextInt();

        System.out.println("Enter number of edges:");
        int e = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

        undirected_graph(adj, e, sc);
        display(adj, v);
    }
}
