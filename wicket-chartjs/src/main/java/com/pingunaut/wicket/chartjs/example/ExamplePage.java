/*******************************************************************************
 * Copyright 2013 Martin Spielmann
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.pingunaut.wicket.chartjs.example;

import com.pingunaut.wicket.chartjs.chart.impl.Bar;
import com.pingunaut.wicket.chartjs.chart.impl.Doughnut;
import com.pingunaut.wicket.chartjs.chart.impl.Line;
import com.pingunaut.wicket.chartjs.chart.impl.Pie;
import com.pingunaut.wicket.chartjs.core.panel.BarChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.DoughnutChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.LineChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.PieChartPanel;
import com.pingunaut.wicket.chartjs.data.BarChartData;
import com.pingunaut.wicket.chartjs.data.DoughnutChartData;
import com.pingunaut.wicket.chartjs.data.LineChartData;
import com.pingunaut.wicket.chartjs.data.PieChartData;
import com.pingunaut.wicket.chartjs.data.sets.BarDataSet;
import com.pingunaut.wicket.chartjs.data.sets.LineDataSet;
import com.pingunaut.wicket.chartjs.options.BarChartOptions;
import com.pingunaut.wicket.chartjs.options.DoughnutChartOptions;
import com.pingunaut.wicket.chartjs.options.LineChartOptions;
import com.pingunaut.wicket.chartjs.options.PieChartOptions;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The Class ExamplePage provides a tiny little running example of
 * wicket-chartjs. to use it, just type mvn jetty:run
 * 
 * @author Martin Spielmann
 */
public class ExamplePage extends WebPage {

	private static final long serialVersionUID = -8484356423313672843L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.wicket.Component#onInitialize()
	 */
	@Override
	protected void onInitialize() {
		super.onInitialize();

        // line chart
        add(new LineChartPanel("lineChart",
                Model.of(new Line(new LineChartData(Arrays.asList(new String[]{"Jan", "Feb", "Mar", "Apr"}),
                        new ArrayList<LineDataSet>() {{
                            add(new LineDataSet(Arrays.asList(new Double[]{4.25, 3.25, 5.5, 6.25})));
                        }}
                ), new LineChartOptions()
                        .setAnnotateDisplay(true)
                        .setInGraphDataShow(true)))
        ));

        // bar chart
        add(new BarChartPanel("barChart",
                Model.of(new Bar(new BarChartData(Arrays.asList(new String[]{"Jan", "Feb", "Mar", "Apr"}),
                        new ArrayList<BarDataSet>() {{
                            add(new BarDataSet(Color.BLUE, Color.GRAY, Arrays.asList(new Double[]{4.25, 3.25, 5.5, 6.25})));
                            add(new BarDataSet(Color.GREEN, Color.GRAY, Arrays.asList(new Double[]{3.25, 2.25, 4.5, 5.25})));
                        }}
                ), new BarChartOptions()
                        .setAnnotateDisplay(true)
                        .setInGraphDataShow(true)))
        ));

        // pie chart
        add(new PieChartPanel("pieChart",
                Model.of(new Pie(new ArrayList<PieChartData>() {{
                    for (Integer i : new Integer[]{4, 2, 5, 6}) {
                        add(new PieChartData(i, "Item " + i, "#" + i + i + i));
                    }
                }}, new PieChartOptions()
                        .setInGraphDataShow(true)
                        .setLegend(true)))
        ));

        // doughnut chart
        add(new DoughnutChartPanel("doughnutChart",
                Model.of(new Doughnut(
                        new ArrayList<DoughnutChartData>() {{
                            add(new DoughnutChartData(30.24, "Things", Color.BLUE));
                            add(new DoughnutChartData(50.12, "Gazooks", Color.DARK_GRAY));
                            add(new DoughnutChartData(100.12, "Zuckers", Color.MAGENTA));
                            add(new DoughnutChartData(40.928, "Gladiolas", Color.ORANGE));
                            add(new DoughnutChartData(50.123, "Cookies", Color.GREEN));
                        }},
                        new DoughnutChartOptions()
                                .setInGraphDataShow(true)
                                .setCrossText(325)
                                .setCrossTextOverlay(true)
                                .setCrossTextFontColor(Color.RED)
                                .setCrossTextFontSize(48)
                                .setCrossTextFontColor(Color.RED)
                                .setLegend(true)
                )), 640, 400
        ));
    }
}
