import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;
public class DuplicateCounter {


		   Map<String,Integer> wordCounter = new HashMap<>();
	   
		   Integer counter=1;

	   public void remove(String dataFile) {

	       try {
	    	   
	    	  Scanner input = new Scanner(Paths.get("problem2.txt"));
	    	
	          while (input.hasNext()) {
	        	  if(wordCounter.containsKey(input.next().toLowerCase())) {
	          wordCounter.put(input.next().toLowerCase(),++counter);
	        	  }else {
	        		  wordCounter.put(input.next().toLowerCase(),counter);
	        	  }
	     }
	       } catch ( IOException ioex) {
	           System.out.println("Please restart program");
	       }

	   }
	   public void write(String outputFile) {
		   
    try {
    	
        PrintWriter writer = new PrintWriter(new File(outputFile));
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {

            writer.write(entry.getKey()+"   "+entry.getValue());
            
        }
        writer.close();
        
    } catch (IOException ioex) {
    	
        System.out.println("Please restart program");
        
    }
}

}
