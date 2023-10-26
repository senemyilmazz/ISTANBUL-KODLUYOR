package oopWithNLayeredApp;

import oopWithNLayeredApp.bussiness.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {
	//arayüz
	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "IPhone Xr", 10000);
		//ProductManager productManager = new ProductManager();
		//1.product1 isimli değişken için product class ında yer açıldı ve içerik dolduruldu.
		//2.productManager classını oluşturdu.
		//3.productManager daki add fonksiyonuna iletildi, orada hatalı bir durum olup oolmadığı kontrol edildi.
		//4.Oradan LdbcProductDao classına yönlendi ve çıktı yazıldı.
		//ilk implemente etmeden önceki hali ^^

		//ProductManager productManager = new ProductManager(new JdbcProductDao());
		//ProductManager productManager = new ProductManager(new HibernateProductDao());
		//implemente ettikten sonraki yöntem ^^

		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		//Logger implementesini ekledikten sonraki yöntem ^^
		productManager.add(product1);
	}
}
