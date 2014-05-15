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
import com.pingunaut.wicket.chartjs.data.WebColor;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class AbstractBaseDataSet provides the simplest kind of a dataset.
 * besides the list of data itself, it contains default values for fill- and
 * stroke color.
 *
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public abstract class AbstractBaseDataSet<T> implements Serializable {

    /**
     * The default fill color.
     */
    public static final String DEFAULT_FILL_COLOR = "rgba(220,220,220,0.5)";
    /**
     * The stroke color.
     */
    public static final String DEFAULT_STROKE_COLOR = "rgba(220,220,220,1)";

    @JsonIgnore
    private static final long serialVersionUID = 1581171902504828797L;
    /**
     * The fill color.
     */
    protected String fillColor;

    /**
     * The stroke color.
     */
    protected String strokeColor;

    /**
     * The data.
     */
    protected List<T> data;

    /**
     * Instantiates a new abstract base data set.
     */
    public AbstractBaseDataSet() {
        this(new ArrayList<T>());
    }

    /**
     * Instantiates a new abstract base data set.
     *
     * @param values the data values
     */
    public AbstractBaseDataSet(List<T> values) {
        this(DEFAULT_FILL_COLOR, DEFAULT_STROKE_COLOR, values);
    }

    /**
     * Instantiates a new abstract base data set.
     */
    public AbstractBaseDataSet(Color fillColor, Color strokeColor, List<T> values) {
        this(WebColor.toCssColor(fillColor), WebColor.toCssColor(strokeColor), values);
    }

    /**
     * Instantiates a new abstract base data set.
     */
    public AbstractBaseDataSet(String fillColor, String strokeColor, List<T> values) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        data = values;
    }

    /**
     * Gets the fill color.
     *
     * @return the fill color
     */
    public String getFillColor() {
        return fillColor;
    }

    /**
     * Sets the fill color.
     *
     * @param fillColor the fill color
     * @return the abstract base data set
     */
    public AbstractBaseDataSet setFillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    /**
     * Sets the fill color.
     *
     * @param fillColor the fill color
     * @return the abstract base data set
     */
    public AbstractBaseDataSet setFillColor(Color fillColor) {
        this.fillColor = WebColor.toCssColor(fillColor);
        return this;
    }

    /**
     * Gets the stroke color.
     *
     * @return the stroke color
     */
    public String getStrokeColor() {
        return strokeColor;
    }

    /**
     * Sets the stroke color.
     *
     * @param strokeColor the stroke color
     * @return the abstract base data set
     */
    public AbstractBaseDataSet setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
        return this;
    }

    /**
     * Sets the stroke color.
     *
     * @param strokeColor the stroke color
     * @return the abstract base data set
     */
    public AbstractBaseDataSet setStrokeColor(Color strokeColor) {
        this.strokeColor = WebColor.toCssColor(strokeColor);
        return this;
    }

    /**
     * Gets the data.
     *
     * @return the data
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param data the data
     * @return the abstract base data set
     */
    public AbstractBaseDataSet setData(List<T> data) {
        this.data = data;
        return this;
    }

}
