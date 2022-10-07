package oopLearnApp;

import oopLearnApp.business.LessonsManager;
import oopLearnApp.core.logging.DatabaseLogger;
import oopLearnApp.core.logging.FileLogger;
import oopLearnApp.core.logging.Logger;
import oopLearnApp.core.logging.MailLogger;
import oopLearnApp.dataAccess.HibernateLessonsDao;
import oopLearnApp.dataAccess.JdbsLessonsDao;
import oopLearnApp.entities.Lessons;

public class Main {

	public static void main(String[] args) {

		
		
		Lessons lessons=new Lessons("Enes","javaProgramlama","yazýlým",10);
		
		Logger[] loggers= {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		LessonsManager manager=new LessonsManager(new HibernateLessonsDao(), loggers);
		try {
			manager.add(lessons);
		} catch (Exception e) {

		}
		
		
		
	}

}
