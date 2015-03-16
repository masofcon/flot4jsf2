# API #

Component namespace: http://java.sun.com/jsf/composite/flot4jsf2

## Chart component's attributes ##
| **Attribute** | **Description** | **Mondatory** |
|:--------------|:----------------|:--------------|
| width | chart width  | true |
| height | chart height | true |
| yticks | Y axis value labels | false |
| ymin | min Y axis value | false |
| ymax | max Y axis value  | false |

## Data set attributes ##
| data | data (format of data see below) | true|
|:-----|:--------------------------------|:----|
| type | type of chart (see below) | true |
| label | legend text  | false |
| color | color of chart | false |
| fill | fill area (for more detail see flot API) | false |
| steps | step line (only for line type)  | false |


## Supported chart types ##

  * lines
  * dots
  * bars
  * mixing of types above


## Data format ##

Data is represented as 2-dimentional matrix.

You can write it directly
```
<f4j2:chart width="320" height="240">
      <f4j2:dataSet data="[[-2,-5],[0,3],[6,-4],[7,5]]" type="lines" />
</f4j2:chart>
```

or get it from bean

```
<f4j2:chart width="320" height="240">
      <f4j2:dataSet data="#{sampleData.data}" type="lines" />
</f4j2:chart>
```

```
public class SampleData implements Serializable {
	private Double[][] data;

	private void generateData() {
		int n = 10;
		data = new Double[2][n];
		for (int i = 0; i < n; i++) {
			data[0][i] = Math.random() * 10;
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

}

```

for more details see [examples](http://code.google.com/p/flot4jsf2/wiki/Examples)