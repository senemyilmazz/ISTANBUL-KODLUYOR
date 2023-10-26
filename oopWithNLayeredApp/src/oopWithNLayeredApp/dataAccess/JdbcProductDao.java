package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	//Jdbc bir veri tabanına erişim yöntemidir! //buna benzer bir de Hibernate var.
	//Dao: data access object anlamına gelir, yaygın olarak kullanılan bir kısaltmadır.
	//implements ProductDao ile interface implemente edilir (Jdbc ve hibernate alternatifleri olduğu için).
	public void add(Product product) {
		//sadece data base erişim kodları buraya yazlmaktadır, SQL bilmek gerekir.
		System.out.println("JDBC ile veri tabanına eklendi");

	}
}
