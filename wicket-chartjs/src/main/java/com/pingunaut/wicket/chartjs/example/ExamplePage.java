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

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.pingunaut.wicket.chartjs.chart.impl.Doughnut;
import com.pingunaut.wicket.chartjs.core.panel.DoughnutChartPanel;
import com.pingunaut.wicket.chartjs.data.DoughnutChartData;
import com.pingunaut.wicket.chartjs.options.DoughnutChartOptions;
import com.pingunaut.wicket.chartjs.options.LineChartOptions;
import com.pingunaut.wicket.chartjs.options.PieChartOptions;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

import com.pingunaut.wicket.chartjs.chart.impl.Line;
import com.pingunaut.wicket.chartjs.chart.impl.Pie;
import com.pingunaut.wicket.chartjs.core.panel.LineChartPanel;
import com.pingunaut.wicket.chartjs.core.panel.PieChartPanel;
import com.pingunaut.wicket.chartjs.data.PieChartData;
import com.pingunaut.wicket.chartjs.data.sets.LineDataSet;

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

        // line chart
        LineChartPanel lineChartPanel = new LineChartPanel("lineChart",
                Model.of(new Line(new LineChartOptions()
                        .setAnnotateDisplay(true)
                        .setScaleShowLabels(true)
                        .setScaleLabel("<%=value%>")
                        .setLegend(true))));
        lineChartPanel.getChart().getData().getDatasets().add(new LineDataSet(values1));
        lineChartPanel.getChart().getData().getLabels().addAll(labels);
        add(lineChartPanel);

        // pie chart
        PieChartPanel pieChartPanel = new PieChartPanel("pieChart",
                Model.of(new Pie(new PieChartOptions())));
        for (Integer i : values1) {
            pieChartPanel.getChart().getData().add(new PieChartData(i, "#" + i + i + i, "Item " + i));
        }
        add(pieChartPanel);

        // doughnut chart
        DoughnutChartPanel doughnutChartPanel = new DoughnutChartPanel("doughnutChart",
                Model.of(new Doughnut(
                        new ArrayList<DoughnutChartData>() {{
                            add(new DoughnutChartData(30, "Things", Color.BLUE));
                            add(new DoughnutChartData(50, "Gazooks", Color.DARK_GRAY));
                            add(new DoughnutChartData(100, "Zuckers", Color.MAGENTA));
                            add(new DoughnutChartData(40, "Gladiolas", Color.ORANGE));
                            add(new DoughnutChartData(50, "Cookies", Color.GREEN));
                        }},
                        new DoughnutChartOptions()
                                .setInGraphDataShow(true)
                                .setCrossText(325)
                                .setCrossTextOverlay(true)
                                .setCrossTextFontColor(Color.RED)
                                .setCrossTextFontSize(48)
                                .setCrossTextFontColor(Color.RED))), 640, 400);
        add(doughnutChartPanel);
	}
}
