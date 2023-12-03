package Jenkins;

public class Test {
	@org.testng.annotations.Test
	public void testA() {
		String un=System.getProperty("username");
		System.out.println(un);
		System.out.println("Hi");
		System.out.println("Hello");
	}
}
