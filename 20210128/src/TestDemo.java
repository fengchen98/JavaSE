/**
 * @Author:FC
 * @Date:2021/1/28
 * @Time:9:28
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        BTNode root=binaryTree.createTree();
        System.out.println(binaryTree.isCompleteTree(root));
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.preOrderTraversalNor(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversalNor(root);
        System.out.println( );
        binaryTree.postOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversalNor(root);

    }
}
