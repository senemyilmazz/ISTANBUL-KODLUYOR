package oopWithNLayeredApp.bussiness;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;


public class ProductManager {

	//Aynı isimde (tc'de mesela) birden fazla kayıt -duplicate olmasını engellemek için
	//iş kuralını (domain) bussiness'ta oluşturuyoruz.
	private ProductDao productDao;
	//productManager new lendiğinde ban abir productDao ver demek istiyor.
	private Logger[] loggers; //asıl polimorfizm bu!!

	//List<Logger> = List[] //aynı şey!!
	public ProductManager(ProductDao productDao, Logger[] logger) {
		this.productDao = productDao;
		this.loggers = logger;
	}

	public void add(Product product) throws Exception {
			//buraya iş kuralları (bussiness rules) girilir.
			//methoddan sonra throws yazmasının nedeni throw gelebilir hazırlıklı ol anlamını taşır.
			if (product.getUnitPrice() < 10) {
				throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
			}
			//JdbcProductDao productDao = new JdbcProductDao();
			//HibernateProductDao productDao = new HibernateProductDao();
			//JDBC ve hibernate'in hibrit kullannıldığı durumlarıda bu bir seçenek olamaz. Bu durumda interface kullanılmalı!!!!

			//ProductDao productDao = new HibernateProductDao();
			//Bir katman başka bir katmanın classını kullanıyorken sadece interface inden erişim kurmalıdır!!
			//private ProductDao oluşturduğumuzda bunu sağlamış oluruz.(13. satır)

			productDao.add(product);

			for (Logger logger : loggers) { //önce db sonra file sonra mail in logu çalıştırılıyor mainde.
				logger.log(product.getName());
			}
		}
	}

