package Week05;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String newLog = String.join(" ", log.split(""));
		System.out.println(newLog);
		
	}

	@Override
	public void error(String error) {
		String newError = "Error: " + String.join(" ", error.split(""));
		System.out.println(newError);
		
	}

}
