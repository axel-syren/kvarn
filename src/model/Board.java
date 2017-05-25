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
		nodes[3].neighbours.add(nodes[4]);
		nodes[3].neighbours.add(nodes[10]);
		nodes[4].neighbours.add(nodes[1]);
		nodes[4].neighbours.add(nodes[3]);
		nodes[4].neighbours.add(nodes[5]);
		nodes[4].neighbours.add(nodes[7]);
		nodes[5].neighbours.add(nodes[4]);
		nodes[5].neighbours.add(nodes[13]);
		nodes[6].neighbours.add(nodes[7]);
		nodes[6].neighbours.add(nodes[11]);
		nodes[7].neighbours.add(nodes[4]);
		nodes[7].neighbours.add(nodes[6]);
		nodes[7].neighbours.add(nodes[8]);
		nodes[8].neighbours.add(nodes[7]);
		nodes[8].neighbours.add(nodes[12]);
		nodes[9].neighbours.add(nodes[0]);
		nodes[9].neighbours.add(nodes[10]);
		nodes[9].neighbours.add(nodes[21]);
		nodes[10].neighbours.add(nodes[3]);
		nodes[10].neighbours.add(nodes[9]);
		nodes[10].neighbours.add(nodes[11]);
		nodes[10].neighbours.add(nodes[18]);
		nodes[11].neighbours.add(nodes[6]);
		nodes[11].neighbours.add(nodes[10]);
		nodes[11].neighbours.add(nodes[15]);
		nodes[12].neighbours.add(nodes[8]);
		nodes[12].neighbours.add(nodes[13]);
		nodes[12].neighbours.add(nodes[17]);
		nodes[13].neighbours.add(nodes[5]);
		nodes[13].neighbours.add(nodes[12]);
		nodes[13].neighbours.add(nodes[14]);
		nodes[13].neighbours.add(nodes[20]);
		nodes[14].neighbours.add(nodes[2]);
		nodes[14].neighbours.add(nodes[13]);
		nodes[14].neighbours.add(nodes[23]);
		nodes[15].neighbours.add(nodes[11]);
		nodes[15].neighbours.add(nodes[16]);
		nodes[16].neighbours.add(nodes[15]);
		nodes[16].neighbours.add(nodes[17]);
		nodes[16].neighbours.add(nodes[19]);
		nodes[17].neighbours.add(nodes[12]);
		nodes[17].neighbours.add(nodes[16]);
		nodes[18].neighbours.add(nodes[10]);
		nodes[18].neighbours.add(nodes[19]);
		nodes[19].neighbours.add(nodes[16]);
		nodes[19].neighbours.add(nodes[18]);
		nodes[19].neighbours.add(nodes[20]);
		nodes[19].neighbours.add(nodes[22]);
		nodes[20].neighbours.add(nodes[13]);
		nodes[20].neighbours.add(nodes[19]);
		nodes[21].neighbours.add(nodes[9]);
		nodes[21].neighbours.add(nodes[22]);
		nodes[22].neighbours.add(nodes[19]);
		nodes[22].neighbours.add(nodes[21]);
		nodes[22].neighbours.add(nodes[23]);
		nodes[23].neighbours.add(nodes[14]);
		nodes[23].neighbours.add(nodes[22]);
	}
}
