package LapTrinhWeb_Cha.services.impl;

import java.io.File;
import java.util.List;

import LapTrinhWeb_Cha.dao.impl.CategoryDaoImpl;
import LapTrinhWeb_Cha.models.CategoryModel;
import LapTrinhWeb_Cha.services.ICategoryService;

public class CategoryServiceImpl implements ICategoryService {

	CategoryDaoImpl categoryDao = new CategoryDaoImpl();

	@Override
	public void insert(CategoryModel category) {
		categoryDao.insert(category);

	}

	@Override
	public void edit(CategoryModel newCategory) {
		CategoryModel oldCate = categoryDao.get(newCategory.getCateid());
		oldCate.setCatename(newCategory.getCatename());
		categoryDao.edit(oldCate);
		if (newCategory.getImages() != null) {
			// XOA ANH CU DI
			String fileName = oldCate.getImages();
			final String dir = "E:\\upload";
			File file = new File(dir + "/category" + fileName);
			if (file.exists()) {
				file.delete();
			}
			oldCate.setImages(newCategory.getImages());
		}
		categoryDao.edit(oldCate);
	}

	@Override
	public void delete(int id) {
		categoryDao.delete(id);
	}

	@Override
	public CategoryModel get(int id) {
		return categoryDao.get(id);
	}

	@Override
	public CategoryModel get(String name) {
		return categoryDao.get(name);
	}

	@Override
	public List<CategoryModel> getAll() {
		return categoryDao.getAll();
	}

	@Override
	public List<CategoryModel> search(String catename) {
		return categoryDao.search(catename);
	}

	@Override
	public CategoryModel findById(int id) {
		return categoryDao.findById(id);
	}

	@Override
	public List<CategoryModel> findByCategoryName(String name) {
		return categoryDao.findByCategoryName(name);
	}

	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}

	@Override
	public void update(CategoryModel category) {
		CategoryModel oldCate = categoryDao.findById(category.getCateid());
		oldCate.setCatename(category.getCatename());
		oldCate.setStatus(category.getStatus());
		if (category.getImages() != null) {
			String fileName = oldCate.getImages();
			final String dir = "D:\\upload";
			File file = new File(dir + "/category" + fileName);
			if (file.exists()) {
				file.delete();
			}
			oldCate.setImages(category.getImages());
		}

		categoryDao.update(oldCate);
	}

}
