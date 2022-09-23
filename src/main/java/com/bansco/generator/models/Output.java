package com.bansco.generator.models;

/**
 * @author Chrif MELLOULI
 *
 */
/**
 * @author asus
 *
 */
public class Output {

	private String id;
	private String value;

	public Output() {
		super();
	}

	public Output(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "{\r\n"
				+ "\"data\": [\r\n"
				+ "{\r\n"
				+ "\"id\": \""+id+"\",\r\n"
				+ "\"value\": \""+value+"\"\r\n"
				+ "}\r\n"
				+ "]\r\n"
				+ "}";
	}
	
}
