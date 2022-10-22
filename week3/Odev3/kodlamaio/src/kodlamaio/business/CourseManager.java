package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAcces.CourseDao;
import kodlamaio.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private Course[] courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, Course[] courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {

		for (Course i : courses) {
			if (course.getName().equals(i)) {
				throw new Exception("Ayn� isimde iki kurs olu�turulamaz!");
			}
		}

		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyat� 0 TL'den k���k olamaz!");
		} else {
			courseDao.add(course);
		}

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}

	}
}
