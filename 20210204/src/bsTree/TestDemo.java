package bsTree;

/**
 * @Author:FC
 * @Date:2021/2/3
 * @Time:11:42
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree=new BinarySearchTree();
        binarySearchTree.inseart(4);
        binarySearchTree.inseart(3);
        binarySearchTree.inseart(1);
        binarySearchTree.inseart(15);
        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.println();
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.println();
        binarySearchTree.remove(15);
        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.println();
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.println();

    }
}
