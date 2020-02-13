package tp1ex1;
import org.apache.log4j.Logger;
import org.apache.log4j.lf5.LF5Appender;
import org.apache.log4j.lf5.LogLevel;
import org.apache.log4j.lf5.viewer.LogBrokerMonitor;
public class tp1ex1 {
   private static org.apache.log4j.Logger log = Logger.getLogger(tp1ex1.class);
   
   public static void main(String[] args) {
	   Logger rootLogger = Logger.getRootLogger();
	    LF5Appender lf5Appender = (LF5Appender) rootLogger.getAppender("LF5Appender");
	    if (lf5Appender == null) {
	    	LogBrokerMonitor logBrokerMonitor = new LogBrokerMonitor(LogLevel.getLog4JLevels()) {
	        @Override
	        protected void closeAfterConfirm() {
	          hide();
	        }
	      };
	      lf5Appender = new LF5Appender(logBrokerMonitor);
	      lf5Appender.setName("LF5Appender");
	      rootLogger.addAppender(lf5Appender);
	    }
	    lf5Appender.getLogBrokerMonitor().show();
	    log.trace("Trace Message!");
	      log.debug("Debug Message!");
	      log.info("Info Message!");
	      log.warn("Warn Message!");
	      log.error("Error Message!");
	      log.fatal("Fatal Message!");
	      
   }
}
