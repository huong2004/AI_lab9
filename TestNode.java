package lab9;

import java.util.Arrays;

public class TestNode {
	public static void main(String[] args) {
		Node node = new Node();
		Integer[] data = { 8 };
		node.addAll(Arrays.asList(data));

		MinimaxAlgo algo = new MinimaxAlgo();
		algo.execute(node);
	}
}
