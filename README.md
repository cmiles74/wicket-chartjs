Wicket-ChartJS
==============
This project combines Wicket with [Chart.js][0], it provides all chart.js charts and it is completely open source and 
free to use (also in commercial projects). You can use it to create beautiful charts and graphs in your wicket project.
No flash, just html, css and javascript. More information is available on the [project's homepage][1], [examples are also
available][2].

Wicket-ChartJS using the FVANCOP Fork
-------------------------------------

This fork of Wicket-Chart uses [the FVANCOP fork of ChartJS][3] instead of the main project in order to provide extra (and,
to my mind, critical) features like labels for charts. This fork is under active development, labels are supported
and more features will be implements in the future.

How to Use It
-------------

Add a new ChartPanel to your Wicket Page.

```java
/*
 * Line Chart
 */
LineChartPanel lineChart = new LineChartPanel("lineChartPanel", Model.of(new Line()));
add(lineChart);
```

Fill in some data.

```java
List<String> labels = new ArrayList<String>();
labels.add("jan");
labels.add("feb");
labels.add("mar");
labels.add("apr");

List<Integer> values1 = new ArrayList<Integer>();
values1.add(4);
values1.add(2);
values1.add(6);
values1.add(7);

LineChartData<LineDataSet> lineData = new LineChartData<LineDataSet>();
lineData.getDatasets().add(new LineDataSet(values1));

lineChart.getChart().setData(lineData);
lineData.setLabels(labels);
```

Add the chart inside your html markup.

```html
<div wicket:id="lineChartPanel">[CHART]</div>
```

That was it :) That's your first Chart in Java with wicket-chartjs.

Compatibility
-------------
* IE 9 and upwards</li>
* IE 7 and 8 in parts</li>
* the rest isn't a problem ;)


[0]: http://www.chartjs.org
[1]: http://pingunaut.com/wicket-chartjs
[2]: http://pingunaut.com/wicket-chartjs/examples
[3]: https://github.com/FVANCOP/ChartNew.js