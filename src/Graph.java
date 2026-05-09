import java.util.*;

public class Graph {
    //Mapping Vertex ID
    private final Map<Integer,List<Edge>> adjList;
    private final Map<Integer, Vertex> vertices;

    public Graph(){
        this.adjList = new HashMap<>();
        this.vertices = new HashMap<>();
    }

    public void addVertex(Vertex v){
        vertices.putIfAbsent(v.getId(),v);
        adjList.putIfAbsent(v.getId(), new ArrayList<>());
    }

    public void addEdge(int from, int to){
        //Ensuring if vertices exist
        if(!vertices.containsKey(from)){
            addVertex(new Vertex(from));
        }
        if(!vertices.containsKey(to)){
            addVertex(new Vertex(to));
        }

        adjList.get(from).add(new Edge(from,to));
    }

    public void printGraph(){
        for(int id: adjList.keySet()){
            System.out.print(id + ": ");
            for(Edge edge : adjList.get(id)){
                System.out.print(edge.getDestination() + " ");
            }
            System.out.println();
        }
    }

    //Breadth-First Search
    public void bfs(int start){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current + " ");

            for(Edge edge : adjList.getOrDefault(current, new ArrayList<>())){
                if(!visited.contains(edge.getDestination())){
                    visited.add(edge.getDestination());
                    queue.add(edge.getDestination());
                }
            }
        }
    }

    //Depth-First Search
    public void dfs(int start){
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start,visited);
    }

    private void dfsHelper(int current, Set<Integer> visited){
        visited.add(current);
        System.out.print(current + " ");

        for(Edge edge : adjList.getOrDefault(current, new ArrayList<>())){
            if(!visited.contains(edge.getDestination())){
                dfsHelper(edge.getDestination(),visited);
            }
        }
    }
}
