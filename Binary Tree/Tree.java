//import java.util.Stack;

public class Tree {
    Node rootNode;
    public Tree() {
        rootNode = null;
    }

    public void PutIn_Node(int value) {
        Node newNode = new Node();
        newNode.set_Value(value);
        if (this.rootNode == null) {
            this.rootNode = newNode;
        }
        else {
            Node someNode = rootNode;
            while (true) {
                if (value == someNode.value) {
                    return;
                } else if (value < someNode.value) {
                    if (someNode.leftChild == null) {
                        someNode.leftChild = newNode;
                        return;
                    } else {
                        someNode = someNode.leftChild;
                    }
                } else {
                    if (someNode.rightChild == null) {
                        someNode.rightChild = newNode;
                        return;
                    } else {
                        someNode = someNode.rightChild;
                    }
                }
            }

        }
    }
    public Node getNode(int value){
        Node someNode = rootNode;
        while(value!= someNode.value){
            if(value<someNode.value){
                someNode = someNode.leftChild;
                if(someNode == null){
                    System.out.println("Такого числа нет в дереве");
                    return null;
                }
            }
            else if(value>someNode.value){
                someNode = someNode.rightChild;
                if(someNode == null){
                    System.out.println("Такого числа нет в дереве");
                    return null;
                }
            }
        }
        return someNode;
    }
//    public void printTree() {
//        Stack globalStack = new Stack();
//        globalStack.push(rootNode);
//        int gaps = 32;
//        boolean isRowEmpty = false;
//        String separator = "-----------------------------------------------------------------";
//        System.out.println(separator);
//        while (isRowEmpty == false) {
//            Stack localStack = new Stack();
//            isRowEmpty = true;
//
//            for (int j = 0; j < gaps; j++)
//                System.out.print(' ');
//            while (globalStack.isEmpty() == false) {
//                Node temp = (Node) globalStack.pop();
//                if (temp != null) {
//                    System.out.print(temp.get_Value());
//                    localStack.push(temp.get_LeftChild());
//                    localStack.push(temp.get_RightChild());
//                    if (temp.get_LeftChild() != null ||
//                            temp.get_RightChild() != null)
//                        isRowEmpty = false;
//                }
//                else {
//                    System.out.print("__");
//                    localStack.push(null);
//                    localStack.push(null);
//                }
//                for (int j = 0; j < gaps * 2 - 2; j++)
//                    System.out.print(' ');
//            }
//            System.out.println();
//            gaps /= 2;
//            while (localStack.isEmpty() == false)
//                globalStack.push(localStack.pop());
//        }
//    }
}
