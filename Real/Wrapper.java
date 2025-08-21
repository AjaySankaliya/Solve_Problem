import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total rupees: ");
        int rupee = sc.nextInt();

        System.out.print("Enter chocolate price: ");
        int chocolatePrice = sc.nextInt();

        System.out.print("Enter wrapper offer (e.g., 3 wrappers = 1 chocolate): ");
        int WrapperOffer = sc.nextInt();

        int chocolate = rupee / chocolatePrice;
        int numberOfChocolate = chocolate;

        int Wrapper = chocolate;

        while (Wrapper >= WrapperOffer) {
            int newChocolate = Wrapper / WrapperOffer;
            numberOfChocolate += newChocolate;
            Wrapper = (Wrapper % WrapperOffer) + newChocolate;
        }
        System.out.println("Total Chocolates: " + numberOfChocolate);
    }
}
