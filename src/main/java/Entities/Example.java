package Entities;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import Annotations.CustomError;

public class Example {

	@NotBlank
	@Size(min = 3, max = 5)
	private String key1;
	
	@Pattern(regexp=".+@.+\\.[a-z]+") // email
	private String key2;
	
	private String key3;

	

	public Example(String key1, String key2, String key3) {
		super();
		this.key1 = key1;
		this.key2 = key2;
		this.key3 = key3;
	}

	@Override
	public String toString() {
		return "RequestObj [key1=" + key1 + ", key2=" + key2 + ", key3=" + key3 + "]";
	}

	public String getKey1() {
		return key1;
	}

	public void setKey1(String key1) throws Exception {
		this.key1 = key1;
	}

	public String getKey2() {
		return key2;
	}

	public void setKey2(String key2) {
		this.key2 = key2;
	}

	public String getKey3() {
		return key3;
	}

	public void setKey3(String key3) {
		this.key3 = key3;
	}
	
}
