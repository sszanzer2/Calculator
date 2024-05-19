module Calculator {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires java.scripting;
	requires org.junit.jupiter.api;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
