package graph;

import java.util.*;

public class Graph{

    private Map<Vertex, LinkedList<Vertex>> adjVertices;
    private long size;

    public Graph() {
        adjVertices = new HashMap<>();
    }

    public long getSize() {
        return size;
    }

    public Vertex addNode(String value) {
        Vertex vertex = new Vertex(value);
        adjVertices.put(vertex, new LinkedList<>());
        size++;
        return vertex;
    }

    public void addEdge(String firstNode, String secondValue) {
        if (!adjVertices.containsKey(firstNode) || !adjVertices.containsKey(secondValue)) {
            return;
        }
        adjVertices.get(firstNode).add(new Vertex(secondValue));
        adjVertices.get(secondValue).add(new Vertex(firstNode));
    }

    public void addEdge(String firstNode, String secondValue, int weight){
        if (!adjVertices.containsKey(firstNode) || !adjVertices.containsKey(secondValue)) {
            return;
        }
        adjVertices.get(firstNode).add(new Vertex(secondValue, weight));
        adjVertices.get(secondValue).add(new Vertex(firstNode, weight));
    }

    public LinkedList<Vertex> getNeighbors(String value) {
        if (!adjVertices.containsKey(value)) {
            return null;
        }
        return adjVertices.get(value);
    }

    public Set<Vertex> getAdjVertices() {
        return adjVertices.keySet();
    }

    String getNodes() {
        if(size ==0)
            return null;
        StringBuilder strBuilder = new StringBuilder();
        for (Vertex vertex : adjVertices.keySet()) {
            strBuilder.append(vertex);
            strBuilder.append(adjVertices.get(vertex));
        }
        return strBuilder.toString();
    }
}
