package week05CodingProject;

public class AsteriskLogger implements Logger {

//in order for the class to connect to the interface you need to have implements interfaceName after the class name.

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");

	}
	//the @override is just letting us know that the method came from the interface.

	@Override
	public void error(String error) {
		System.out.println("****************");
		System.out.println("***Error: " + error + "***");
		System.out.println("****************");

	}
}
