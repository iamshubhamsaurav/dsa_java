package graphs;

import java.util.ArrayList;

/**
 * GraphImplWithoutEdegeClass
 * This implementation does not contain an Edge class. We are directly storing the adjacent node (i.e dest).
 * The reason being that the index of graph is the source itself.
 */

public class GraphImplWithoutEdegeClass {

    static void addEdge(ArrayList<ArrayList<Integer>> graph, int v, int u) {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Source: " + i + " -> Destinations: ");
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print(graph.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());
        }

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);

        printGraph(graph);
    }
}