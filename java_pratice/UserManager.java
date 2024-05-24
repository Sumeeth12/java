public class UserManager {
	public static void userAuthentication(String userName, String password) {
		System.out.println("UserName/email: " + userName +" "+"Password: "+password);
	}
	
	public static void userAuthentication(long phNO, int pin) {
		System.out.println("Phone Number: " + phNO +" "+"Pin: "+pin);
	}

	public static void main(String[] args) {
		String userName;
		String email;
		String passWord;
		long phNo;;
		short pin;
		userAuthentication("chindamsumeeth12", "sumeeth12");
		userAuthentication("chindamsumeeth5125@gmail.com", "sumeeth12");
		userAuthentication(9346313941, 1523);

	}
