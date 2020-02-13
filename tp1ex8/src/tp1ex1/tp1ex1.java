package tp1ex1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class tp1ex1 {

    private static final Logger log = LogManager.getLogger(tp1ex1.class);

    public static void main(String[] args) {

    	      log.trace("Trace Message!");
    	      log.debug("Debug Message!");
    	      log.info("Info Message!");
    	      log.warn("Warn Message!");
    	      log.error("Error Message!");
    	      log.fatal("Fatal Message!");
    }
}
