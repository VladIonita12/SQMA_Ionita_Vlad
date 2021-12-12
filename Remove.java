
public class Remove {
	StudentClass obj = new StudentClass();

	 @Test  
	    public void testRemove() {  
	        obj.add("Antonio");  
	        obj.add("Paul");  
	        obj.removeAll();  
	        assertEquals("Removing all students from list", 0, obj.sizeOfStudent());  
	    }  
  
      
   


}
