package com.bansco.generator.models;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chrif MELLOULI
 *
 */
public class Inputs {

	/**
	 * A map that contains the parameters that must be passed in the query.
	 */
	private Map<String, Input> inputs = new HashMap<String, Input>();

	/**
	 * An empty constructor.
	 */
	public Inputs() {
		super();
	}

	/**
	 * A parameterized constructor
	 * 
	 * @param inputs : {@link Map} that contains the parameters that must be passed
	 *               in the query.
	 */
	public Inputs(Map<String, Input> inputs) {
		super();
		this.inputs = inputs;
	}

	/**
	 * A parameterized constructor
	 * 
	 * @param inputs : an undefined number of inputs
	 */
	public Inputs(Input... inputs) {
		super();
		for (Input input : inputs) {
			this.addInput(input);
		}
	}

	/**
	 * A getter for the attribute inputs
	 * 
	 * @return {@link Map} inputs
	 */
	public Map<String, Input> getInputs() {
		return inputs;
	}

	/**
	 * A setter for the attribute inputs
	 * 
	 * @param {@link Map} inputs
	 */
	public void setInputs(Map<String, Input> inputs) {
		this.inputs = inputs;
	}

	/**
	 * Generate an auto-incrementing key (input+counter) when adding a value
	 * 
	 * @param {@link String} input
	 */
	public void addInput(Input input) {
		if (this.inputs.isEmpty()) {
			this.inputs.put("input1", input);
		} else {
			this.inputs.put("input" + (this.inputs.size() + 1), input);
		}
	}

	@Override
	public String toString() {
		return "Input [inputs=" + inputs.toString() + "]";
	}

}
