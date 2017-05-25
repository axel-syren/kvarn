package view.util;

public class NodeUtility {
	
	/**
	 * COORDINATE[i] gives the coordinates of a node
	 */
	public static final int[][] COORDINATE = {
			{ 0, 0 }, // index = 0
			{ 3, 0 }, // index = 1
			{ 6, 0 }, // index = 2
			{ 1, 1 }, // index = 3
			{ 3, 1 }, // index = 4
			{ 5, 1 }, // index = 5
			{ 2, 2 }, // index = 6
			{ 3, 2 }, // index = 7
			{ 4, 2 }, // index = 8
			{ 0, 3 }, // index = 9
			{ 1, 3 }, // index = 10
			{ 2, 3 }, // index = 11
			{ 4, 3 }, // index = 12
			{ 5, 3 }, // index = 13
			{ 6, 3 }, // index = 14
			{ 2, 4 }, // index = 15
			{ 3, 4 }, // index = 16
			{ 4, 4 }, // index = 17
			{ 1, 5 }, // index = 18
			{ 3, 5 }, // index = 19
			{ 5, 5 }, // index = 20
			{ 0, 6 }, // index = 21
			{ 3, 6 }, // index = 22
			{ 6, 6 }, // index = 23
	};
	
	/**
	 * INDEX[x][y] gives the index of the node at (x,y). Empty coordinates like (1,0) give -1.  
	 */
	public static final int[][] INDEX = {
			{  0, -1, -1,  9, -1, -1, 21},
			{ -1,  3, -1, 10, -1, 18, -1},
			{ -1, -1,  6, 11, 15, -1, -1},
			{  1,  4,  7, -1, 16, 19, 2},
			{ -1, -1,  8, 12, 17, -1, -1},
			{ -1,  5, -1, 13, -1, 20, -1},
			{  2, -1, -1, 14, -1, -1, 23},
	};

}
