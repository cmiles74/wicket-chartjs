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

Fill in some data.

```java
 List<DoughnutChartData> data = new ArrayList<DoughnutChartData>() {{
    add(new DoughnutChartData(30, "Things", Color.BLUE));
    add(new DoughnutChartData(50, "Gazooks", Color.DARK_GRAY));
    add(new DoughnutChartData(100, "Zuckers", Color.MAGENTA));
    add(new DoughnutChartData(40, "Gladiolas", Color.ORANGE));
    add(new DoughnutChartData(50, "Cookies", Color.GREEN));
}};
```

Add a new ChartPanel to your Wicket Page.

```java
add(new DoughnutChartPanel("chartPanel",
    Model.of(new Doughnut(data, 
        new DoughnutChartOptions()
            .setInGraphDataShow(true)
            .setCrossText(325)
            .setCrossTextOverlay(true)
            .setCrossTextFontColor(Color.RED)
            .setCrossTextFontSize(48)
            .setCrossTextFontColor(Color.RED)));
```

Add the chart inside your html markup.

```html
<div wicket:id="chartPanel">[CHART]</div>
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