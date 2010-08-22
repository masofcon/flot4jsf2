package ru.flot4jsf2;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class SampleData implements Serializable {

	private static final long serialVersionUID = 1L;

	private Double[][] result;

	public SampleData() {
		super();
	}

	private void generateData() {
		int n = 10;
		result = new Double[2][n];
		for (int i = 0; i < n; i++) {
			result[0][i] = Math.random() * 10;
			result[1][i] = Math.random() * 10;
		}
	}

	public Double[][] getData() {
		generateData();
		return result;
	}

	public void setData(Double[][] data) {
		this.result = data;
	}

	public Double[][] getSinus(int from, int to) {
		int n = (to - from + 1) * 10;
		result = new Double[2][n];
		int j = 0;
		for (double i = from; i <= to; i += 0.1) {
			result[0][j] = i;
			result[1][j] = Math.sin(result[0][j]);
			j++;
		}
		return result;
	}

	public Double[][] getX3(int from, int to) {
		int n = (to - from + 1) * 2;
		result = new Double[2][n];
		int j = 0;
		for (double i = from; i <= to; i += 0.5) {
			result[0][j] = i;
			result[1][j] = Math.pow(result[0][j], 3.0);
			j++;
		}
		return result;
	}

	public Double[][] getBarsData() {
		int n = 6;
		result = new Double[2][n];
		int j = 0;
		for (double i = 0; i < n; i += 1) {
			result[0][j] = i;
			result[1][j] = Math.random() * 10 - 5;
			j++;
		}
		return result;
	}

}
