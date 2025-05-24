package LinkedList;

public class SinglyLinkedListdemo {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addAtBeginning(30);
        list.addAtBeginning(20);
        list.addAtBeginning(10);
        list.insertAtEnd(40);
//        list.removeAtbeginning();
//        list.removeFirstNode();
//        list.removeAtEnd();
   
        list.insertAtSpecificIndex(40, 1);
        
        System.out.println("After Deletion");
        list.removeAtSpecificAtIndex(0);
        
        
        

        list.printList(); 
    }
}


class Node {
    int data;
    Node next;

    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class SinglyLinkedList {
    Node head;

    public void addAtBeginning(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    
    public void insertAtEnd(int newData) {
    	 Node newNode = new Node(newData);
    	 if (head == null) {
             head = newNode;
             return;
         }
    	 Node current = head;
         while (current.next != null) {
             current = current.next;
         }

         
         current.next = newNode;
     }
    
    public void insertAtSpecificIndex(int data, int position) {
    	Node newNode = new Node(data);
    	Node current=head;
    	int counter = 0;
    	if(position == 0) {
    		newNode.next= head;
    		head = newNode;
    		return;
    		}
    	
//    	traversing upto the position
    	while(current!= null && counter <position-1) {
    		current = current.next;
    		counter++;
    	}
    	
    	newNode.next = current.next;
    	current.next = newNode;
    	
    }
    
    public void removeAtbeginning() {
    	head = head.next;
    }
    
//    public void removeFirstNode() {
//    	head = head.next.next;
//    }

    
    public void removeAtEnd() {
    	Node second_last_Node = head;
    	Node temp_itr_Node= head.next;
    	
    	while(temp_itr_Node.next != null) {
    		second_last_Node = second_last_Node.next;
    		
    		temp_itr_Node= temp_itr_Node.next;
    		
    	}
    	
    	second_last_Node.next = null;
    }
    
    public void removeAtSpecificAtIndex(int position) {
    	Node temp_itr_Node = head.next;
    	
    	if(position == 0) {
    		head = head.next;
    		return ;
    	}
    	int counter = 0;
    	while(temp_itr_Node != null && counter<position-1) {
    		temp_itr_Node = temp_itr_Node.next;
    		counter++;
    		
    	}
    	
    	temp_itr_Node.next =temp_itr_Node.next.next;
    }

   
    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }
}
