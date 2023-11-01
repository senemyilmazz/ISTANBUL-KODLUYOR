public class Main {

    public static void main(String[] args) {
        int count = 0;
        long sum = 0;

        // kısa sürede sadece 4 tane Perfect Number bulabilir
        // vaktin varsa sonuna kadar bekle :)
        for (long i = 1; count < 10 ; i++)
        {
            if (i > 8200)
                return;
            sum = 0;
            for (long j = 1; j < i ; j++)
            {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i){
                count++;
                System.out.println(i + " is a perfect number.");
            }
        }
    }
}