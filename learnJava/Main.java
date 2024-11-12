public class Main {
    // example of a recursion method

    public static void main(String[] args) {
      int result = sum(10);
      System.out.println(result);
    }
    public static int sum(int k) {
      if (k > 0) {
        return k + sum(k - 1);
      } else {
        return 0;
      }
    }
  }

