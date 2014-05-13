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
package com.pingunaut.wicket.chartjs.chart.impl;

import java.util.ArrayList;
import java.util.List;

import com.pingunaut.wicket.chartjs.chart.IPie;
import com.pingunaut.wicket.chartjs.data.PieChartData;
import com.pingunaut.wicket.chartjs.options.PieChartOptions;

/**
 * The Class Pie provides a simple implementation of chart.js pie chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#pieChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class Pie extends AbstractSimpleChart<PieChartData, PieChartOptions> implements IPie {

	private static final long serialVersionUID = -6898362145345731457L;

    public Pie() {
        this(new ArrayList<PieChartData>(), new PieChartOptions());
    }

    public Pie(PieChartOptions options) {
        this(new ArrayList<PieChartData>(), options);
    }

    public Pie(List<PieChartData> data, PieChartOptions options) {
        super(options);
        this.data = data;
    }

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IChart#getOptions()
	 */
	@Override
	public PieChartOptions getOptions() {
		return options;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pingunaut.wicket.chartjs.chart.impl.AbstractSimpleChart#getData()
	 */
	@Override
	public List<PieChartData> getData() {
		if (data == null) {
			data = new ArrayList<PieChartData>();
		}
		return data;
	}
}
