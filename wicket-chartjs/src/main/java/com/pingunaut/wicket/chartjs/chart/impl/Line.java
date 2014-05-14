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

import com.pingunaut.wicket.chartjs.chart.ILine;
import com.pingunaut.wicket.chartjs.data.LineChartData;
import com.pingunaut.wicket.chartjs.data.sets.LineDataSet;
import com.pingunaut.wicket.chartjs.options.LineChartOptions;

import java.util.ArrayList;

/**
 * The Class Line provides a simple implementation of chart.js line chart
 *
 * @author Martin Spielmann
 * @see <a href="http://www.chartjs.org/docs/#lineChart">chart.js docs</a>
 */
public class Line extends AbstractDataSetChart<LineChartData<LineDataSet>, LineChartOptions, LineDataSet> implements ILine {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = -3014944174538037710L;

    /**
     * Creates a new instance.
     */
    public Line() {
        this(new LineChartOptions());
    }

    /**
     * Creates a new instance and sets its options.
     *
     * @param options Options for this chart
     */
    public Line(LineChartOptions options) {
        super(new LineChartData(new ArrayList<String>(), new ArrayList<LineDataSet>()), options);
    }

    /**
     * Creates a new instance and populates its fields.
     *
     * @param data    The chart data (labels and data sets)
     * @param options Options for this chart
     */
    public Line(LineChartData data, LineChartOptions options) {
        super(data, options);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.pingunaut.wicket.chartjs.chart.IChart#getOptions()
     */
    @Override
    public LineChartOptions getOptions() {
        if (options == null) {
            options = new LineChartOptions();
        }
        return options;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * com.pingunaut.wicket.chartjs.chart.impl.AbstractDataSetChart#getData()
     */
    @Override
    public LineChartData<LineDataSet> getData() {
        if (data == null) {
            data = new LineChartData<LineDataSet>();
        }
        return data;
    }
}
