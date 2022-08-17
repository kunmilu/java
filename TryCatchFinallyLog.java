import java.util.logging.*;

public class TryCatchFinallyLog {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(TryCatchFinallyLog.class.getName());
		logger.setLevel(Level.ALL);
		// ConsoleHandler consoleHandler = new ConsoleHandler();
		// logger.addHandler(consoleHandler);

		try {
			logger.warning("try");
			long num = Integer.parseInt(args[0]);
		} catch (Exception e) {
			logger.severe("catch");
		} finally {
			logger.info("finally");
		}
	}
}