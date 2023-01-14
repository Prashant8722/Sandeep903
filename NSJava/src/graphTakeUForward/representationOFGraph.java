package graphTakeUForward;

import java.util.Scanner;

public class representationOFGraph {
    //Method 1: adjacency matrix ( Index 1 based Indexing ) or Use ArrayList to represent  adjacency matrix
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter vertex and Edges for graph respectively:");
        int vertex = sc.nextInt();
        int edge = sc.nextInt();

        //Declare the Adjacency Matrix
        int i = vertex + 1;
        int[][] adj = new int[i][i];

        //Take Edges as input
        System.out.println("Enter Vertices pair (like=> 1 2) number which is connected with edge:");
        for(int k = 0; k< edge ;k++)
        {
            int firstVertex = sc.nextInt();
            int secondVertex = sc.nextInt();
            adj[firstVertex][secondVertex] = 1;
            adj[secondVertex][firstVertex] = 1;
        }

        for(int k = 0; k< i ;k++) {
            for(int l= 0; l< i ;l++) System.out.print(adj[k][l] + " ");
            System.out.println();
        }

    }
}
