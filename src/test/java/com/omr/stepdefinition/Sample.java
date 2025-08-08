package com.omr.stepdefinition;

import java.io.IOException;

import com.omr.baseclass.Baseclass;

public class Sample extends Baseclass {
	public void sample() throws IOException {
		String propertValue = getPropertValue("url");
		System.out.println(propertValue);
	}

	public static void main(String[] args) throws IOException {
		Sample sample = new Sample();
		sample.sample();
	}
}
