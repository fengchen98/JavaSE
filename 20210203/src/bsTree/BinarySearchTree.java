package bsTree;

/**
 * @Author:FC
 * @Date:2021/2/3
 * @Time:11:43
 * @Content:
 */
public class BinarySearchTree {
    static class BSNode{
        public int val;
        public BSNode left;
        public BSNode right;

        public BSNode(int val) {
            this.val = val;
        }
    }

    public BSNode root=null;

    public BSNode search(int val){
        if (root==null)   return null;
        BSNode cur=root;
        while (cur!=null){
            if (cur.val==val){
                return  cur;
            }else if (cur.val>val){
                cur=cur.left;
            }else {
                cur=cur.right;
            }
        }
        return null;
    }

    public boolean inseart(int val){
        BSNode node=new BSNode(val);
        if (root==null){
            root=node;
            return true;
        }
        BSNode cur=root;
        BSNode parent=null;
        while (cur!=null){
            if (val==cur.val){
                return false;
            }else if (cur.val>val){
                parent=cur;
                cur=cur.left;
            }else {
                parent=cur;
                cur=cur.right;
            }
        }
        if (parent.val>val){
            parent.left=node;
        }else {
            parent.right=node;
        }
        return true;
    }

    public void preOrder(BinarySearchTree.BSNode root){
        if (root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(BinarySearchTree.BSNode root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public  void  remove(int val){

    }
}
