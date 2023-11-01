public class Main {

    static int func(int number)
    {
        return (number * number * number);
    }

    public static void main(String[] args) {

        int number;
        int numberYedek;
        int cub = 0;

        number =  Integer.parseInt(args[0]);
        numberYedek = number;

        System.out.println(number);

        while (number > 0)
        {
            cub += func(number % 10);
            number =  number / 10;
        }

        System.out.println(cub);

        if (cub == numberYedek)
            System.out.println("Bu bir armstrong sayıdır.");
        else
            System.out.println("Armstrong sayı değildir.");

        /*
        152 -> integer'a çevir
        152 % 10 = 2
        152 / 10 = 15
        ...
        15%10 = 5
        15 / 10 = 1

        */
    }

}