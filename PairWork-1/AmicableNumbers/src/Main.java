

public class Main {

    static int fun(int number)
    {
        int result = 0;
        for (int i = 1; i < number; i++)
        {
            if (number % i == 0)
                result += i;
        }
        return (result);
    }

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; count < 2 ; i++) {
            for (int j = i+ 1; j <= fun(i) ; j++) {
                if (fun(i) == j && fun(j) == i) {
                    System.out.println(i + " " + j + " Amicable numbers");
                    count++;
                }
            }
        }
    }
}