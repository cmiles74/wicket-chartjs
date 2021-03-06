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
package com.pingunaut.wicket.chartjs.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.awt.*;

/**
 * The Class DoughnutChartData provides chart data used by doughnut charts.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class DoughnutChartData<T> extends TitleColorValueChartData {

	@JsonIgnore
	private static final long serialVersionUID = -5122104387810776812L;

	/**
	 * Instantiates a new doughnut chart data.
	 * 
	 * @param value
	 *            the value
	 * @param color
	 *            the color
	 */
    public DoughnutChartData(T value, String color) {
        super(value, color);
	}

    /**
     * Instantiates a new doughnut chart data.
     *
     * @param value
     *            the value
     * @param color
     *            the color
     */
    public DoughnutChartData(T value, Color color) {
        super(value, color);
    }

    /**
     * Creates a new doughnut chart data instance.
     *
     * @param value Numeric value of this data point
     * @param title Title that accompanies this data point
     * @param color Color of this data point
     */
    public DoughnutChartData(T value, String title, String color) {
        super(value, title, color);
    }

    /**
     * Creates a new doughnut chart data instance.
     *
     * @param value Numeric value of this data point
     * @param title Title that accompanies this data point
     * @param color Color of this data point
     */
    public DoughnutChartData(T value, String title, Color color) {
        super(value, title, color);
    }
}
