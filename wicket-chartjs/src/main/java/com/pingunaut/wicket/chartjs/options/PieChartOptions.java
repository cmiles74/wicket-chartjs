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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.pingunaut.wicket.chartjs.chart.impl.Pie;

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

    /** Flag indicating if the legend should be displayed */
    private Boolean legend;

    /** Flag indicating if the chart should be annotated */
    private Boolean annotateDisplay;

    /** Flag indicating if the data should be showed in the chart */
    private Boolean inGraphDataShow;

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
	public void setSegmentShowStroke(Boolean segmentShowStroke) {
		this.segmentShowStroke = segmentShowStroke;
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
	public void setSegmentStrokeColor(String segmentStrokeColor) {
		this.segmentStrokeColor = segmentStrokeColor;
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
	public void setSegmentStrokeWidth(Integer segmentStrokeWidth) {
		this.segmentStrokeWidth = segmentStrokeWidth;
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
	public void setAnimateRotate(Boolean animateRotate) {
		this.animateRotate = animateRotate;
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
	public void setAnimateScale(Boolean animateScale) {
		this.animateScale = animateScale;
	}

    public Boolean getLegend() {
        return legend;
    }

    public void setLegend(Boolean legend) {
        this.legend = legend;
    }

    public Boolean getAnnotateDisplay() {
        return annotateDisplay;
    }

    public void setAnnotateDisplay(Boolean annotateDisplay) {
        this.annotateDisplay = annotateDisplay;
    }

    public Boolean getInGraphDataShow() {
        return inGraphDataShow;
    }

    public void setInGraphDataShow(Boolean inGraphDataShow) {
        this.inGraphDataShow = inGraphDataShow;
    }
}
