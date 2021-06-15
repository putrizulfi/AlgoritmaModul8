package BinaryTree;
public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        TreeNode Node;
        
        Node = new TreeNode('D');
        tree.insert(Node);
        
        Node = new TreeNode('B');
        tree.insert(Node);
        
        Node = new TreeNode('A');
        tree.insert(Node);
        
        Node = new TreeNode('C');
        tree.insert(Node);
        
        Node = new TreeNode('F');
        tree.insert(Node);
        
        Node = new TreeNode('E');
        tree.insert(Node);
        
        Node = new TreeNode('G');
        tree.insert(Node);
        
        System.out.print("Traversal dengan preOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postOrder: ");
        tree.postOrder();
        System.out.print("\nTraversal dengan inOrder: ");
        tree.inOrder();
    }
    
}
