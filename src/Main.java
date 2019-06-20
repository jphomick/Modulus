import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter a number followed by the number to mod:");
        int one = read.nextInt();
        int two = read.nextInt();

        System.out.println(one + " % " + two + " is " + (one % two));
    }
}
