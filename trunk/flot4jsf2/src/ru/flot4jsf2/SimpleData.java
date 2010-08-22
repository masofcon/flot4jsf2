package ru.flot4jsf2;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class SimpleData implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double[][] data;

	public SimpleData() {
		super();
		int n = 10;
		data = new Double[2][n];
		for (int i = 0; i < n; i++) {
			data[0][i] = Math.random() * 10;
			data[1][i] = Math.random() * 10;
		}
	}

	public Double[][] getData() {
		return data;
	}

	public void setData(Double[][] data) {
		this.data = data;
	}

}
