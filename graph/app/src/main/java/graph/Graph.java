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

    public void addEdge(String value1, String value2, int weight){
//        if (!adjVertices.containsKey(firstNode) || !adjVertices.containsKey(secondValue)) {
//            return;
//        }

        Vertex vertex1 = new Vertex(value1, weight);
        Vertex vertex2 = new Vertex(value2, weight);

        adjVertices.get(vertex1).add(vertex2);
        adjVertices.get(vertex2).add(vertex1);
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

    // ******************************************** Challenge 37 *******************************************************


    public int businessTrip(Graph graph, String[] cities) {
        int cost = 0;
        for (int i = 0; i < cities.length- 1; i++) {
            for (Vertex vertex : graph.getNeighbors(cities[i])) {
                if (Objects.equals(cities[i+1], vertex.getValue())) {
                    cost += vertex.getWeight();
                }
            }
        }
        return cost;
    }

    // ******************************************** Challenge 38 *******************************************************

    public List<String> depthFirst(Vertex vertex) {

        List<String> visited = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.add(vertex.getValue());

        while (!stack.isEmpty()) {
            String str = stack.pop();
            if (!visited.contains(str)) {
                visited.add(str);
                for (Vertex v : getNeighbors(str)) {
                    stack.add(v.getValue());
                }
            }
        }
        return visited;
    }
}
