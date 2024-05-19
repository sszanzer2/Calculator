package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import javafx.event.ActionEvent;

public class CalcTest {
	   
	    private SampleController controller;

	    @BeforeEach
	    public void setUp() throws Exception {
	        controller = new SampleController();
	        controller.initialize();
	    }

	    @Test
	    public void testAddition() {
	        controller.getResults().setText("5");
	        controller.OperationButtons(new ActionEvent(controller.getPlusButton(), null));
	        controller.getResults().setText("3");
	        controller.OperationButtons(new ActionEvent(controller.getEqualsButton(), null));
	        assertEquals("8", controller.getResults().getText());
	    }

	    @Test
	    public void testSubtraction() {
	        controller.getResults().setText("10");
	        controller.OperationButtons(new ActionEvent(controller.getMinusButton(), null));
	        controller.getResults().setText("5");
	        controller.OperationButtons(new ActionEvent(controller.getEqualsButton(), null));
	        assertEquals("5", controller.getResults().getText());
	    }

	    @Test
	    public void testMultiplication() {
	        controller.getResults().setText("4");
	        controller.OperationButtons(new ActionEvent(controller.getMultipliedByButton(), null));
	        controller.getResults().setText("6");
	        controller.OperationButtons(new ActionEvent(controller.getEqualsButton(), null));
	        assertEquals("24", controller.getResults().getText());
	    }

	    @Test
	    public void testDivision() {
	        controller.getResults().setText("20");
	        controller.OperationButtons(new ActionEvent(controller.getDividedByButton(), null));
	        controller.getResults().setText("4");
	        controller.OperationButtons(new ActionEvent(controller.getEqualsButton(), null));
	        assertEquals("5", controller.getResults().getText());
	    }

	    @Test
	    public void testDivisionByZero() {
	        controller.getResults().setText("10");
	        controller.OperationButtons(new ActionEvent(controller.getDividedByButton(), null));
	        controller.getResults().setText("0");
	        controller.OperationButtons(new ActionEvent(controller.getEqualsButton(), null));
	        assertEquals("0", controller.getResults().getText());
	    }

	    @Test
	    public void testClearButton() {
	        controller.getResults().setText("123");
	        controller.ClearButton(new ActionEvent(controller.getClearButton(), null));
	        assertEquals("", controller.getResults().getText());
	    }
	}

	    



