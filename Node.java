class Node implements Comparable {
	private final Integer value;
	public Node(Integer v) {
		this.value = v;
	}
	public Integer getValue() {
		return this.value;
	}

	@Override
	public int compareTo(Object other) {
		Node n = (Node)other;
		if (this.value > n.getValue()) {
			return 1;
		} else if (this.value == n.getValue()) {
			return 0;
		} else {
			return -1;
		}
	}
}
