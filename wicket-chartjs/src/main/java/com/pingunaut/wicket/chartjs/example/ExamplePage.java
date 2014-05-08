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

import java.util.ArrayList;
import java.util.List;

import com.pingunaut.wicket.chartjs.chart.impl.Doughnut;
import com.pingunaut.wicket.chartjs.core.panel.DoughnutChartPanel;
import com.pingunaut.wicket.chartjs.data.DoughnutChartData;
import com.pingunaut.wicket.chartjs.options.DoughnutChartOptions;
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

        List<DoughnutChartData> doughnutData = new ArrayList<DoughnutChartData>() {{
            add(new DoughnutChartData(30, "Things", "#f7464a"));
            add(new DoughnutChartData(50, "Gazooks", "#e2eae9"));
            add(new DoughnutChartData(100, "Zuckers", "#d4ccc5"));
            add(new DoughnutChartData(40, "Gladiolas", "#949fb1"));
            add(new DoughnutChartData(50, "Cookies", "#4d5360"));
        }};

        // line chart
        LineChartPanel lineChartPanel = new LineChartPanel("lineChart", Model.of(new Line()));
        lineChartPanel.getChart().getData().getDatasets().add(new LineDataSet(values1));
        lineChartPanel.getChart().getData().getLabels().addAll(labels);
        add(lineChartPanel);

        // pie chart
        PieChartPanel pieChartPanel = new PieChartPanel("pieChart", Model.of(new Pie()));
        for (Integer i : values1) {
            pieChartPanel.getChart().getData().add(new PieChartData(i, "#" + i + i + i));
        }
        add(pieChartPanel);

        // doughnut chart
        DoughnutChartPanel doughnutChartPanel = new DoughnutChartPanel("doughnutChart", Model.of(new Doughnut()), 640, 400);
        doughnutChartPanel.getChart().setData(doughnutData);
        doughnutChartPanel.getChart().getOptions().setInGraphDataShow(true);
        add(doughnutChartPanel);
	}
}
