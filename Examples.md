## Single data serie ##
### Bar chart ###

![http://flot4jsf2.googlecode.com/svn/wiki/images/barsFilled.png](http://flot4jsf2.googlecode.com/svn/wiki/images/barsFilled.png)

Code example:
```
<f4j2:chart width="320" height="240">
   <f4j2:dataSet data="#{dataRandomizer.data}" label="type='bars'" color="red" type="bars" fill="true" />
</f4j2:chart>
```


---

### Line chart ###

![http://flot4jsf2.googlecode.com/svn/wiki/images/lines.png](http://flot4jsf2.googlecode.com/svn/wiki/images/lines.png)

Code example:
```
<f4j2:chart width="320" height="240">
  <f4j2:dataSet data="#{sampleData.getSinus(-4,4)}" label="sin" type="lines" color="yellow"/>
</f4j2:chart>
```


---

### Dots chart ###

![http://flot4jsf2.googlecode.com/svn/wiki/images/dots.png](http://flot4jsf2.googlecode.com/svn/wiki/images/dots.png)

Code example:
```
<f4j2:chart width="320" height="240">
  <f4j2:dataSet data="#{sampleData.data}" label="Random data" type="dots"/>
</f4j2:chart>
```


---

### Line chart (steps style) ###

![http://flot4jsf2.googlecode.com/svn/wiki/images/stepline.png](http://flot4jsf2.googlecode.com/svn/wiki/images/stepline.png)

Code example:
```
<f4j2:chart width="320" height="240">
  <f4j2:dataSet data="#{sampleData.getX3(-3,3)}" type="lines" steps="true" label="step line"/>
</f4j2:chart>
```


---

### Line chart (fill style, direct data input) ###

![http://flot4jsf2.googlecode.com/svn/wiki/images/fillline.png](http://flot4jsf2.googlecode.com/svn/wiki/images/fillline.png)

Code example:
```
<f4j2:chart width="320" height="240">
  <f4j2:dataSet data="[[-2,-5],[0,3],[6,-4],[7,5]]" label="data='[[-2,-5],[0,3],[6,-4],[7,5]]'"  type="lines" color="green" fill="true"/>
</f4j2:chart>
```


---

### Line&dots chart ###

![http://flot4jsf2.googlecode.com/svn/wiki/images/dotsline.png](http://flot4jsf2.googlecode.com/svn/wiki/images/dotsline.png)

Code example:
```
<f4j2:chart width="320" height="240">
  <f4j2:dataSet data="#{sampleData.getX3(-3,3)}" label="x^3" type="dots, lines" color="blue"/>
</f4j2:chart>
```


---

## Multiple data series ##

### Example 1. Sin & Cos ###

![http://flot4jsf2.googlecode.com/svn/wiki/images/sincos.png](http://flot4jsf2.googlecode.com/svn/wiki/images/sincos.png)

```
<f4j2:chart width="320" height="240">
	<f4j2:dataSet data="#{dataRandomizer.getSin()}" color="green" label="sin" type="lines" />
	<f4j2:dataSet data="#{dataRandomizer.getCos()}" color="red" label="cos"	type="line" />
</f4j2:chart>
```


---


### Example 2. Lines ###

![http://flot4jsf2.googlecode.com/svn/wiki/images/difser.png](http://flot4jsf2.googlecode.com/svn/wiki/images/difser.png)

```
<f4j2:chart width="320" height="240">
	<f4j2:dataSet data="#{dataRandomizer.data}" color="green"
				label="type='lines, dots' fill='true'' steps='true'"
				type="lines, dots" fill="true" steps="true" />
	<f4j2:dataSet data="#{dataRandomizer.data}" color="blue" type="lines"
				label="type='lines'" />
</f4j2:chart>
```