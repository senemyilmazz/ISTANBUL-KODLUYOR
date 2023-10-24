public class Main {
	public static void main(String[] args) {

		Shoes brand1 = new Shoes();
		brand1.setName("Nike");		// comes from product class
		brand1.setPrice(2000.0);	//	"	  "		"		"
		brand1.setType("sport");	//comes from shoes class
		brand1.setModel("Air Force"); // "	  "		"	"

		//brand1.name = "Nike";		//yorum satırları setType() ve getType() kullanılmadığı halleri!
		//brand1.type = "sport";
		//brand1.model = "Air Force";
		//brand1.price = 2000.0;

		Shoes brand2 = new Shoes();
		brand2.setName("New Balance");
		brand2.setPrice(5500.0);
		brand2.setType("sport");
		brand2.setModel("530");
		//brand2.name = "New Balance";
		//brand2.type = "sport";
		//brand2.model = "530";
		//brand2.price = 5500.0;

		Shoes brand3 = new Shoes();
		brand3.setName("Skechers");
		brand3.setType("sport");
		brand3.setModel("D'LITES");
		brand3.setPrice(4000.0);
		//brand3.name = "Skechers";
		//brand3.type = "sport";
		//brand3.model = "D'LITES";
		//brand3.price = 4000.0;

		Bag bag1 = new Bag();
		bag1.setName("NIKE");
		bag1.setPrice(400.0);

		Shoes[] brands = {brand1, brand2, brand3};

		System.out.println("<ul>");

		//for (Shoes products : brands)
		//	System.out.println("<li>" + products.name + "</li>");

		for (Shoes products : brands)
			System.out.println("<li>" + products.getName() + "</li>");
		System.out.println("</ul>");
	}
}
