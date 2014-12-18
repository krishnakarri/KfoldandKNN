import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;



/**
 * 
 * @author upendra
 *
 */
public class CVNearestNeighbor {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		BusinessLogic businessLogic = new BusinessLogic();
		businessLogic.setUpCrossValidationStuff();
		businessLogic.startValidation();
				
	}
}
 
