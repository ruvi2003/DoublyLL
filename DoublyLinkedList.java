package DLL;


class DoublyLinkedList {    
    class Node {  
        int value;  
        Node prevNode;  
        Node nextNode;  
   
        public Node(int value) {  
            this.value = value;  
        }  
    }  
    
    Node head, tail = null;  
    
    public void addNode(int value) {  
        Node newNode = new Node(value);  
   
        if (head == null) {  
            head = tail = newNode;  
            head.prevNode = null;  
            tail.nextNode = null;  
        } else {  
            tail.nextNode = newNode;  
            newNode.prevNode = tail;  
            tail = newNode;  
            tail.nextNode = null;  
        }  
    }  
    
    public void printNodes() {  
        Node current = head;  
        if (head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while (current != null) {  
            System.out.print(current.value + " ");  
            current = current.nextNode;  
        }  
    }  
}

class Main {
    public static void main(String[] args) {  
        DoublyLinkedList dlList = new DoublyLinkedList();  
        dlList.addNode(10);  
        dlList.addNode(25);  
        dlList.addNode(35);  
        dlList.addNode(50);  
        dlList.addNode(70);  
   
        dlList.printNodes();  
    }  
}
