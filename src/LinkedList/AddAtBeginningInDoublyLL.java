package LinkedList;

class Node3 {
    int data;
    Node3 prev;
    Node3 next;

    public Node3(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class AddAtBeginningInDoublyLL {

    static class DoublyLL {
        
		Node3 head;

        void addAtBeginning(int data) {
            Node3 newNode = new Node3(data);
            if (head != null) {
                newNode.next = head;
                head.prev = newNode;
            }
            head = newNode;
        }

        
        public void traverse_head() {
            Node3 temp_ref = head;

            while (temp_ref != null) {
                System.out.println("value: " + temp_ref.data);
                temp_ref = temp_ref.next;
            }
        }
        public void Traverse_backward() {
        	System.out.println("Backward traversing");
        	Node3 temp_ref = head;
        	
        	while(temp_ref.next != null) {
        		temp_ref = temp_ref.next;
        	}
        	while(temp_ref != null) {
        		System.out.println("value::" +temp_ref.data);
        		temp_ref = temp_ref.prev;
        	}
        }
        
        public void insertAtEnd(int data) {
        	Node3  temp_ref = head;
        	Node3 new_node = new Node3(data);
        	while(temp_ref.next != null) {
        		temp_ref = temp_ref.next;
        	}
        	temp_ref.next = new_node;
        	new_node.prev = temp_ref;
        }
        
        public void deletionFromBegin() {
        	Node3  temp_ref = head;
        	head=head.next;
        	head.prev = null;
        }
        
        public void deletionFromEnd(){
        	Node3 temp_ref = head;
        	
        	while(temp_ref.next != null) {
        		temp_ref = temp_ref.next;
        	}
        	
        	temp_ref.prev.next= null;
        }
        public void deletionFromSpecificIndex(int index) {
        	Node3 temp_ref = head;
        	int counter=0;
        	
        	if(index==0) {
        		head=head.next;
            	head.prev = null;
            	return;
        	}
        	while(temp_ref != null && counter<index) {
        		temp_ref= temp_ref.next;
        		counter++;
        	}
        	temp_ref.prev.next= temp_ref.next;
        	temp_ref.next.prev = temp_ref.prev;
        }

        void printList() {
            Node3 temp = head;
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL();

        doublyLL.addAtBeginning(10);
        doublyLL.addAtBeginning(20);
        doublyLL.addAtBeginning(30);
        doublyLL.traverse_head();
        doublyLL.Traverse_backward();
        doublyLL.insertAtEnd(0);
//        doublyLL.deletionFromBegin();
//        doublyLL.deletionFromEnd();
        doublyLL.deletionFromSpecificIndex(1);
        doublyLL.printList();
    }
}
