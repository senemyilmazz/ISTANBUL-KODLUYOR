public class Main {
    public static void main(String[] args) {
        System.out.println(args[0]);
        int count = 1;
        int flag = 0;
        String str = args[0];

        for (int i = 0; i < str.length(); i++)
        {
            flag = 0;
            for (int x = 0; x < i; x++) {
                if (str.charAt(x) == str.charAt(i)) {
                    flag = 1;
                    break;
                }
            }
            count = 1;
            if (flag == 1)
                continue;
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (i != 0)
                System.out.print(", ");
            System.out.print(str.charAt(i) + ": " + count);
        }
    }
}