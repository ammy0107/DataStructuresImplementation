package com.graphs;

import java.util.*;

public class GraphAdjacencyList {

	public static void main(String[] args) {
		int vertex = 5;
		Graph graph = new Graph(vertex);
		graph.addEdge(0, 1);
		graph.addEdge(0, 4);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);

		// print the adjacency list representation of
		// the above graph
		graph.printGraph();
	}

}

class Graph {
	int value;
	LinkedList<Integer>[] adjacencyList;

	public Graph(int value) {
		this.value = value;
		this.adjacencyList = new LinkedList[value];

		for (int i = 0; i < value; i++) {
			this.adjacencyList[i] = new LinkedList<>();
		}
	}

	public void addEdge(int from, int to) {
		this.adjacencyList[from].add(to);
		this.adjacencyList[to].add(from);
	}

	public void printGraph() {
		for (int i = 0; i < value; i++) {
			String separator = " -> ";
			StringBuilder sb = new StringBuilder();
			sb.append(i);

			for (int val : this.adjacencyList[i]) {
				separator = " -> ";
				sb.append(separator + val);
			}

			System.out.println(sb.toString());
		}
	}
}
