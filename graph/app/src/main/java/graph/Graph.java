package graph;

import java.util.*;

public class Graph{

    private Map<Vertex, List<Vertex>> adjVertices;
    private int size;

    public Graph() {
        this.adjVertices = new HashMap<>();
    }

    public long getSize() {
        return size;
    }

    public Vertex addNode(String value) {
        Vertex vertex = new Vertex(value);
        adjVertices.put(vertex, new ArrayList<>());
        size++;
        return vertex;
    }

    public void addEdge(String value1, String value2) {
//        if (!adjVertices.containsKey(value1) && !adjVertices.containsKey(value2)) {
//            return;
//        }

        Vertex vertex1 = new Vertex(value1);
        Vertex vertex2 = new Vertex(value2);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
    }

    public void addEdge(String firstNode, String secondValue, int weight){
        if (!adjVertices.containsKey(firstNode) || !adjVertices.containsKey(secondValue)) {
            return;
        }
        adjVertices.get(firstNode).add(new Vertex(secondValue, weight));
        adjVertices.get(secondValue).add(new Vertex(firstNode, weight));
    }

    public List<Vertex> getNeighbors(String value) {
//        if (!adjVertices.containsKey(value)) {
//            return null;
//        }
        return adjVertices.get(new Vertex(value));
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

    // ******************************************** Challenge 36 *******************************************************

    public Set<String> bFT(String root){
        Set<String> nods = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            String s = queue.poll();
            List<Vertex> vertexNeighbours = getNeighbors(String.valueOf(s));
            if(vertexNeighbours != null) {
                for (Vertex vertex : vertexNeighbours) {
                    if (!nods.contains(vertex.getValue()))
                            queue.add(vertex.getValue());
                }
            }
            nods.add(s);
        }
        return nods;
    }
}
