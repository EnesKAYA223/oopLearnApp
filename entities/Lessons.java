package oopLearnApp.entities;



public class Lessons {

	private String teacher;
	private String lessonName;
	private String category;
	private int lessonPrice;

	public Lessons(String teacher, String lessonName, String category, int lessonPrice) {

		this.teacher = teacher;
		this.lessonName = lessonName;
		this.category = category;
		this.lessonPrice = lessonPrice;
	}

	public Lessons() {

	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getLessonPrice() {
		return lessonPrice;
	}

	public void setLessonPrice(int lessonPrice) {
		this.lessonPrice = lessonPrice;
	}
	
	
	
	

}
