import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

	}

  @Test 
	public void testReverseInPlace2() {

    int[] input2 = {1, 2};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{2, 1}, input2);

	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {1, 2, 3, 4, 5};
    ArrayExamples.reversed(input2);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input2);
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input =  {1, 1, 1, 1, 2};
    double output = ArrayExamples.averageWithoutLowest(input);

    assertEquals(2.0, output, 0.001);
  }

}
