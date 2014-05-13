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

import com.pingunaut.wicket.chartjs.chart.IPolarArea;
import com.pingunaut.wicket.chartjs.data.PolarAreaChartData;
import com.pingunaut.wicket.chartjs.options.PolarAreaChartOptions;

/**
 * The Class PolarArea provides a simple implementation of chart.js polar area
 * chart
 * 
 * @see <a href="http://www.chartjs.org/docs/#polarAreaChart">chart.js docs</a>
 * 
 * @author Martin Spielmann
 * 
 */
public class PolarArea extends AbstractSimpleChart<PolarAreaChartData, PolarAreaChartOptions> implements IPolarArea {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6898362145345731457L;

    public PolarArea() {
        this(new ArrayList<PolarAreaChartData>(), new PolarAreaChartOptions());
    }

    public PolarArea(PolarAreaChartOptions options) {
        this(new ArrayList<PolarAreaChartData>(), options);
    }

    public PolarArea(List<PolarAreaChartData> data, PolarAreaChartOptions options) {
        super(options);
        this.data = data;
    }

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.pingunaut.wicket.chartjs.chart.IChart#getOptions()
	 */
	@Override
	public PolarAreaChartOptions getOptions() {
		return options;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pingunaut.wicket.chartjs.chart.impl.AbstractSimpleChart#getData()
	 */
	@Override
	public List<PolarAreaChartData> getData() {
		return data;
	}
}
