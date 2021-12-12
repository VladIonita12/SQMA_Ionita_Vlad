
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Add {

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
    public void testAdd() {  
        obj.add("Emma");  
        obj.add("Ronan");  
        obj.add("Antonio");  
        obj.add("Paul");  
        assertEquals("Adding 4 student to list", 4, obj.sizeOfStudent());  
    }  
      
    @Test  
    public void testSize() {  
        obj.add("Emma");  
        obj.add("Ronan");  
        obj.add("Antonio");  
        assertEquals("Checking size of List", 3, obj.sizeOfStudent());  
    }  
      

      
    @Test  
    public void removeAll() {  
        obj.removeAll();  
    }  

}
