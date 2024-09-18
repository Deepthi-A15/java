import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Testonassumption {
	@Test
	  void testassumption(){
		int a=5,b=5;
	Assumptions.assumingThat(a==b,()->{System.out.println("Testing a==b");});
	}
}
