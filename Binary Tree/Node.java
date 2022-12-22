public class Node { // класс узлов
    int value;
    Node rightChild; 
    Node leftChild;



    public void set_Value(int value){ // меняет значение ключа узла
        this.value = value;
    }
    public int get_Value(){ // выводит значение ключа узла
        return this.value;
    }
    public void set_RightChild(Node rightChild){// аналогично с правм(большим) узлом наследником
        this.rightChild = rightChild;
    }
    public Node get_RightChild(){
        return this.rightChild;
    }
    public void set_LeftChild(Node leftChild){// аналогично с левым(меньшим) узлом наследником
        this.leftChild = leftChild;
    }
    public Node get_LeftChild(){
        return this.leftChild;
    }

}

