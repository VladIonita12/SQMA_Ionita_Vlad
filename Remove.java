
public class Remove {
	StudentClass obj = new StudentClass();
 @Test  
	    public void testRemove() {  
	        obj.add("Antonio");  
	        obj.add("Paul");  
	          
	        assertEquals("Removing 1 student from list", 2, obj.sizeOfStudent());  
	    }  
  
      
   


}
