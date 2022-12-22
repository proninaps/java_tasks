public class Node {
    int value;
    Node rightChild;
    Node leftChild;



    public void set_Value(int value){
        this.value = value;
    }
    public int get_Value(){
        return this.value;
    }
    public void set_RightChild(Node rightChild){
        this.rightChild = rightChild;
    }
    public Node get_RightChild(){
        return this.rightChild;
    }
    public void set_LeftChild(Node leftChild){
        this.leftChild = leftChild;
    }
    public Node get_LeftChild(){
        return this.leftChild;
    }

}

