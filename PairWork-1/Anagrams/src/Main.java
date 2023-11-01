public class Main {

    static int func(String str, String str2)
    {
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j < str2.length() ; j++)
            {
                if (str.charAt(i) == str2.charAt(j))
                    break;
                if (j == str2.length() - 1)
                {
                    System.out.println("Anagram değiller.");
                    return 0;
                }
            }
        }
        return 1;
    }

    public static void main(String[] args) {

        String str = args[0];
        String str2 = args[1];

        if (str.length() != str2.length()) {
            System.out.println("Uzunlukları aynı değil o yüzden anagram olamazlar");
            return;
        }
        if (func(str, str2) == 1 && func(str2, str) == 1)
            System.out.println("Anagramlar");
    }
}