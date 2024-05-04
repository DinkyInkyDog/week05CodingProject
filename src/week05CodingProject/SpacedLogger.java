package week05CodingProject;

public class SpacedLogger implements Logger {
	
	@Override
	public void log(String log) {
		StringBuilder spacedLog = new StringBuilder();
		for (int i = 0; i < log.length(); i++) {
			spacedLog.append(" ");
			spacedLog.append(log.charAt(i));
			spacedLog.append(" ");
		}
		System.out.println(spacedLog.toString());
	}

	@Override
	public void error(String error) {
		StringBuilder spacedLog = new StringBuilder();
		for (int i = 0; i < error.length(); i++) {
			spacedLog.append(" ");
			spacedLog.append(error.charAt(i));
			spacedLog.append(" ");
		}
		System.out.println("ERROR:" + spacedLog);
	}

}
