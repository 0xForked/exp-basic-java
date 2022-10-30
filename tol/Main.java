import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String waktu = scanner.nextLine();
        String antrian = scanner.nextLine();
        String kecepatan = scanner.nextLine();
        
        System.out.println(waktu);
        System.out.println(antrian.split("\\s").length);
        System.out.println(antrian.split("\\s")[0]);
        System.out.println(antrian.split("\\s")[1]);
    }
}

// KRITERIA
// 1. pastikan pintu tol hanya ada 3 dan masukkan intensitasnya unik
// 2. dipastikan hanya ada 2 kendaraan yang sedang mengarah ke luar gerbang tol
// 3. dipastikan jarak masuk kendaraan adalah sama
// 4. tebak pintuk tol yang dipilih kendaraan pertama dalam masukkan

// LARANGAN
// dilarang menggunakan array, looping, dan method