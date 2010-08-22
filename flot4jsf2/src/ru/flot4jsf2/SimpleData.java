package ru.flot4jsf2;

import javax.faces.bean.ViewScoped;

@ViewScoped
public class SimpleData {

	private double[] data;

	public SimpleData() {
		super();
		int n = 10;
		data = new double[n];
		for (int i = 0; i < n; i++)
			data[i] = Math.random() * 10;
	}

	public double[] getData() {
		return data;
	}

	public void setData(double[] data) {
		this.data = data;
	}

}
