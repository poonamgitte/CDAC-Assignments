// Adjcency List representation of graph 

import java.util.*;

class Edge{
    int dest;
    int weight;

    public Edge(int d, int w){
        this.dest = d;
        this.weight = w;
    }
}

public class Adj_List_Representation {

    //TC - O(E) SC - O(V+E)
    // Undirected graph representation
    public static void undirected_Graph(ArrayList<Integer> adj[], int e,Scanner sc) {


        for (int i = 0; i < e; i++) {

            System.out.println("Enter edge:");

            int u = sc.nextInt();
            int v = sc.nextInt();

            if (u < 1 || u >= adj.length || v < 1 || v >= adj.length) {
                System.out.println(" Invalid vertex! Enter between 1 and " + (adj.length - 1));
                i--;
                continue;
            }

            adj[u].add(v);
            adj[v].add(u);
        }
    }

    //TC - O(E) SC - O(V+E)
    // directed graph representation
    public static void directed_Graph(ArrayList<Integer> adj[], int e, Scanner sc ) {


        for (int i = 0; i < e; i++) {

            System.out.println("Enter edge:");

            int u = sc.nextInt();
            int v = sc.nextInt();

            if (u < 1 || u >= adj.length || v < 1 || v >= adj.length) {
                System.out.println(" Invalid vertex! Enter between 1 and " + (adj.length - 1));
                i--;
                continue;
            }

            adj[u].add(v);
        }
    }

    //TC - O(E) SC - O(V+E)
    // Weighted undirected graph adjacency List representation
    public static void weighted_graph(ArrayList<Edge>adj[], int e, Scanner sc){

        for(int i= 0; i<e; i++){
            System.out.println("Enter edge (u,v):");

            int u = sc.nextInt();
            int v = sc.nextInt();

            System.out.println("Enter weight:");
            int w = sc.nextInt();

            adj[u].add(new Edge(v, w));
            adj[v].add(new Edge(u, w));  // for directed graph do not add v->u
        }
    }

   // TC - O(V+E)  SC - O(1)
    // display list representation
    public static void display(ArrayList<Integer> adj[], int v) {

        for (int i = 1; i <= v; i++) {

            System.out.print(i + " -> ");

            for (int node : adj[i]) {
                System.out.print(node + " ");
            }

            System.out.println();
        }
    }

    //Display weighted representation
    public static void display_Weighted(ArrayList<Edge>adj[], int v){

        for(int i = 1; i<= v; i++){
            System.out.print(i + " -> ");

            for(Edge edge : adj[i]){
                System.out.print("("+edge.dest+","+edge.weight+") ");
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

        @SuppressWarnings("unchecked")
        ArrayList<Integer> adj_undirected[] = new ArrayList[v + 1];

        for (int i = 1; i <= v; i++) {

            adj_undirected[i] = new ArrayList<>();
        }

        undirected_Graph(adj_undirected, e, sc);
        display(adj_undirected, v);


        // Direceted graph representation

        System.out.println("List representation for directed graph:");
        System.out.println("Enter number of vertices :");
        int v2 = sc.nextInt();

        System.out.println("Enter number of edges:");
        int e2 = sc.nextInt(); 

        @SuppressWarnings("unchecked")
        ArrayList<Integer> adj_directed[] = new ArrayList[v2+1];

        for(int i=1; i<= v2 ; i++){
            adj_directed[i] = new ArrayList<>();
        }

        directed_Graph(adj_directed, e2, sc);
        display(adj_directed, v2);


        // Weighted undirected graph representation 
        System.out.println("List representation for weighted undirected graph:");
        System.out.println("Enter number of vertices :");
        int v3 = sc.nextInt();

        System.out.println("Enter number of edges:");
        int e3 = sc.nextInt(); 

        @SuppressWarnings("unchecked")
        ArrayList<Edge> adj_Weighted[] = new ArrayList[v3+1];

        for(int i=1; i <= v3; i++){
            adj_Weighted[i] = new ArrayList<>();
        }

        weighted_graph(adj_Weighted, e3, sc);
        display_Weighted(adj_Weighted, v3);
    }
}
