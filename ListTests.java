import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

class ChooseShortWord implements StringChecker{
  @Override
  public boolean checkString(String s){
    return s.length() < 5;
  }
}

// class DogChecker implements StringChecker {
//     @Override
//     public boolean checkString(String s) {
//         return s.startsWith("dog");
//     }
// }

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input = new ArrayList<>(Arrays.asList("dog1", "dog2"));
        StringChecker checker = new DogChecker();
        assertEquals(new ArrayList<>(Arrays.asList("dog1", "dog2")),
                        ListExamples.filter2(input, checker));
    }

    @Test
    public void testFilter2() {
        List<String> input = new ArrayList<>(Arrays.asList("hi", "hello", "bestie", "hey"));
        StringChecker checker = new ChooseShortWord();
        assertEquals(new ArrayList<>(Arrays.asList("hi", "hey")),
                        ListExamples.filter2(input, checker));
    }

    @Test
    public void testFilter3() {
        ArrayList<String> input = new ArrayList<>();
        input.add("hi");
        input.add("hello");
        input.add("bestie");
        input.add("hey");
        StringChecker checker = new ChooseShortWord();
        assertEquals(new ArrayList<>(Arrays.asList("hi", "hey")),
                        ListExamples.filter2(input, checker));
    }

	@Test 
	public void testMerge() {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>(Arrays.asList("hi"));
        assertEquals(new ArrayList<>(Arrays.asList("hi")), 
                        ListExamples.merge2(list1, list2));
	}
}

// public class ListTests {
//     @Test
//     public void testFilter(){

//         List<String> input = Arrays.asList("one","two","three","seven","nine","four");
//         StringChecker checker = new StringChecker();
//         List<String> output = Arrays.asList("one","two","nine","four");
//         assertEquals(output, ListExamples.filter(input,checker));

//     }

//     @Test
//     public void testMerge() {
        
//         List<String> sort1 = Arrays.asList("a","b","c","f","g");
//         List<String> sort2 = Arrays.asList ("d","l","n","o","z");
//         List<String> expect = Arrays.asList("a","b","c","d","f","g","l","n","o","z");
//         assertEquals(expect, ListExamples.merge(sort1,sort2));
//     }

// }
// public class ListTests {

//     String[] arrStrs = {"Hi"};
//     String[] arrStrs2 = {"Hi", "Hello", "Hey"};

//     private ListExamples wordList1, wordList3;
//     /**
//      * Run before every test
//      */
//     // @Before
//     // public void setUp(){
//     //     List<String> wordList1 = new ArrayList<>();
//     //     wordList1.add("Hi");

//     //     List<String> wordList3 = new ArrayList<>();
//     //     wordList3.add("Hi");
//     //     wordList3.add("Hey");
//     //     wordList3.add("Hello");
//     // }
//   //given
// 	@Test 
// 	public void testReverseInPlace() {
//         List<String> input = Arrays.asList("one","two","three","seven","nine","four");
//         ListExamples.filter(wordList3, "H");
//         assertArrayEquals(input, new String[]{ "one","two","three","seven","nine","four" });
//         List<String> input = Arrays.asList("one","two","three","seven","nine","four");
//         StringChecker checker = new ListExamples();
//         List<String> output = Arrays.asList("one","two","nine","four");
//         assertEquals(output, ListExamples.filter(input,checker));
// 	}
  
// }
