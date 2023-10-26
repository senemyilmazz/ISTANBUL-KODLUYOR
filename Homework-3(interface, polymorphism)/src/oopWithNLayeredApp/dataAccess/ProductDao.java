package oopWithNLayeredApp.dataAccess;


import oopWithNLayeredApp.entities.Product;

public interface ProductDao {
	void add(Product product);
	//Jdbc ve hibernate in içindeki metotların buna uygun olması lazım.
}
