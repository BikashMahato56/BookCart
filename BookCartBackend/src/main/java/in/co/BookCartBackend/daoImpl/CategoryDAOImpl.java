package in.co.BookCartBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import in.co.BookCartBackend.dao.CategoryDAO;
import in.co.BookCartBackend.dto.Category;
@Repository("categoryDao")
public class CategoryDAOImpl implements CategoryDAO {
	private static List<Category> categories=new ArrayList<>();
	
	static {
		Category cat=new Category();
		cat.setId(1);
		cat.setName("Mobile");
		cat.setDescription("This is the mobile description");
		cat.setImageUrl("cat1.jpg");
		cat.setActive(true);
		categories.add(cat);
		
		cat=new Category();
		cat.setId(2);
		cat.setName("Television");
		cat.setDescription("This is the television description");
		cat.setImageUrl("cat2.jpg");
		cat.setActive(true);
		categories.add(cat);
		
		cat=new Category();
		cat.setId(3);
		cat.setName("Laptop");
		cat.setDescription("This is the laptop description");
		cat.setImageUrl("cat3.jpg");
		cat.setActive(true);
		categories.add(cat);
		
		cat=new Category();
		cat.setId(4);
		cat.setName("Mobile Accesories");
		cat.setDescription("This is mobile accesories department");
		cat.setImageUrl("cat4.jpg");
		cat.setActive(false);
		categories.add(cat);
		
		
		
		
		
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//Enhanced java loop
		for(Category category : categories) {
			if(category.getId()==id) {
				return category;
			}
		}
		return null;
	}

}
