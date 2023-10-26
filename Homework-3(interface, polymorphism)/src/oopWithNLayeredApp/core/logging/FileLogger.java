package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {

	@Override //zorunlu değil interface veya abstracttan geldiğini belirtir.
	public void log(String data) {
		System.out.println("Dosyaya loglandı :" + data);
	}
}
