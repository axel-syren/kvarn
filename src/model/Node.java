package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Node {
	int x;
	int y;
	List<Node> neighbours;
	
	public Optional<Piece> occupant;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
		neighbours = new LinkedList<>();
	}
	
	
	@Override
	public boolean equals(Object o) {
		Node other = (Node) o;
		return this.x == other.x && this.y == other.y;
	}
}
