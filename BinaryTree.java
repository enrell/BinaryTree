public class BinaryTree {
	static class Node {
    	int value;
        Node right;
        Node left;

        Node(int value) {
            this.value = value;
            this.right = null;
            this.left = null;
        }
    }
    Node root;

    BinaryTree() {
    	this.root = null;
    }

    private Node insert(Node node, int value) {
    	if (node == null) {
        	node = new Node(value);
            
        }else if (value < node.value) {
        	node.left = insert(node.left, value);
            
        }else {
        	node.right = insert(node.right, value);
            
        }
        return node;
    }
    
    public void insert(int value) {
    	root = insert(root, value);
    }

    private boolean search(Node node, int value) {
    	if (node == null) {
        	return false;
    	}else if (value == node.value) {
        	return true;
    	}else if (value < node.value) {
        	return search(node.left, value);
    	}else {
        	return search(node.right, value);
        }
    }
    
    public boolean search(int value) {
    	return search(root, value);
    }

    public void reset() {
    	root = reset(root);
    }

    private Node reset(Node node) {
    	if (node == null) {
    		return null;
    	}
    	node.right = reset(node.right);
    	node.left = reset(node.left);
    	node = null;
    	
    	return node;
    }

    public static void main(String[] args) {
    	// Output
    	BinaryTree tree = new BinaryTree();
    	tree.insert(20);
    	tree.insert(15);
    	tree.insert(18);
    	tree.insert(25);
    	tree.insert(60);
    	tree.insert(-4);
    	boolean found = tree.search(18);
    	System.out.println(found);
    	
    	found = tree.search(75);
    	System.out.println(found);
    	
    	tree.reset();
    	tree.insert(60);
    	
    	found = tree.search(7);
    	System.out.println(found);

    }
}

