package org.example.swing;

import org.example.calculators.AdditionExercise;

public class FormApp {
	public static void main(String[] args) {
		AdditionExercise calculator = new AdditionExercise();
		FormView view = new FormView(calculator.getFirstNumber(), calculator.getSecondNumber(), calculator.getResult());
		view.paint();
	}
}
