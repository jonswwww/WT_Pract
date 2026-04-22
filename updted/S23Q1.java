import java.util.Scanner;

class S23Q1 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(isVowel(ch)) {
                System.out.println(ch);

                try {
                    Thread.sleep(3000); // sleep for 3 seconds
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        scanner.close();
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
