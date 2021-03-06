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
package com.pingunaut.wicket.chartjs.data.sets;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class AbstractPointColorDataSet provides some additional point color and
 * point stroke color information. it's used by line and radar charts.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public abstract class AbstractPointColorDataSet<T> extends AbstractBaseDataSet {

	@JsonIgnore
	private static final long serialVersionUID = 1581171902504828797L;

	/** The point color. */
	private String pointColor = "rgba(220,220,220,1)";

	/** The point stroke color. */
	private String pointStrokeColor = "#fff";

	/**
	 * Instantiates a new abstract point color data set.
	 */
	public AbstractPointColorDataSet() {
        this(new ArrayList<T>());
    }

	/**
	 * Instantiates a new abstract point color data set.
	 * 
	 * @param values
	 *            the values
	 */
    public AbstractPointColorDataSet(List<T> values) {
        super(values);
    }

    public AbstractPointColorDataSet(Color fillColor, Color strokeColor, List values) {
        super(fillColor, strokeColor, values);
    }

    public AbstractPointColorDataSet(String fillColor, String strokeColor, List values) {
        super(fillColor, strokeColor, values);
    }

    /**
     * Gets the point color.
	 * 
	 * @return the point color
	 */
	public String getPointColor() {
		return pointColor;
	}

	/**
	 * Sets the point color.
	 * 
	 * @param pointColor
	 *            the point color
	 * @return the abstract point color data set
	 */
	public AbstractPointColorDataSet setPointColor(String pointColor) {
		this.pointColor = pointColor;
		return this;
	}

	/**
	 * Gets the point stroke color.
	 * 
	 * @return the point stroke color
	 */
	public String getPointStrokeColor() {
		return pointStrokeColor;
	}

	/**
	 * Sets the point stroke color.
	 * 
	 * @param pointStrokeColor
	 *            the point stroke color
	 * @return the abstract point color data set
	 */
	public AbstractPointColorDataSet setPointStrokeColor(String pointStrokeColor) {
		this.pointStrokeColor = pointStrokeColor;
		return this;
	}

    @Override
    public AbstractPointColorDataSet setFillColor(String fillColor) {
        super.setFillColor(fillColor);
        return this;
    }

    @Override
    public AbstractPointColorDataSet setStrokeColor(String strokeColor) {
        super.setStrokeColor(strokeColor);
        return this;
    }

    @Override
    public AbstractPointColorDataSet setData(List data) {
        super.setData(data);
        return this;
    }
}
