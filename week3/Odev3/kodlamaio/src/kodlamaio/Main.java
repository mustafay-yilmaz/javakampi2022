package kodlamaio;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.business.InstructorManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.dataAcces.HibernateCategoryDao;
import kodlamaio.dataAcces.HibernateCourseDao;
import kodlamaio.dataAcces.HibernateInstructorDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;
import kodlamaio.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Instructor instructor = new Instructor("Engin", "Demiroð", 1);

		Category[] categories = { new Category(1, "Programlama") };

		Course[] courses = { new Course("Java", 0, instructor, 1, categories[0]),
				new Course("C#", 0, instructor, 1, categories[0]) };

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		courseManager.add(courses[0]);

		System.out.println("***************************************");

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(categories[0]);

		System.out.println("***************************************");

		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);

	}

}
