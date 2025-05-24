package LinkedList;

public class LinkedListDemowith3Node {

	public static void main(String[] args) {
		SingleNode singleNodeDemo1 = new SingleNode(10);
		SingleNode singleNodeDemo2 = new SingleNode(20);
		SingleNode singleNodeDemo3 = new SingleNode(30);
		singleNodeDemo1.node = singleNodeDemo2; //reference of 1st node to 2nd node
		singleNodeDemo2.node = singleNodeDemo3;
		
		
		System.out.println("firstNode data::" +singleNodeDemo1.data);
		System.out.println("secondNode data::" +singleNodeDemo1.node.data);
		System.out.println("thridNode data::" +singleNodeDemo2.node.data);
//		System.out.println("secondNode data::" +singleNodeDemo1.node.node);
		System.out.println("thirdNode data::" +singleNodeDemo2.node.node);



	}

}

class  SingleNodeDemo1{
	int data; // data
	SingleNodeDemo1 node;  //reference of the next node
	
	//constructor
	public SingleNodeDemo1(int data) {
		this.data = data;
		this.node = null;
	}
	
}

