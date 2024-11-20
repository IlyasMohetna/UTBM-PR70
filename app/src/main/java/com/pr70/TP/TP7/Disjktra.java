package com.pr70.TP.TP7;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.Comparator;

class Dijkstra {

    public static Map<Node, Integer> shortestPath(Graph graph, Node startNode) {
        Map<Node, Integer> distances = new HashMap<>();
        Map<Node, Boolean> visited = new HashMap<>();
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (Node node : graph.nodes) {
            distances.put(node, Integer.MAX_VALUE);
            visited.put(node, false);
        }
        distances.put(startNode, 0);
        queue.add(startNode);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (visited.get(current)) continue;
            visited.put(current, true);
            

            for (Map.Entry<Node, Integer> neighborEntry : current.neighbors.entrySet()) {
                Node neighbor = neighborEntry.getKey();
                int edgeWeight = neighborEntry.getValue();

                if (!visited.get(neighbor)) {
                    int newDist = distances.get(current) + edgeWeight;
                    if (newDist < distances.get(neighbor)) {
                        distances.put(neighbor, newDist);
                        queue.add(neighbor);
                    }
                }
            }
        }

        return distances;
    }
}
