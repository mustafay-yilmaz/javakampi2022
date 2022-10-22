package kodlamaio.dataAcces;

import kodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanýna eklendi");

	}

}
