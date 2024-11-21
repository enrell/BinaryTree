# Simple BinaryTree
The BinaryTree class has an internal Node class that represents a node in the tree. Each node has an integer value, a left node and a right node. It also has a Node field called 'root' that represents the root of the tree. It also has a private 'insert' method that receives a Node and an integer value and inserts the value into the tree through the defined Node. If the Node is null, it creates a new Node with the defined value. If the value is less than the value of the current Node, it inserts the value in the left node. Otherwise, insert the value into the right node.

The public method 'insert' calls the private method 'insert', passing the root node and the value to be inserted.

The private method 'search' receives a Node and an integer value, and searches the tree for the value starting at the defined Node. It returns 'true' if the value is found and 'false' otherwise. The public method called 'search' calls the private method 'search', passing the root node and the value to be searched.

The public method 'reset' calls a private method 'reset', passing in the root node. The private 'reset' method is recursive and sets all nodes in the tree to 'null', deleting them.
