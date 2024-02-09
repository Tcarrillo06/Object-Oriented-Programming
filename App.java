package Week05;


public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Good Morning");
		
		System.out.println(" ");
		
		logger.error("Bye");
		
		System.out.println(" ");
		
		Logger logger2 = new SpacedLogger();
		
		logger2.log("Good Morning");
		
		System.out.println(" ");
		
		logger2.error("Bye");

	}

}
