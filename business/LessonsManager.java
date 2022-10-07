package oopLearnApp.business;

import oopLearnApp.core.logging.Logger;
import oopLearnApp.dataAccess.JdbsLessonsDao;
import oopLearnApp.dataAccess.LessonsDao;
import oopLearnApp.entities.Lessons;

public class LessonsManager {
	
	
	private LessonsDao lessonsDao;
	
	private Logger[] loggers;
	
	
	
	
	public LessonsManager(LessonsDao lessonsDao,Logger[] loggers) {

		this.lessonsDao = lessonsDao;
		this.loggers=loggers;
	}




	public void add(Lessons lessons) throws Exception {
		//Ýþ kurallari bu sinifda yazilir
		
	
		
		  if (lessons.getLessonPrice()<0) {
		  
		  throw new Exception("Ürün Fiyati Sýfýrdan küçük olamaz") ;
		  
		  }
		 
		  lessonsDao.add(lessons);
		
		  
		  for (Logger logger : loggers) {
			logger.log(lessons.getLessonName());		}
		  
		  
		
		
	}

}
