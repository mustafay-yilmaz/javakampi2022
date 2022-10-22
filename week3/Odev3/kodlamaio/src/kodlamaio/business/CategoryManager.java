package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAcces.CategoryDao;
import kodlamaio.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private Category[] categories;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, Category[] categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {

		for (Category i : categories) {
			if (category.getName().equals(i)) {
				throw new Exception("Ayný isimde iki kategori oluþturulamaz!");
			}
		}

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
}
