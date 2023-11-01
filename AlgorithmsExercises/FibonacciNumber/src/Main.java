public class Main {
    public static void main(String[] args) {
     fibonacciSequenceFunction();
    }

    private static void fibonacciSequenceFunction() {
        long number1 = 0;
        long number2 = 1;
        long temp;

        System.out.println(number1);
        System.out.println(number2);

        for (int i = 0; i < 93 - 2; i++)
        {
            temp = number2;
            number2 = number1 + number2;
            number1 = temp;
            System.out.println(i + 1 + "." + number2);
        }
        // 93. sayıdan sonra long'un sınırını aşıyor
    }
}