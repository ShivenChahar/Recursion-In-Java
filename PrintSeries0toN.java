public class PrintSeries0toN {
  public static void main(String[] args) {
      PrintSeriesReccursive(5);
  }
  static void PrintSeriesReccursive(int n) {
    if (n == 0) {
      return;
    }
    PrintSeriesReccursive(n - 1);//Imp Point we can not use n-- here because it will first print the ans and then reduce the value which will result in a infinte printing, So instead we will be using --n to avoid this infinity.
    System.out.println(n);
  }
}
