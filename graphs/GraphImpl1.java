package graphs;

import java.util.ArrayList;

public class GraphImpl1 {
    static class Edge {
        int src;
        int dst;

        Edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }

    static void buildGraph(ArrayList<Edge> graph[]) {
        // first we need to init all the Array at graph indexes
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }


    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4]; // vertex size is 4
        buildGraph(graph);
    }

}
