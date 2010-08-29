package ru.flot4jsf2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DataRandomizer {
	private Double[][] data;

	private void generateData() {
		int n = 10;
		data = new Double[2][n];
		for (int i = 0; i < n; i++) {
			data[0][i] = i * 1.;
			data[1][i] = Math.random() * 10;
		}
	}

	public Double[][] getData() {
		generateData();
		return data;
	}

	public void setData(Double[][] data) {
		this.data = data;
	}

	public Double[][] getSin() {
		int n = 40;
		Double[][] result = new Double[2][n];
		double j = 0;
		for (int i = 0; i < n; i++, j+=.25) {
			result[0][i] = j;
			result[1][i] = Math.sin(j);
		}
		return result;
	}
	
	public Double[][] getCos() {
		int n = 40;
		Double[][] result = new Double[2][n];
		double j = 0;
		for (int i = 0; i < n; i++, j+=.25) {
			result[0][i] = j;
			result[1][i] = Math.cos(j);
		}
		return result;
	}
}
