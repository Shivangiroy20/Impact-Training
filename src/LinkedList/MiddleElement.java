package LinkedList;

public  class MiddleElement {
	
	Node head;
	
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
	 
	 public void findMiddle() {
			Node slow = head;
			Node fast = head;
			
			while(fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			if(slow != null) {
				System.out.print("Middle Node :" + slow.data);
			}
		  }
	 
	 public void printList() {
	        Node tempNode = head;
	        while (tempNode != null) {
	            System.out.print(tempNode.data + " -> ");
	            tempNode = tempNode.next;
	        }
	        System.out.println("null");
	    }
	

 

	

	public static void main(String[] args) {
	    MiddleElement list = new MiddleElement();
		
		 list.insertAtEnd(1);
	        list.insertAtEnd(2);
	        list.insertAtEnd(3);
	        list.insertAtEnd(4);
	        list.insertAtEnd(5);
	        list.printList();
	        list.findMiddle();

	}

}

class Node1 {
    int data;
    Node next;

    
    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}