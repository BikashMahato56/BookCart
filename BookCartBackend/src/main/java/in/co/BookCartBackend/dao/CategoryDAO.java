package in.co.BookCartBackend.dao;

import java.util.List;

import in.co.BookCartBackend.dto.Category;

public interface CategoryDAO {
	List<Category> list();
	Category get(int id);

}
