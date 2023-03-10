package testNGpackage;

import org.testng.annotations.Test;

public class Day1 {
	@Test
		public void A1() {
			System.out.println("Day1");
		}
		
		@Test(enabled=true)
		public void FirstTestCase() {
			System.out.println("JAVA");
		}
		
		@Test
		public void SecondTestCase() {
			System.out.println("SELENIUM");
		}
}
