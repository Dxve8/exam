package exam;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
  		swing obj=new swing();
  		 int  n=obj.square(4);
  		assertEquals(16,n);
  		
  		swing obj1=new swing();
  		int a = 0,b=obj1.add(5, 5);
  		assertEquals(10,a,b);
  		
	}

}
