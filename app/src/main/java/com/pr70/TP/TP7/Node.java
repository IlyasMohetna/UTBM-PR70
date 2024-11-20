package com.pr70.TP.TP7;

import java.util.*;

class Node {
    String name;
    Map<Node, Integer> neighbors;

    Node(String name) {
        this.name = name;
        this.neighbors = new HashMap<>();
    }

    void addNeighbor(Node neighbor, int distance) {
        this.neighbors.put(neighbor, distance);
    }
}

class Graph {
    List<Node> nodes;

    Graph() {
        this.nodes = new ArrayList<>();
    }

    Node addNode(String name) {
        Node newNode = new Node(name);
        nodes.add(newNode);
        return newNode;
    }

    void addEdge(Node from, Node to, int distance) {
        from.addNeighbor(to, distance);
        to.addNeighbor(from, distance);
    }
}
