package	org.example;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		double	dollarYesterday = 27.98;
		double	accountBalance = 0;
		double	dollarToday = getInput("Lütfen bugünün dolar kurunu giriniz: ", scanner);
		dollarIncrease(dollarYesterday, dollarToday);
		Integer choice = 0;
		boolean	get = true;

		while(choice != 3)
		{
			choice = getChoice("Devam etmek istiyorsanız seçiniz.", scanner);
			if	(get && (choice == 1 || choice == 2))
				accountBalance = getInput("Lütfen TL hesabınızdaki bakiyenizi giriniz: ", scanner);
			get = false;
			switch(choice) {
				case 1:
					System.out.println("Dolar karşılığı:" + (accountBalance / dollarToday));
					System.out.println();
					break;
				case 2:
					System.out.println("Kar(+) / Zarar (-):" + ((accountBalance / dollarToday) - (accountBalance / dollarYesterday)));
					System.out.println();
					break;
				case 3:
					System.out.println("Güle güle :)");
					System.out.println();
					break;
			}
		}
		scanner.close();
		screenCleaner();
	}
	public static void dollarIncrease(double dollarYesterday, double dollarToday)
	{
		if (dollarToday < dollarYesterday)
			System.out.println("Dollar decreased");
		else if (dollarToday > dollarYesterday)
			System.out.println("Dollar increased");
		else
			System.out.println("Dollar has not changed");
		System.out.println();
	}
	public static double getInput(String str, Scanner scanner)
	{
		System.out.print(str);
		String inputS = scanner.nextLine();
		double input;
		try
		{
			input = Double.parseDouble(inputS);
		}
		catch(Exception e)
		{
			System.out.println();
			System.out.println("Lütfen tutarı tekrar giriniz. Örnek: 50600.89");
			input = getInput(str, scanner);
		}
		while (input < 0)
		{
			System.out.println();
			System.out.println("Negatif bir değer girdiniz.");
			input = getInput(str, scanner);
		}
		return (input);
	}

	public static int	getChoice(String str, Scanner scanner)
	{
		System.out.println(str);
		System.out.println();
		System.out.println("1 -Kaç dolarınız olduğunu hesaplamak için 1 giriniz.");
		System.out.println("2 -Dünkü dolar kuruna göre kar/zarar hesaplamak için 2 giriniz.");
		System.out.println("3 -Çıkmak için 3 giriniz.");
		System.out.println();
		String inputS = scanner.nextLine();
		Integer input;
		try
		{
			input = Integer.parseInt(inputS);
		}
		catch(Exception e)
		{
			System.out.println("'"+ inputS + "'" + " Seçeneği yok, lütfen tekrar giriniz.");
			input = getChoice(str, scanner);
		}
		while (input < 1 || input > 3)
		{
			System.out.println("'" + input + "'" + " Seçeneği yok, lütfen tekrar giriniz.");
			input = getChoice(str, scanner);
		}
		return (input);
	}
	public static void screenCleaner()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
