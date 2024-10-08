package LapTrinhWeb_Cha.dao;

import java.util.List;

import LapTrinhWeb_Cha.models.CategoryModel;

public interface ICategoryDao {
	void insert(CategoryModel category);

	void edit(CategoryModel category);

	void delete(int id);
	
	void update(CategoryModel category);

	CategoryModel get(int id);

	CategoryModel get(String name);

	List<CategoryModel> getAll();

	List<CategoryModel> search(String keyword);

	CategoryModel findById(int id);

	List<CategoryModel> findByCategoryName(String name);

	List<CategoryModel> findAll();
}
