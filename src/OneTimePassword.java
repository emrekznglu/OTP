import java.util.ArrayList;
import java.util.Random;

public class OneTimePassword {

	public static void main(String[] args) {
		
		// OTP = One Time Password (Examples: Steam Guard, Google Authenticator)
		// Everytime you run this program, it gives you a random numeric password which has 5 digits.
		// Bu programı çalıştırdığınız vakit, size 5 basamaklı rastgele sayısal bir şifre verir.
		
		ArrayList<Integer> otplist = new ArrayList<>();
		
		Random rand = new Random();
		int temp=0;
		for (int i = 0; i < 5; i++) {
			temp=rand.nextInt(10);
			otplist.add(temp);
		}
		System.out.println("This is your OTP: "+otplist);
	
	}
}
