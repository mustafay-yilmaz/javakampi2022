package kodlamaio.dataAcces;

import kodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritaban�na eklendi");

	}
}
