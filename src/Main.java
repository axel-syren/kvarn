import model.Node;
import model.Piece;

public class Main {

	public static void main(String[] args) {
		Node n = new Node(0,0);
		Piece p = new Piece(Piece.WHITE);
		System.out.println(n.occupant);
	}

}
