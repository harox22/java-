public class BAD1 {
    public static void main(String[] args) {
        String str = new String("CS1331ROCKS");
	int num1=str.length() - 5;
	String num2=(String) num1;
        System.out.println(num2 + " is 11 - 5");
    }
}