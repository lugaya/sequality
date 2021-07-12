package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int sum_range(int x, int y) {
    int result = 0;
    for (int i = 0; i <= y; i++) {
      result += i;
    }
    return result;
  }

  public int[] sum_odd_even(int x, int y) {
    int[] result;
    result = new int[2];
    int a = x % 2;
    int b = (x + 1) % 2;
    for (int i = x + a; i <= y; i += 2) {
      result[0] += i;
    }
    for (int i = x + b; i <= y; i += 2) {
      result[1] += i;
    }

    return result;
  }

  public double average(int x, int y) {
    return sum(x, y) / 2.0;
  }

  public double average_range(int x, int y) {
    int sum = sum_range(x, y);
    return (double) sum / (y - x + 1);
  }
}
