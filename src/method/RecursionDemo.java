package method;

public class RecursionDemo {

	public static void main(String[] args) {
		RecursionDemo recursionDemoObj = new RecursionDemo();
		int sum=recursionDemoObj.addition(10);
		System.out.println(sum);

	}
	public int addition(int value) {
		if(value>=1) {
		value = value + addition(value-1); //10+9+8+....+1
		}else {
			value=0;
			return value;
		}
		return value;
		
	

	}
}
