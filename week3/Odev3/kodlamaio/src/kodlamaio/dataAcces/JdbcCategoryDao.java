package kodlamaio.dataAcces;

import kodlamaio.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanýna eklendi");
		
	}

}
