public class ProductNto1 {
  public static void main(String[] args) {
    int Fact = FactorialRecursive(5);
    System.out.println(Fact);
  }
  static int FactorialRecursive (int n) {
    if (n == 1) {
      return 1;
    }
    return n * FactorialRecursive(n - 1);
  }
}

