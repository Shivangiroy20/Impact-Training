package LinkedList;

public class CircularLL {
	
	
	static class Circularoperation{
		CircularSampleNode tail;
		CircularSampleNode head;
		
		public void addElement(int data) {
			CircularSampleNode newNode = new CircularSampleNode(data);
			
			if(head == null) {
				newNode.next = head;
				head= newNode;
				tail=newNode;
				return;
				
			}else {
				tail.next=newNode;
				tail=newNode;
				tail.next=head;
			}
		}
		public void printCircularLink() {
			CircularSampleNode temp_ref=head;
			if(temp_ref != null) {
				do {
					System.out.println(temp_ref.data);
					temp_ref = temp_ref.next;
				}while(temp_ref != head);
			}
		}
	}

	public static void main(String[] args) {
//		CircularSampleNode firstNode = new CircularSampleNode(10);
//		CircularSampleNode secondNode = new CircularSampleNode(20);
//
//		
//		firstNode.next = secondNode;
//		secondNode.next = firstNode;
//		
//		System.out.println("firstNode::" +firstNode.data +"firstNode ref::" +firstNode.next);
//		System.out.println("secondNode::" +secondNode.data +"secondNode ref::" +secondNode.next);
		
		Circularoperation circularOperation = new Circularoperation();
		circularOperation.addElement(10);
		circularOperation.addElement(20);
		circularOperation.printCircularLink();

		
	
			
		}

	}



class CircularSampleNode{
	int data;
	CircularSampleNode next;
	public CircularSampleNode(int value) {
		 data = value;
		 this.next = null;
	}
}
