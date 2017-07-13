package pattern.behavioral.chainofresp.exam2;

public class ChainOfResponsibilityExample {
	public static void main(String[] args) {
		Logger logger, logger1;
		logger1 = logger = new StdoutLogger(Logger.DEBUG);
		logger1 = logger1.setNext(new EmailLogger(Logger.NOTICE));
		logger1 = logger1.setNext(new StderrLogger(Logger.ERR));
		
		logger.message("Entering funcion y.", Logger.DEBUG);
		logger.message("Step compleeted", Logger.NOTICE);
		// Handled by all three loggers
        logger.message("An error has occurred.", Logger.ERR);
	}
}
