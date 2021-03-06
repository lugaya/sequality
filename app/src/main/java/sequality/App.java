/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public String getTwoValSumAndAverage() {
    Calculate calculate = new Calculate();
    int a = 2;
    int b = 3;
    int sum = calculate.sum(a, b);
    double ave = calculate.average(a, b);
    return "Sum of " + a + " and " + b + " is " + sum + ". Average is " + ave + ".";
  }

  public String getSumAndAverage() {
    Calculate calculate = new Calculate();
    int a = 1;
    int b = 10;
    int sum = calculate.sum_range(a, b);
    double ave = calculate.average_range(a, b);
    return "Sum of " + a + " to " + b + " is " + sum + ". Average is " + ave + ".";
  }

  public String getOddSumAndEvenSum() {
    Calculate calculate = new Calculate();
    int a = 1;
    int b = 10;
    int[] sum;
    sum = new int[2];
    sum = calculate.sum_odd_even(a, b);
    return "Sum of odd of " + a + " to " + b + " is " + sum[1] + ". Sum of even is " + sum[0] + ".";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out.println(new App().getTwoValSumAndAverage());
    System.out.println(new App().getSumAndAverage());
    System.out.println(new App().getOddSumAndEvenSum());
  }

}
