package LinkedList;

public class NodeSimpleDemo {

	public static void main(String[] args) {
		SingleNode  singleNode =new SingleNode(10);
		
		System.out.print("Node value :: " +singleNode.data  +"ref>>> " + singleNode.node);
		

	}

}
class SingleNode{
	int data; // data
	SingleNode node;  //reference of the next node
	
	//constructor
	public SingleNode(int data) {
		this.data = data;
		this.node = null;
	}
	
}