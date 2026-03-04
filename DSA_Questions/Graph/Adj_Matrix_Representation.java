// Adjacency matrix representation of graph

import java.util.Scanner;

public class Adj_Matrix_Representation{

    // TC - O(v)  SC - O(v * v)

    // undirected graph representation 
    public static void undirected_Graph(int adj[][], int e, Scanner sc){
                
        for(int i=0; i<e; i++){
            System.out.println("Enter edge");
            int x = sc.nextInt();
            int y = sc.nextInt();

            adj[x][y] = 1;
            adj[y][x] = 1;
            
        }

    }

    // directed graph representation 
    public static void directed_graph(int adj[][], int e, Scanner sc){

         for(int i=0; i<e; i++){
            System.out.println("Enter edge");
            int x = sc.nextInt();
            int y = sc.nextInt();

            adj[x][y] = 1;            
        }

    }

     // Weighted undirected graph representation 
    public static void weighted_Graph(int adj[][], int e,Scanner sc){
                
        for(int i=0; i<e; i++){
            System.out.println("Enter edge");
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println("Enter weight:");
            int w = sc.nextInt();

            adj[x][y] = w;
            adj[y][x] = w;
            
        }

    }

    public static void display(int adj[][]){

        for(int i=0; i<adj.length; i++){
            for(int j =0; j<adj[0].length; j++){

                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Matrix representation for undirected graph:");
        System.out.println("Enter number of vertices :");
        int v = sc.nextInt();

        System.out.println("Enter number of edges:");
        int e = sc.nextInt();

        int adj_Undirected [][] = new int[v+1][v+1];

        undirected_Graph(adj_Undirected, e,sc);

        display(adj_Undirected);


        // Directed graph representation 
         System.out.println("Matrix representation for directed graph:");
        System.out.println("Enter number of vertices :");
        int v2 = sc.nextInt();

        System.out.println("Enter number of edges:");
        int e2 = sc.nextInt();

        int adj_directed [][] = new int[v2+1][v2+1];

        directed_graph(adj_directed, e2,sc);

        display(adj_directed);


        // weighted undirected graph representation 
         System.out.println("Matrix representation for weighted undirected graph:");
        System.out.println("Enter number of vertices :");
        int v3 = sc.nextInt();

        System.out.println("Enter number of edges:");
        int e3 = sc.nextInt();

        int adj_weighted [][] = new int[v3+1][v3+1];

        weighted_Graph(adj_weighted, e3, sc);

        display(adj_weighted);


    }
}