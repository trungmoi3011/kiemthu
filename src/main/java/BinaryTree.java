
    class BinaryTree {
        Node root;

        static class Node {
            int value;
            Node left, right;

            public Node(int item) {
                value = item;
                left = right = null;
            }
        }

        public BinaryTree() {
            root = null;
        }

        public void inorderTraversal(Node node) {
            if (node != null) {
                inorderTraversal(node.left);
                System.out.print(node.value + " ");
                inorderTraversal(node.right);
            }
        }

        public void preorderTraversal(Node node) {
            if (node != null) {
                System.out.print(node.value + " ");
                preorderTraversal(node.left);
                preorderTraversal(node.right);
            }
        }

        public void postorderTraversal(Node node) {
            if (node != null) {
                postorderTraversal(node.left);
                postorderTraversal(node.right);
                System.out.print(node.value + " ");
            }
        }
    }


