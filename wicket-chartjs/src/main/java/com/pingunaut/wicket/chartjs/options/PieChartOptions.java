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
package com.pingunaut.wicket.chartjs.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonValue;
import com.pingunaut.wicket.chartjs.chart.impl.Pie;
import com.pingunaut.wicket.chartjs.data.WebColor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Class PieChartOptions provides options, that are available for
 * {@link Pie}.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class PieChartOptions extends AbstractChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	/** The segment show stroke. */
	private Boolean segmentShowStroke;

	/** The segment stroke color. */
	private String segmentStrokeColor;

	/** The segment stroke width. */
	private Integer segmentStrokeWidth;

	/** The animate rotate. */
	private Boolean animateRotate;

	/** The animate scale. */
	private Boolean animateScale;

    /** Location of cross text. */
    private List<String> crossText;

    /** Flag indicating if cross text should be displayed. */
    private List<Boolean> crossTextOverlay;

    /** Font family used for the cross text. */
    private List<String> crossTextFontFamily;

    /** Font size used for the cross text. */
    private List<Integer> crossTextFontSize;

    /** Font color used for the cross text. */
    private List<String> crossTextFontColor;

    /** Font style used for the cross text. */
    private List<String> crossTextFontStyle;

	/**
	 * Gets the segment show stroke.
	 * 
	 * @return the segment show stroke
	 */
	public Boolean getSegmentShowStroke() {
		return segmentShowStroke;
	}

	/**
	 * Sets the segment show stroke.
	 * 
	 * @param segmentShowStroke
	 *            decides whether we should show a stroke on each segment
	 *            (default is true)
	 */
	public PieChartOptions setSegmentShowStroke(Boolean segmentShowStroke) {
		this.segmentShowStroke = segmentShowStroke;
        return this;
	}

	/**
	 * Gets the segment stroke color.
	 * 
	 * @return the segment stroke color
	 */
	public String getSegmentStrokeColor() {
		return segmentStrokeColor;
	}

	/**
	 * Sets the segment stroke color.
	 * 
	 * @param segmentStrokeColor
	 *            the new segment stroke color (default is "#fff").
	 */
	public PieChartOptions setSegmentStrokeColor(String segmentStrokeColor) {
		this.segmentStrokeColor = segmentStrokeColor;
        return this;
	}

	/**
	 * Gets the segment stroke width.
	 * 
	 * @return the segment stroke width
	 */
	public Integer getSegmentStrokeWidth() {
		return segmentStrokeWidth;
	}

	/**
	 * Sets the segment stroke width.
	 * 
	 * @param segmentStrokeWidth
	 *            the new segment stroke width (default is 2).
	 */
	public PieChartOptions setSegmentStrokeWidth(Integer segmentStrokeWidth) {
		this.segmentStrokeWidth = segmentStrokeWidth;
        return this;
	}

	/**
	 * Gets the animate rotate.
	 * 
	 * @return the animate rotate
	 */
	public Boolean getAnimateRotate() {
		return animateRotate;
	}

	/**
	 * Sets the animate rotate.
	 * 
	 * @param animateRotate
	 *            decides whether we animate the rotation of the pie (default is
	 *            true).
	 */
	public PieChartOptions setAnimateRotate(Boolean animateRotate) {
		this.animateRotate = animateRotate;
        return this;
	}

	/**
	 * Gets the animate scale.
	 * 
	 * @return the animate scale
	 */
	public Boolean getAnimateScale() {
		return animateScale;
	}

	/**
	 * Sets the animate scale.
	 * 
	 * @param animateScale
	 *            decides whether we animate scaling the Pie from the center
	 *            (default is false).
	 */
	public PieChartOptions setAnimateScale(Boolean animateScale) {
		this.animateScale = animateScale;
        return this;
	}

    public List<String> getCrossText() {
        return crossText;
    }

    public PieChartOptions setCrossText(List<String> crossText) {
        this.crossText = crossText;
        return this;
    }

    public PieChartOptions setCrossText(Object crossText) {
        this.crossText = Arrays.asList(new String[]{crossText.toString()});
        return this;
    }

    public List<Boolean> getCrossTextOverlay() {
        return crossTextOverlay;
    }

    public PieChartOptions setCrossTextOverlay(List<Boolean> crossTextOverlay) {
        this.crossTextOverlay = crossTextOverlay;
        return this;
    }

    public PieChartOptions setCrossTextOverlay(Boolean crossTextOverlay) {
        this.crossTextOverlay = Arrays.asList(new Boolean[]{crossTextOverlay});
        return this;
    }

    public List<String> getCrossTextFontFamily() {
        return crossTextFontFamily;
    }

    public PieChartOptions setCrossTextFontFamily(List<String> crossTextFontFamily) {
        this.crossTextFontFamily = crossTextFontFamily;
        return this;
    }

    public PieChartOptions setCrossTextFontFamily(String crossTextFontFamily) {
        this.crossTextFontFamily = Arrays.asList(new String[]{crossTextFontFamily});
        return this;
    }

    public List<Integer> getCrossTextFontSize() {
        return crossTextFontSize;
    }

    public PieChartOptions setCrossTextFontSize(List<Integer> crossTextFontSize) {
        this.crossTextFontSize = crossTextFontSize;
        return this;
    }

    public PieChartOptions setCrossTextFontSize(Integer crossTextFontSize) {
        this.crossTextFontSize = Arrays.asList(new Integer[]{crossTextFontSize});
        return this;
    }

    public List<String> getCrossTextFontColor() {
        return crossTextFontColor;
    }

    public PieChartOptions setCrossTextFontColor(List<String> crossTextFontColor) {
        this.crossTextFontColor = crossTextFontColor;
        return this;
    }

    public PieChartOptions setCrossTextFontColor(Color color) {
        this.crossTextFontColor = Arrays.asList(new String[]{WebColor.toCssColor(color)});
        return this;
    }

    public List<String> getCrossTextFontStyle() {
        return crossTextFontStyle;
    }

    public PieChartOptions setCrossTextFontStyle(List<String> crossTextFontStyle) {
        this.crossTextFontStyle = crossTextFontStyle;
        return this;
    }

    public PieChartOptions setCrossTextFontStyle(String crossTextFontStyle) {
        this.crossTextFontStyle = Arrays.asList(new String[]{crossTextFontStyle});
        return this;
    }
}
