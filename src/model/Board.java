package model;

import java.util.List;

public class Board {
	public Node[] nodes;
	
	public Board() {
		setup();
	}
	
	private void setup() {
		nodes = new Node[24];
		for (int i = 0; i < 24; i++) {
			nodes[i] = new Node(i);
		}
		nodes[0].neighbours.add(nodes[1]);
		nodes[0].neighbours.add(nodes[9]);
		nodes[1].neighbours.add(nodes[0]);
		nodes[1].neighbours.add(nodes[2]);
		nodes[1].neighbours.add(nodes[4]);
		nodes[2].neighbours.add(nodes[1]);
		nodes[2].neighbours.add(nodes[14]);
	}
}
