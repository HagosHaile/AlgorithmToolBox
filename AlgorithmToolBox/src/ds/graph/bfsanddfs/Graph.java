package ds.graph.bfsanddfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
	
	private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();
    public static class Node{
        // node id
        private int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();

        private Node(int id){
            this.id=id;
        }
    }
    private Node getNode(int id){
        return nodeLookup.get(id);
    }
    
    public void addEdge(int source, int destination){
    	Node s = getNode(source);
    	Node d = getNode(destination);
    	s.adjacent.add(d);
    }
    
    public boolean hasPathDFS(int source, int destination){
    	Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet<>();
        return hasPathDFS(s, d, visited);
    }
    
    // recursive method
    private boolean hasPathDFS(Node source, Node destination, 
    		HashSet<Integer> visited) {
    	// no path
        if(visited.contains(source.id)) {
            return false;
        }
        //else mark visited
        visited.add(source.id);
        if(source==destination) {
            return true;
        }
        // search children
        for(Node child : source.adjacent){
            if(hasPathDFS(child, destination, visited)){
                return true;
            }
        }
        // no path return
        return false;
    }
    
    public boolean hasPathBFS(int source, int destination){
    	return hasPathBFS(getNode(source), getNode(destination));
    }
    
    public boolean hasPathBFS(Node source, Node destination){
    	LinkedList<Node> nextToVisit = new LinkedList<Node>();
    	HashSet<Integer> visited = new HashSet<>();
    	nextToVisit.add(source);
    	while(!nextToVisit.isEmpty()) {
    		Node node = nextToVisit.remove();
    		if(node == destination)
    			return true;
    		if(visited.contains(node.id))
    			continue;
    		visited.add(node.id);
    		
    		for(Node child: node.adjacent) {
    			nextToVisit.add(child);
    		}
    	}
    	
    	return false;
    	
    }
    
    public static void main(String[] args) {

		Graph graph = new Graph();
		graph.nodeLookup.put(0, new Graph.Node(0));
		graph.nodeLookup.put(1, new Graph.Node(1));
		graph.nodeLookup.put(2, new Graph.Node(2));
		graph.nodeLookup.put(3, new Graph.Node(3));
		graph.nodeLookup.put(4, new Graph.Node(4));
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(1, 4);
		
		System.out.println(graph.hasPathBFS(0, 4));
		System.out.println(graph.hasPathDFS(0, 4));

	}

}
