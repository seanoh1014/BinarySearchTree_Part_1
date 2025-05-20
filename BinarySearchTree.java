class BinarySearchTree<T extends Comparable<T>> {
    
    private Node<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(T data) {
        root = add(data, root);
    }

    private Node<T> add(T data, Node<T> current) {
        if (current == null) {
            return new Node<T>(data);
        }

        if (data.compareTo(current.data) < 0) {
            current.left = add(data, current.left);
        }
        if (data.compareTo(current.data) > 0) {
            current.right = add(data, current.right);
        }
        return current;
    }

	// inOrder
	public String inOrder() {
		String str = inOrder(root);
		return "[" + str.substring(0, str.length() - 2) + "]";
	}

	private String inOrder(Node<T> current) {
		if (current == null) {
			return "";
		}
		return inOrder(current.left) 
			 + current.data + ", " 
			 + inOrder(current.right);
	}

	// preOrder
	public String preOrder() {
		String str = preOrder(root);
		return "[" + str.substring(0, str.length() - 2) + "]";
	}

	private String preOrder(Node<T> current) {
		if (current == null) {
			return "";
		}
		return current.data + ", " 
			 + preOrder(current.left) 
			 + preOrder(current.right);
	}

	// Post-Order
	public String postOrder() {
		String str = postOrder(root);
		return "[" + str.substring(0, str.length() - 2) + "]";
	}

	private String postOrder(Node<T> current) {
		if (current == null) {
			return "";
		}
		return postOrder(current.left) 
			 + postOrder(current.right)
			 + current.data + ", ";
	}	

	// contains
	public boolean contains(T val) {
		return contains(val, root);
	}

	private boolean contains(T val, Node<T> current) {
		if (current == null){
			return false;
		} else if (val.compareTo(current.data) < 0) {
			return contains(val, current.left);
		} else if (val.compareTo(current.data) > 0) {
			return contains(val, current.right);
		} else {
			return true;
		}
	}

	/**
	* returns the number of levels from root.left
	* plus the number of levels from root.right
	* plus one.
	*/
	public int getWidth() {
		return getNumLevels(root.left) + getNumLevels(root.right) + 1;
	}

	/**
	* returns the number of leaves in the tree. A 
	* leaf is a node that does not have a child 
	* node(s).
	*/
	public int getNumLeaves() {
		return getNumLeaves(root);
	}

	private int getNumLeaves(Node<T> current) {
		if (current == null) {
			return 0;
		} else if (current.left == null && current.right == null) {
			return 1;
		}

		return getNumLeaves(current.left) + getNumLeaves(current.right);
	}
	
	/**
	* returns the number of levels in the tree
	*/
	public int getNumLevels() {
		return getNumLevels(root);
	}

	private int getNumLevels (Node<T> current) {
		if (current == null) {
			return 0;
		} else {
			int numLeft = getNumLevels(current.left);
			int numRight = getNumLevels(current.right);
			if (numLeft > numRight) {
				return 1 + numLeft;
			} else {
				return 1 + numRight;
			}
		}
	}

	/**
	* returns the height of the tree which is 
	* the number of levels in the tree less one.
	*/
	public int getHeight() { 
		return getNumLevels() - 1;
	}

	/** 
	* returns the number of nodes in the tree
	*/
	public int size() {
		return size(root) - 1;
	}

	private int size(Node<T> current) {
		if (current == null) {
			return 1;
		}

		return size(current.left) + size(current.right);
	}

	/**
	* returns a String containing an inOrder
	* represention of the tree.
	*/
	public String toString() {
		return inOrder();
	}







}
