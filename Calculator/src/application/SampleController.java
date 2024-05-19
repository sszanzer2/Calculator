package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class SampleController {
	@FXML
    private Pane base;

    @FXML
    private Button clear;

    @FXML
    private Button dividedBy;

    @FXML
    private Button equals;

    @FXML
    private Button minus;

    @FXML
    private Button multipliedBy;

    @FXML
    private Button numEight;

    @FXML
    private Button numFive;

    @FXML
    private Button numFour;

    @FXML
    private Button numNine;

    @FXML
    private Button numOne;

    @FXML
    private Button numSeven;

    @FXML
    private Button numSix;

    @FXML
    private Button numThree;

    @FXML
    private Button numTwo;

    @FXML
    private Button numZero;

    @FXML
    private Button plus;

    @FXML
    private TextField results;
    
    String op = "";
    long number1;
    long number2;
    
    // Getter methods for buttons
    public Button getClearButton() {
        return clear;
    }

    public Button getDividedByButton() {
        return dividedBy;
    }

    public Button getEqualsButton() {
        return equals;
    }

    public Button getMinusButton() {
        return minus;
    }

    public Button getMultipliedByButton() {
        return multipliedBy;
    }

    public Button getNumEightButton() {
        return numEight;
    }

    public Button getNumFiveButton() {
        return numFive;
    }

    public Button getNumFourButton() {
        return numFour;
    }

    public Button getNumNineButton() {
        return numNine;
    }

    public Button getNumOneButton() {
        return numOne;
    }

    public Button getNumSevenButton() {
        return numSeven;
    }

    public Button getNumSixButton() {
        return numSix;
    }

    public Button getNumThreeButton() {
        return numThree;
    }

    public Button getNumTwoButton() {
        return numTwo;
    }

    public Button getNumZeroButton() {
        return numZero;
    }

    public Button getPlusButton() {
        return plus;
    }
    
    public TextField getResults() {
    	return results;
    }

    //Method that is connected to the number buttons that when you click on them they will appear in the top text box
	@FXML
	void ActionButton(ActionEvent event) {
		String num = ((Button) event.getSource()).getText();
		results.appendText(num);

	}

	@FXML
	//Method that takes care of when you click on an operation sign it makes it appear in the top text box and handles the calling calculation
	void OperationButtons(ActionEvent event) {
		String operation = ((Button) event.getSource()).getText();
		if (!op.equals("") && !operation.equals("=")) {
			// If an operation is already selected and the pressed button is not "=",
			// calculate it
			calculate();
		}
		if (!operation.equals("=")) {
			// If the pressed button is not "=", store the selected operation and append it
			// to the output
			op = operation;
			results.appendText(" " + operation + " ");
		} else {
			// If the pressed button is "=", calculate the result
			calculate();
		}
	}

	//calculates the results
	private void calculate() {
		String expression = results.getText();
		String[] parts = expression.split("\\s+");
		long n1 = Long.parseLong(parts[0]);
		String op = parts[1];
		long n2 = Long.parseLong(parts[2]);

		long result = 0;
		switch (op) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			if (n2 == 0) {
				results.setText("0");
				return;
			}
			result = n1 / n2;
			break;
		}

		results.setText(result + "");
	}

	@FXML
	//clears the text box
	void ClearButton(ActionEvent clear) {
		results.clear();
		op = ""; // Clear the stored operation
	}

	@FXML
	void initialize() {
		assert results != null : "fx:id=\"results\" was not injected: check your FXML file 'Calculator.fxml'.";
		assert numOne != null : "fx:id=\"numOne\" was not injected: check your FXML file 'Calculator.fxml'.";
		assert numZero != null : "fx:id=\"numZero\" was not injected: check your FXML file 'Calculator.fxml'.";
		results.setText("");

	}
	
}
