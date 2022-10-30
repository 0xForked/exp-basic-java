import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int height = scanner.nextInt();

        // loop - triangle height
        for (int i = 1; i <= height; i++) {
            // loop - space
            for (int j = height-1; j >= i; j--) {
                System.out.print(" ");
            }

            // loop - star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // new line
            System.out.println();
        }
    }
}