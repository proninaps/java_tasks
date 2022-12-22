
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(); // создаю объект класса дерево
        tree.PutIn_Node(45);// заполняю дерево 
        tree.PutIn_Node(10);
        tree.PutIn_Node(8);
        tree.PutIn_Node(60);
        tree.PutIn_Node(1);
        tree.PutIn_Node(9);
        tree.PutIn_Node(0);
        tree.PutIn_Node(3);
        tree.PutIn_Node(5);
        tree.PutIn_Node(55);

        Node rootNode = tree.rootNode; // создаем объект корневого элемента
        System.out.println(rootNode.value); //выводим значение корневого элемента
        Node findvalue = tree.getNode(4);// ключ элемента
        System.out.println(findvalue);

    }
}
