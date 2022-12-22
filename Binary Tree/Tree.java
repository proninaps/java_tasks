//import java.util.Stack;

public class Tree { // создаю класс дерева 
    Node rootNode;
    public Tree() {
        rootNode = null; // корневой узел принимаю за null
    }

    public void PutIn_Node(int value) {// метод добавления новых узлов
        Node newNode = new Node(); // создаю новый узел
        newNode.set_Value(value); // передаю значение ключа
        if (this.rootNode == null) { // если корневого узла нет, то передаю значение нового узла в качестве корневого
            this.rootNode = newNode;
        }
        else {
            Node someNode = rootNode; // создаем новый образный узел и передаю значение корневого узла 
            while (true) {
                if (value == someNode.value) { // если значение равно значению образного узла завершаю цикл
                    return;
                } else if (value < someNode.value) { // если значение меньше образного, перехожу в левый узел 
                    if (someNode.leftChild == null) {// если левого узла не существует, то присваеваю ему значение нового узла и завершаю цикл
                        someNode.leftChild = newNode;
                        return;
                    } else {
                        someNode = someNode.leftChild; // в противном случае присваиваю образному узлу значение левого узла и заного прохожу цикл
                    }
                } else {
                    if (someNode.rightChild == null) {// аналогично с правым узлом 
                        someNode.rightChild = newNode;
                        return;
                    } else {
                        someNode = someNode.rightChild;
                    }
                }
            }

        }
    }
    public Node getNode(int value){ // вывод узла по значению 
        Node someNode = rootNode; // образному присваеую корневой 
        while(value!= someNode.value){ // пока значение ключа не равно значению ключа образного, прохожу цикл
            if(value<someNode.value){// если ключ меньше ключа образного присваиваю образному его левого ребенка и прохожу цикл заново пока не найду подходящий ключ 
                someNode = someNode.leftChild;
                if(someNode == null){ // если ключ не найден, значит такого узла нет
                    System.out.println("Такого числа нет в дереве");
                    return null;
                }
            }
            else if(value>someNode.value){// аналогично с правым(большим) узлом
                someNode = someNode.rightChild;
                if(someNode == null){
                    System.out.println("Такого числа нет в дереве");
                    return null;
                }
            }
        }
        return someNode;
    }
//    public void printTree() {  // метод для вывода использовала для проверки
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
