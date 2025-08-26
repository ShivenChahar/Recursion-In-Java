public class PrintSeries0toN {
  public static void main(String[] args) {
      PrintSeriesReccursive(5);
  }
  static void PrintSeriesReccursive(int n) {
    if (n == 0) {
      return;
    }
    PrintSeriesReccursive(n - 1);
    System.out.println(n);
  }
}
