package Assignment1;

public class Identifier {
    public static void main(String[] args) {
        int number_1 = 10, _number2 = 90;

        Identifier obj = new Identifier();
        int result = obj.addTwoNumbers(number_1, _number2);

        System.out.println("Sum is: " + result);
    }

    public int addTwoNumbers(int a, int b)
    {
        int sum = 0;
        sum = a + b;
        return sum;
    }
}
