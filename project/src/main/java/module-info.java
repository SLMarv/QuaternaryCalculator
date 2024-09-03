module cs295.quaternarycalculator.view.calculatorapplication {
	requires javafx.controls;
	requires javafx.fxml;


	opens cs295.quaternarycalculator.view to javafx.fxml;
	exports cs295.quaternarycalculator.view;
}