import java.util.Scanner;

public class ThreeEven {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a Even Number");
            number = object.nextInt();
            if (number % 2 == 0) {
                do {
                    System.out.println("Enter a Second Even Number");
                    number = object.nextInt();
                    if (number % 2 == 0) {
                        do {
                            System.out.println("Enter a Third Even Number");
                            number = object.nextInt();
                        } while (number % 2 == 1);
                    }
                } while (number % 2 == 1);

            }

        } while (number % 2 == 1);


    }

}
