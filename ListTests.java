import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

public class ListTests {

  @Test
  public void testMerge(){
    ArrayList<String> input1 = new ArrayList<String>();
    ArrayList<String> input2 = new ArrayList<String>();
    input1.add("a");
    input1.add("d");
    input2.add("c");
    input2.add("b");

    ArrayList<String> output = new ArrayList<String>();
    output.add("a");
    output.add("b");
    output.add("c");
    output.add("d");

    assertEquals(output, ListExamples.merge(input1, input2));
  }

  @Test
  public void testFilter(){
        ArrayList<String> input1 = new ArrayList<String>();
        input1.add("a");
        input1.add("d");
       
        ListExamples.filter(input1, new MyChecker());

        ArrayList<String> output = new ArrayList<String>();
        output.add("a");

        assertEquals(output, input1);


  }
}
