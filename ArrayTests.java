import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  //given
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace2(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  
  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {3, 1};
    ArrayExamples.reverseInPlace2(input1);
    assertArrayEquals(new int[]{1, 3}, input1);
	}

  @Test 
	public void testReverseInPlace3() {
    int[] input1 = {3, 1, 4, 6, 5};
    ArrayExamples.reverseInPlace2(input1);
    assertArrayEquals(new int[]{5, 6, 4, 1, 3}, input1);
	}

  //given
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed2(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {3, 1, 4, 6, 5};
    assertArrayEquals(new int[]{5, 6, 4, 1, 3}, ArrayExamples.reversed2(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = {3, 1, 4, 6};
    assertArrayEquals(new int[]{6, 4, 1, 3}, ArrayExamples.reversed2(input1));
  }

  @Test
  public void testReversed4() {
    int[] input1 = { 1 };
    assertArrayEquals(new int[]{ 1 }, ArrayExamples.reversed2(input1));
  }

  @Test
  public void testAverageWithoutLowestDuplicateLowest() {
    double[] input = {1, 2, 1};
    assertTrue(1.5 == ArrayExamples.averageWithoutLowest2(input));
  }
}
