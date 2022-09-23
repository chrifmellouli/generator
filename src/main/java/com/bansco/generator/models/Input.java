package com.bansco.generator.models;

/**
 * @author Chrif MELLOULI
 *
 */
public class Input {

	/**
	 * The value of the parameter that should be passed in the query.
	 */
	private String input;

	/**
	 * An empty constructor
	 */
	public Input() {
		super();
	}

	/**
	 * A parameterized constructor
	 * 
	 * @param input : {@link String} that contains the value of the parameter that
	 *              must be passed in the query
	 */
	public Input(String input) {
		super();
		this.input = input;
	}

	/**
	 * A getter for the attribute input
	 * 
	 * @return {@link String} the value of the passed parameter
	 */
	public String getInput() {
		return input;
	}

	/**
	 * A setter for the attribute input
	 * 
	 * @param input : {@link String} the value of the passed parameter
	 */
	public void setInput(String input) {
		this.input = input;
	}

	public String eachWordFirstChars(int charNumber) {
		if (charNumber == 0) {
			throw new IndexOutOfBoundsException("The number of selected characters should be greater than 0");
		}
		String returnedStr = new String("");
		String[] strArray = this.input.replace('-', ' ').toLowerCase().split(" ");
		for (String s : strArray) {
			if (charNumber > s.length()) {
				throw new IndexOutOfBoundsException(
						"The number of selected characters exceeds the size of one of the words in the string");
			}
			returnedStr = returnedStr + s.substring(0, charNumber);
		}
		return returnedStr;
	}

	/**
	 * Count the number of word in the String. Words in a String can be separated
	 * with spaces or '-'
	 * 
	 * @return int the number of world in the input
	 */
	public int wordsCount() {
		return this.input.replace('-', ' ').split(" ").length;
	}

	public String lastWords(int wordIndex) {
		String[] strArray = this.input.replace('-', ' ').toLowerCase().split(" ");
		String returnedStr = new String("");
		if (Math.abs(wordIndex) >= strArray.length) {
			throw new IndexOutOfBoundsException("The index of selected word exceeds the size the word's list");
		} else if (wordIndex >= 0) {
			for (int counter = wordIndex; counter < strArray.length; counter++) {
				returnedStr += strArray[counter] + " ";
			}
		} else {
			for (int counter = strArray.length - Math.abs(wordIndex) - 1; counter >= 0; counter--) {
				returnedStr = strArray[counter] + " " + returnedStr;
			}
		}
		returnedStr = returnedStr.substring(0, returnedStr.length() - 1);
		return returnedStr;
	}

	@Override
	public String toString() {
		return input;
	}

}
