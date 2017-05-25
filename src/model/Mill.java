package model;

import java.util.Optional;

public class Mill {
	public Node[] nodes;
	
	public Mill(Node n0, Node n1, Node  n2) {
		nodes = new Node[3];
		nodes[0] = n0;
		nodes[1] = n1;
		nodes[2] = n2;
	}
	
	/**
	 * Returns true iff the three nodes have occupants of the same type
	 */
	public boolean isMill() {
		return nodes[0].occupant.equals(nodes[1].occupant) && nodes[1].occupant.equals(nodes[2].occupant);
	}
	
	/**
	 * Returns an optional carrying the owner of this mill, ASSUMING this is a mill. It only looks at the owner of the middle node.
	 * @return
	 */
	public Optional<Boolean> getOwner() {
		return nodes[1].occupant.map( (Piece p) -> p.color);
	}
	
	/**
	 * Returns true if one of the nodes in this mill contains n
	 * @param n
	 * @return
	 */
	public boolean contains(Node n) {
		return nodes[0].equals(n) || nodes[1].equals(n) || nodes[2].equals(n);
	}
}
