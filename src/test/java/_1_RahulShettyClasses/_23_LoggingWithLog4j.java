package _1_RahulShettyClasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class _23_LoggingWithLog4j {
	private static Logger log= LogManager.getLogger(_23_LoggingWithLog4j.class.getName());
	public static void main(String[] args) {
		
		log.info("this is sample log");
		int a  = 5;
		int b = 10;
		if(a<b) {
			log.error("this is error this cant be right");
		}
		else {
			log.fatal("this is not ok");
		}
		log.warn("this can run into an error");
	}

}
