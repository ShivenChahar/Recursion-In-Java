public class PrintSeriesNto0 {
  public static void main(String[] args) {
    PrintSeriesReccursive(5);
  }

  static void PrintSeriesReccursive(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    PrintSeriesReccursive(n - 1);
  }
}
