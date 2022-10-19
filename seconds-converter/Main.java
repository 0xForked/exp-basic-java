import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner inputDetik = new Scanner(System.in);
        System.out.print("Masukkan Detik: ");
        int detikInputan = Integer.parseInt(inputDetik.nextLine());
    
        Main main = new Main();
        String result = main.calculate(detikInputan);
        System.out.println(result);
    }

    private String calculate(int detikInputan) {
        int S = detikInputan % 60;
        int H = detikInputan / 60;
        int M = H % 60;
        H = H / 60;
        
        return String.format("%02d", H) 
            + ":" + String.format("%02d", M)
            + ":" + String.format("%02d", S);
    }
}