import java.util.*;

class MinHeapTest {
	public static void main(String[] args) {
		PriorityQueue<Node> minHeap = new PriorityQueue<>();
		minHeap.add(new Node(2));
		minHeap.add(new Node(3));
		minHeap.add(new Node(5));
		minHeap.add(new Node(1));
		minHeap.add(new Node(4));
		while (0 < minHeap.size()) {
			System.out.println(minHeap.poll().getValue());
		}
	}
}
