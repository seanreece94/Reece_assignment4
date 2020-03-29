
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCounter duplicateCounter= new DuplicateCounter();
		
		duplicateCounter.remove("problem2.txt");
		
		duplicateCounter.write("unique_words_count.txt");
	}

}
