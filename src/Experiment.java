import java.util.Random;

public class Experiment {

    public void runMultipleTests(){
        int[] sizes = {10,30,100};

        for(int size : sizes){
            System.out.println("Testing Graph with " + size + " Vertices");

            Graph g = new Graph();
            runTraversals(g,size);
        }
    }

    private Graph generateRandomGraph(int size){
        Graph g = new Graph();
        Random rand = new Random();

        //Adding all vertices
        for(int i = 0;i<size;i++){
            g.addVertex(new Vertex(i));
        }

        //Adding random edges
        for(int i =0; i< size; i++){
            int target1 = rand.nextInt(size);
            int target2 = rand.nextInt(size);
            g.addEdge(i,target1);
            g.addEdge(i,target2);
        }
        return g;
    }

    private void runTraversals(Graph g, int size) {
        //Small graph
        boolean showPath = (size <= 10);

        //BFS execution
        if (showPath) {
            System.out.print("BFS Traversal Order: ");
        }
        long startBfs = System.nanoTime();
        g.bfs(0);
        long endBfs = System.nanoTime();
        if (showPath) {
            System.out.println();
        }

        //DFS execution
        if (showPath) {
            System.out.print("DFS Traversal Order: ");
        }
        long startDfs = System.nanoTime();
        g.dfs(0);
        long endDfs = System.nanoTime();
        if (showPath) {
            System.out.println();
        }
        printResults(size, (endBfs - startBfs), (endDfs - startDfs));
    }

        public void printResults ( int size, long bfsTime, long dfsTime){
            System.out.println("\nPerformance Statistics (" + size + "nodes):");
            System.out.println(" > BFS Execution Time: " + bfsTime + " ns");
            System.out.println(" > DFS Execution Time: " + dfsTime + " ns");
        }
}
