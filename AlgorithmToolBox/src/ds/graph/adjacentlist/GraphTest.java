package ds.graph.adjacentlist;

import java.util.ArrayList;

public class GraphTest {

	public static void main(String[] args) {
	    // Create the graph
	    int V = 5;
	    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

	    for (int i = 0; i < V; i++)
	      am.add(new ArrayList<Integer>());
	    
	    // Add edges
	    Graph.addEdge(am, 0, 1);
	    Graph.addEdge(am, 0, 2);
	    Graph.addEdge(am, 0, 3);
	    Graph.addEdge(am, 1, 2);
	    Graph.printGraph(am);

	}

}
