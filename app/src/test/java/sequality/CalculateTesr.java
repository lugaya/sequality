package sequality;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTesr {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testSum_range() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sum_range(1, 10));
  }

  @Test
  public void testSumOddEven() {
    Calculate calculate = new Calculate();
    int[] expected = { 30, 25 };
    assertArrayEquals(expected, calculate.sum_odd_even(1, 10));
    int[] expected_2 = { 30, 35 };
    assertArrayEquals(expected_2, calculate.sum_odd_even(2, 11));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0.1);
  }

  @Test
  public void testAverage_range() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.average_range(1, 10), 0.1);
  }
}
