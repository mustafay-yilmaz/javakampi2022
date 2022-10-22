package polymorphismDemo;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		/*
		 * EmailLogger logger= new EmailLogger(); logger.Log("Log mesaj�");
		 */

		/*
		 * BaseLogger []loggers= new BaseLogger [] {new FileLogger(),new
		 * EmailLogger(),new DataBaseLogger(),new ConsoleLogger()};
		 * 
		 * for (BaseLogger logger:loggers) { logger.Log("Log mesaj�"); }
		 */

		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.add();

	}

}
