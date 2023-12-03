package Jenkins;

import org.testng.annotations.Test;

public class Parameters {
	@Test
	public void demo() {
		String un=System.getProperty("username");
		System.out.println(un);
	}

}
