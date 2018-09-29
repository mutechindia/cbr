package test;

import org.apache.log4j.Logger;

public class TetstLogger {
	private static Logger log = Logger.getLogger(TetstLogger.class);

	public static void main(String[] args) {

		log.info("----info----");
		log.error("----error---");
		log.debug("---debug---");
		log.fatal("----fatel---");
		log.warn("-----warning----");
		log.trace("----trace---");
	}

}
