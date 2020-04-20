package com.port.domain;

public class BoardVO {
	private String test;
	private String test2;
	
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getTest2() {
		return test2;
	}
	public void setTest2(String test2) {
		this.test2 = test2;
	}
	
	@Override
	public String toString() {
		return "BoardVO [test=" + test + ", test2=" + test2 + "]";
	}
	
}
