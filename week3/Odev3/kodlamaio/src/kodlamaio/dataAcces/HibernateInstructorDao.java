package kodlamaio.dataAcces;

import kodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritaban�na eklendi");

	}

}
