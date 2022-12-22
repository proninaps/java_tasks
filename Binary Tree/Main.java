
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.PutIn_Node(45);
        tree.PutIn_Node(10);
        tree.PutIn_Node(8);
        tree.PutIn_Node(60);
        tree.PutIn_Node(1);
        tree.PutIn_Node(9);
        tree.PutIn_Node(0);
        tree.PutIn_Node(3);
        tree.PutIn_Node(5);
        tree.PutIn_Node(55);

        Node rootNode = tree.rootNode;
        System.out.println(rootNode.value);
        Node findvalue = tree.getNode(4);
        System.out.println(findvalue);

    }
}