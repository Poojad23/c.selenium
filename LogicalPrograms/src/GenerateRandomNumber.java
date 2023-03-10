import java.util.Random;

public class GenerateRandomNumber {
public static void main(String[] args) {
		
		Random random=new Random();
		int generateNumber = random.nextInt();
		System.out.print(generateNumber);

	}
}
