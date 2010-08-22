/* 
   Copyright 2010 George Suaridze.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package ru.flot4jsf2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Bean for data serialization
 * 
 * @author George Suaridze
 * 
 */
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
