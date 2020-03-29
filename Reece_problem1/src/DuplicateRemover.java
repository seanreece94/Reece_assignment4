import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashSet;

public class DuplicateRemover {


	Set<String> uniqueWords = new HashSet<>();
	   
	  public void write(String outputFile) {
		   
		    try {
		    	
		        PrintWriter writer = new PrintWriter(new File(outputFile));

		        for (String word : uniqueWords) {

		            writer.println(word);
		            
		        }
		        writer.close();
		        
		    } catch (IOException ioex) {
		    	
		        System.out.println("Please restart program");
		        
		    }
		}

	   public void remove(String dataFile) {

	       try {
	    	   
	    	  Scanner input = new Scanner(Paths.get("problem1.txt"));
	    	
	          while (input.hasNext()) {
	        	  
	          uniqueWords.add(input.next().toLowerCase());
	        	  
	     }
	       } catch ( IOException ioex) {
	           System.out.println("Please restart program");
	       }

	   }
	   

}
