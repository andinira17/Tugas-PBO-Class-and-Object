import java.util.Scanner;
public class soal1 {
  public static void main(String[] args) {
    int a;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan sebuah bilangan : ");
    a = scan.nextInt();
    if (a % 2 == 0) {
      System.out.print("Bilangan " + a + " adalah Genap.\n");
    } else {
      System.out.print("Bilangan " + a + " adalah Ganjil.\n");
    }
  }
}