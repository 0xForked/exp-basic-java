import java.util.Scanner; 
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  int satuanAwal = 0;
  int satuanAkhir = 0;
  double panjangSatuan = 0;

  public static void main(String[] args) {
    System.out.println("PENGKONVERSIAN SATUAN PANJANG");
    Main main = new Main();
    System.out.println("=============================");
    main.menuList(true);
    System.out.println("=============================");
    main.menuList(false);
    System.out.println("=============================");
    double result = main.calculate();
    String primaryMenu = main.longMenuName(main.satuanAwal);
    String secondaryMenu = main.longMenuName(main.satuanAkhir);
    String resultUnit = main.shortMenuName(main.satuanAkhir);
    System.out.println("KONVERSI " + primaryMenu + " KE " + secondaryMenu);
    System.out.println("HASIL KONFERSI : " + result + " " + resultUnit);
    System.out.println("=============================");
  }
  
  private void menuList(boolean isPrimary) {
    // TITLE
    String menuType = isPrimary ? "AWAL": "AKHIR";
    System.out.println("SILAHKAN PILIH SATUAN " + menuType + ":");
    // MENU
    System.out.println("1. KILOMETER");
    System.out.println("2. METER");
    System.out.println("3. CENTIMETER");
    System.out.println("4. MILIMETER");
    // INPUT
    if (isPrimary) {
      Scanner inputSatuanAwal = new Scanner(System.in);
      System.out.print("Masukkan Angka:");
      this.satuanAwal = Integer.parseInt(inputSatuanAwal.nextLine());
    } else {
      Scanner inputSatuanAkhir = new Scanner(System.in);
      System.out.print("Masukkan Angka:");
      this.satuanAkhir = Integer.parseInt(inputSatuanAkhir.nextLine());
    }
    // VALIDATION
    List<Integer> menuList = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4}));
    if (!menuList.contains(this.satuanAwal)) {
      System.out.println("=========================================");
      System.out.println("MENU TIDAK TERSEDIA, SILAHKAN PILIH LAGI!");
      System.out.println("=========================================");
      this.menuList(isPrimary);
    }
  }

  private String longMenuName(int selectedMenu) {
    String unit = "";

    switch(selectedMenu) {
      case 1:
        unit = "KILOMETER";
        break;
      case 2:
        unit = "METER";
        break;
      case 3:
        unit = "CENTIMETER";
        break;
      case 4:
        unit = "MILIMETER";
        break;
    }

    return unit;
  }

  private String shortMenuName(int selectedMenu) {
    String unit = "";

    switch(selectedMenu) {
      case 1:
        unit = "KM";
        break;
      case 2:
        unit = "M";
        break;
      case 3:
        unit = "CM";
        break;
      case 4:
        unit = "MM";
        break;
    }

    return unit;
  }

  private double calculate() {
    Scanner inputPanjangSatuan = new Scanner(System.in);
    System.out.print("Masukkan Panjang:");
    this.panjangSatuan = Double.parseDouble(inputPanjangSatuan.nextLine());
    double converter = this.convert(this.satuanAwal, this.satuanAkhir);
    return converter;
  }

  private double convert(int a, int b) {
    double val = this.panjangSatuan;
    String from = this.shortMenuName(a);
    String to = this.shortMenuName(b);

    switch(from + "_" + to) {
      case "KM_KM": 
        val = this.panjangSatuan * 1;
        break;
      case "KM_M": 
        val = this.panjangSatuan * 1000;
        break;
      case "KM_CM": 
        val = this.panjangSatuan * 100000;
        break;
      case "KM_MM": 
        val = this.panjangSatuan * 1000000;
        break; 
      // LANJUTKAN
      // .....
    }

    return val;

  }
}