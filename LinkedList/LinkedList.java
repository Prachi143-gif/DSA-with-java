public class LinkedList {
    // Node class for LinkedList
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Add a node to the end of the list
    public void addNode(int data) {
        Node newNode = new Node(data);  // Create a new node
        if (head == null) {
            head = newNode;  // If list is empty, make newNode the head
        } else {
            Node temp = head;  // Traverse to the end of the list
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;  // Add the new node at the end
        }
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        System.out.println("Linked List:");
        list.display();
    }
}
