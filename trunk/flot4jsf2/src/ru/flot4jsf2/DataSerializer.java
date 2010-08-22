package ru.flot4jsf2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DataSerializer {
	public String serialize(Object object) {
		String result = "";
		if (object.getClass().isArray()) {
			Object[][] data = (Object[][]) object;
			for (int i = 0; i < data[0].length; i++) {
				if (!"".equals(result))
					result = result.concat(",");
				result = result.concat("[" + data[0][i] + "," + data[1][i]
						+ "]");
			}
			result = "[" + result.concat("]");
			return result;
		} else if (object instanceof String) {
			return object.toString();
		}
		return result;
	}
}
