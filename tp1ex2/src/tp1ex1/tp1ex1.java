package tp1ex1;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class tp1ex1 {
   private static org.apache.log4j.Logger log = Logger.getLogger(tp1ex1.class);
   
   public static void main(String[] args) {
	   Logger logRoot = Logger.getRootLogger();
	    ConsoleAppender ca = new ConsoleAppender();
	    ca.setName("console");
	    ca.setLayout(new SimpleLayout());
	    ca.activateOptions();
	    logRoot.addAppender(ca);
	    logRoot.setLevel(Level.INFO);
      log.trace("Trace Message!");
      log.debug("Debug Message!");
      log.info("Info Message!");
      log.warn("Warn Message!");
      log.error("Error Message!");
      log.fatal("Fatal Message!");
   }
}
