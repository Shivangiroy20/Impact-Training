package method;

public class MultipleOfFive {

    public static void main(String[] args) {
        int multiplication = MultipleOfFive.multiple(5);
        System.out.println(multiplication);  
    }

    public static int multiple(int value) {
        if (value >= 1) {
            value = value * multiple(value - 1);
        } else {
            return 1;  
        }
        return value;
    }
}
