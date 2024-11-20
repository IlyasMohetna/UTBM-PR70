package com.pr70.TP.TP7;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXEMPLE 1 : Graphe simple ===");
        Graph graph1 = new Graph();

        Node belfort = graph1.addNode("Belfort");
        Node besancon = graph1.addNode("Besançon");
        Node lyon = graph1.addNode("Lyon");
        Node mulhouse = graph1.addNode("Mulhouse");
        Node strasbourg = graph1.addNode("Strasbourg");

        graph1.addEdge(belfort, besancon, 100);
        graph1.addEdge(mulhouse, strasbourg, 150);
        graph1.addEdge(besancon, mulhouse, 130);
        graph1.addEdge(mulhouse, belfort, 30);
        graph1.addEdge(strasbourg, lyon, 480);
        graph1.addEdge(besancon, lyon, 200);

        Map<Node, Integer> distances1 = Dijkstra.shortestPath(graph1, belfort);

        for (Map.Entry<Node, Integer> entry : distances1.entrySet()) {
            if (!entry.getKey().equals(belfort)) {
                System.out.println("Distance de Belfort à " + entry.getKey().name + ": " + entry.getValue());
            }
        }
        

        System.out.println("\n=== EXEMPLE 2 : Graphe complexe avec cycle ===");
        Graph graph2 = new Graph();

        Node A = graph2.addNode("A");
        Node B = graph2.addNode("B");
        Node C = graph2.addNode("C");
        Node D = graph2.addNode("D");
        Node E = graph2.addNode("E");

        graph2.addEdge(A, B, 2);
        graph2.addEdge(A, C, 5);
        graph2.addEdge(B, C, 1);
        graph2.addEdge(B, D, 3);
        graph2.addEdge(C, D, 2);
        graph2.addEdge(D, E, 4);

        Map<Node, Integer> distances2 = Dijkstra.shortestPath(graph2, A);

        for (Map.Entry<Node, Integer> entry : distances2.entrySet()) {
            System.out.println("Distance de A à " + entry.getKey().name + ": " + entry.getValue());
        }

        System.out.println("\n=== EXEMPLE 3 : Graphe asymétrique ===");
        Graph graph3 = new Graph();

        Node X = graph3.addNode("X");
        Node Y = graph3.addNode("Y");
        Node Z = graph3.addNode("Z");
        Node W = graph3.addNode("W");

        graph3.addEdge(X, Y, 7);
        graph3.addEdge(Y, Z, 3);
        graph3.addEdge(Z, W, 2);
        graph3.addEdge(X, Z, 10);
        graph3.addEdge(Y, W, 8);

        Map<Node, Integer> distances3 = Dijkstra.shortestPath(graph3, X);

        for (Map.Entry<Node, Integer> entry : distances3.entrySet()) {
            System.out.println("Distance de X à " + entry.getKey().name + ": " + entry.getValue());
        }
    }
}
