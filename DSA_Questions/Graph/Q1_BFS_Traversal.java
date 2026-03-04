
import java.util.*;

public class Q1_BFS_Traversal {
    
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

    // TC - O(V + 2E) = O(V + E)
    //SC - O(3V) = O(V)
    // BFS Traversal
    public static ArrayList<Integer> bfsGraph(int v, ArrayList<ArrayList<Integer>> adj){

        // List to store traversed nodes 
        ArrayList<Integer> bfs = new ArrayList<>();

        // Array to keep track of visited and non visited nodes
        boolean visit[] = new boolean[v+1];

        // Queue for bfs traversal
        Queue<Integer> q = new LinkedList<>();

        // Add first node to traverse (root node)
        q.add(1);

        visit[1] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();

            bfs.add(node);

            for(Integer n : adj.get(node)){

                if(visit[n] == false){
                    visit[n] = true;
                    q.add(n);
                }
            }
        }

        return bfs;

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

        System.out.println("BFS traversal of grapg : "+bfsGraph(v, adj));

    }

}
