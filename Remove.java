
import static org.junit.Assert.*;


import org.junit.Test;

public class Remove {

StudentClass obj = new StudentClass();


    @Test  
    public void testRemove() {  
        obj.add("Antonio");  
        obj.add("Paul");  
        obj.remove("Paul");  
        assertEquals("Removing 1 student from list", 1, obj.sizeOfStudent());  
    }  

      
    @Test  
    public void removeAll() {  
        obj.removeAll();  
    }  

}
