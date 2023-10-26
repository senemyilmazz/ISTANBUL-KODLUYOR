package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product){
		//sadece data base erişim kodları buraya yazlmaktadır, SQL bilmek gerekir.
		System.out.println("Hibernate ile veri tabanına eklendi");
	}
}