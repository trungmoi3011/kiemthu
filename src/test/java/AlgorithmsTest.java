import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AlgorithmsTest {
    @Test
    void testBubbleSort() {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int[] sortedArray = Sorting.bubbleSort(array);
        assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, sortedArray);
    }

    @Test
    void testBinarySearch() {
        int[] array = {11, 12, 22, 25, 34, 64, 90};
        assertEquals(4, Search.binarySearch(array, 34));
        assertEquals(-1, Search.binarySearch(array, 100));
    }

    @Test
    void testInorderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTree.Node(1);
        tree.root.left = new BinaryTree.Node(2);
        tree.root.right = new BinaryTree.Node(3);
        tree.root.left.left = new BinaryTree.Node(4);
        tree.root.left.right = new BinaryTree.Node(5);
        tree.root.right.left = new BinaryTree.Node(6);
        tree.root.right.right = new BinaryTree.Node(7);

        // Expected output: 4 2 5 1 6 3 7
        tree.inorderTraversal(tree.root);
    }

    @Test
    void testMergeSortLinkedList() {
        LinkedListSort.Node head = new LinkedListSort.Node(3);
        head.next = new LinkedListSort.Node(1);
        head.next.next = new LinkedListSort.Node(2);
        head.next.next.next = new LinkedListSort.Node(4);
        LinkedListSort.Node sortedHead = LinkedListSort.mergeSort(head);

        assertEquals(1, sortedHead.value);
        assertEquals(2, sortedHead.next.value);
        assertEquals(3, sortedHead.next.next.value);
        assertEquals(4, sortedHead.next.next.next.value);
    }
}
