import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Assumptionsdemo {
	@Test
	void testonassume() {
		int a=5,s=25;
		Assumptions.assumeTrue(s==a*a);
		System.out.println("it will dsiplay");
	}

}
