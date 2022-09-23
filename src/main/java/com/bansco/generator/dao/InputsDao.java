package com.bansco.generator.dao;

import org.springframework.stereotype.Repository;

import com.bansco.generator.models.Input;
import com.bansco.generator.models.Inputs;
import com.bansco.generator.models.Output;

@Repository
public class InputsDao {

	public Output expression(Inputs inputs) {
		String returnedExpr = new String("");
		for (int counter = 1; counter <= inputs.getInputs().size(); counter++) {
			if (counter == 1) {
				returnedExpr += inputs.getInputs().get("input" + counter).eachWordFirstChars(1) + '.';
			}
			if (counter == 2) {
				returnedExpr += (inputs.getInputs().get("input" + counter).wordsCount() > 1
						? new Input(inputs.getInputs().get("input" + counter).lastWords(-1)).eachWordFirstChars(1)
								+ inputs.getInputs().get("input" + counter).lastWords(1)
						: inputs.getInputs().get("input" + counter)) + "@";
			}
			if (counter >= 3) {
				returnedExpr += inputs.getInputs().get("input" + counter) + ".";
			}
		}
		returnedExpr = returnedExpr.substring(0, returnedExpr.length() - 1);
		return new Output(returnedExpr, returnedExpr);
	}

	public Output doExpression(Input... inputs) {
		String returnedExpr = new String("");
		for (int counter = 1; counter <= inputs.length; counter++) {
			if (counter == 1) {
				returnedExpr += inputs[counter - 1].eachWordFirstChars(1) + '.';
			}
			if (counter == 2) {
				returnedExpr += (inputs[counter - 1].wordsCount() > 1
						? new Input(inputs[counter - 1].lastWords(-1)).eachWordFirstChars(1)
								+ inputs[counter - 1].lastWords(1)
						: inputs[counter - 1]) + "@";
			}
			if (counter >= 3) {
				returnedExpr += inputs[counter - 1] + ".";
			}
		}
		returnedExpr = returnedExpr.substring(0, returnedExpr.length() - 1);
		return new Output(returnedExpr, returnedExpr);
	}

}
