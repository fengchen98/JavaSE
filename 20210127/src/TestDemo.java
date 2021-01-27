/**
 * @Author:FC
 * @Date:2021/1/27
 * @Time:8:57
 * @Content:
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        BTNode root=binaryTree.createTree();
        binaryTree.levelOrderTraversal(root);
    }
}
