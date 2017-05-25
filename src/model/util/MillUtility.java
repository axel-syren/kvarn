package model.util;

import java.util.LinkedList;
import java.util.List;

import model.Board;
import model.Mill;
import model.Node;

public class MillUtility {
	Board board;
	public MillUtility(Board board) {
		this.board = board;
	}
	
	/**
	 * Returns true if the piece on node n is part of a mill
	 * @param n
	 * @return
	 */
	public boolean isInMill(Node n) {
		int i = 0;
		while(i < board.mills.length) {
			Mill m = board.mills[i];
			if(m.contains(n) && m.isMill()) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns a list of mills (completed or not) that this node is in
	 * @param n
	 * @return
	 */
	public List<Mill> getMills(Node n) {
		List<Mill> list = new LinkedList<>();
		for(Mill m : board.mills) {
			if(m.contains(n)) {
				list.add(m);
			}
		}
		return list;
	}
}
