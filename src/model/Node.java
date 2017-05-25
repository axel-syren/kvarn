package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Node {
	int index;
	List<Node> neighbours;
	
	public Optional<Piece> occupant;
	
	public Node(int x) {
		this.index = x;
		neighbours = new LinkedList<>();
	}
	
	
	@Override
	public boolean equals(Object o) {
		return this.index == ((Node) o).index;
	}
}
