package LinkedList;

public class LinkedListDemowith2Node {

	public static void main(String[] args) {
		SingleNode singleNodeDemo1 = new SingleNode(10);
		SingleNode singleNodeDemo2 = new SingleNode(20);
		singleNodeDemo1.node = singleNodeDemo2; //reference of 1st nide to 2nd node
		
		System.out.println("firstNode data::" +singleNodeDemo1.data);
		System.out.println("secondNode data::" +singleNodeDemo1.node.data);
		System.out.println("secondNode data::" +singleNodeDemo1.node.node);



	}

}

class  SingleNodeDemo{
	int data; // data
	SingleNodeDemo node;  //reference of the next node
	
	//constructor
	public SingleNodeDemo(int data) {
		this.data = data;
		this.node = null;
	}
	
}
