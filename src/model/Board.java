package model;

import java.util.List;

public class Board {
	public Node[] nodes;
	public Mill[] mills;
	
	/**
	 * Creates a board with nodes and mills
	 */
	public Board() {
		createNodes();
		createMills();
	}
	
	/**
	 * Creates mills
	 */
	private void createMills() {
		mills = new Mill[16];
		mills[0]  = new Mill(nodes[0],  nodes[1], nodes[2]);
		mills[1]  = new Mill(nodes[3],  nodes[4], nodes[5]);
		mills[2]  = new Mill(nodes[6],  nodes[7], nodes[8]);
		mills[3]  = new Mill(nodes[9],  nodes[10], nodes[11]);
		mills[4]  = new Mill(nodes[12], nodes[13], nodes[14]);
		mills[5]  = new Mill(nodes[15], nodes[16], nodes[17]);
		mills[6]  = new Mill(nodes[18], nodes[19], nodes[20]);
		mills[7]  = new Mill(nodes[21], nodes[22], nodes[23]);
		mills[8]  = new Mill(nodes[0],  nodes[9], nodes[21]);
		mills[9]  = new Mill(nodes[3],  nodes[10], nodes[18]);
		mills[10] = new Mill(nodes[6],  nodes[11], nodes[15]);
		mills[11] = new Mill(nodes[1],  nodes[4], nodes[7]);
		mills[12] = new Mill(nodes[16], nodes[19], nodes[22]);
		mills[13] = new Mill(nodes[8],  nodes[12], nodes[17]);
		mills[14] = new Mill(nodes[5],  nodes[13], nodes[20]);
		mills[15] = new Mill(nodes[2],  nodes[14], nodes[23]);
	}

	/**
	 * Creates nodes
	 */
	private void createNodes() {
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
