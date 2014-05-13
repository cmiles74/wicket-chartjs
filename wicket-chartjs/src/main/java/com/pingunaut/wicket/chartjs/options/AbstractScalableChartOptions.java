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

/**
 * The Class AbstractScalableChartOptions provides some basic options, that are
 * available for all kinds of scalable charts.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public abstract class AbstractScalableChartOptions extends AbstractChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = 5541028648375495668L;

	/** The scale overlay. */
	private Boolean scaleOverlay;

	/** The scale override. */
	private Boolean scaleOverride;

	// ** The next three are required if scaleOverride is true **
	/** The scale steps. */
	private Integer scaleSteps;

    /** The scale step width. */
	private Integer scaleStepWidth;

    /** The scale start value. */
	private Integer scaleStartValue;

	/** The scale line color. */
	private String scaleLineColor;

	/** The scale line width. */
	private Integer scaleLineWidth;

	/** The scale show labels. */
	private Boolean scaleShowLabels;

	/** The scale label. */
	private String scaleLabel;

	/** The scale font family. */
	private String scaleFontFamily;

	/** The scale font size. */
	private Integer scaleFontSize;

	/** The scale font style. */
	private String scaleFontStyle;

	/** The scale font color. */
	private String scaleFontColor;

	/** The scale show grid lines. */
	private Boolean scaleShowGridLines;

	/** The scale grid line color. */
	private String scaleGridLineColor;

	/** The scale grid line width. */
	private Integer scaleGridLineWidth;

	/**
	 * Gets the scale overlay.
	 * 
	 * @return the scale overlay
	 */
	public Boolean getScaleOverlay() {
		return scaleOverlay;
	}

	/**
	 * Sets the scale overlay.
	 * 
	 * @param scaleOverlay
	 *            decides if the scale above the chart data is shown (default is
	 *            false)
	 */
	public void setScaleOverlay(Boolean scaleOverlay) {
		this.scaleOverlay = scaleOverlay;
	}

	/**
	 * Gets the scale override.
	 * 
	 * @return the scale override
	 */
	public Boolean getScaleOverride() {
		return scaleOverride;
	}

	/**
	 * Sets the scale override.
	 * 
	 * @param scaleOverride
	 *            decides if you want to override with a hard coded scale
	 */
	public void setScaleOverride(Boolean scaleOverride) {
		this.scaleOverride = scaleOverride;
	}

	/**
	 * Gets the scale steps.
	 * 
	 * @return the scale steps
	 */
	public Integer getScaleSteps() {
		return scaleSteps;
	}

	/**
	 * Sets the scale steps.
	 * 
	 * @param scaleSteps
	 *            the number of steps in a hard coded scale (required if
	 *            scaleOverride == true, default is null).
	 */
	public void setScaleSteps(Integer scaleSteps) {
		this.scaleSteps = scaleSteps;
	}

	/**
	 * Gets the scale step width.
	 * 
	 * @return the scale step width
	 */
	public Integer getScaleStepWidth() {
		return scaleStepWidth;
	}

	/**
	 * Sets the scale step width.
	 * 
	 * @param scaleStepWidth
	 *            the value jump in the hard coded scale (required if
	 *            scaleOverride == true, default is null).
	 */
	public void setScaleStepWidth(Integer scaleStepWidth) {
		this.scaleStepWidth = scaleStepWidth;
	}

	/**
	 * Gets the scale start value.
	 * 
	 * @return the scale start value
	 */
	public Integer getScaleStartValue() {
		return scaleStartValue;
	}

	/**
	 * Sets the scale start value.
	 * 
	 * @param scaleStartValue
	 *            the scale starting value (required if scaleOverride == true,
	 *            default is null).
	 */
	public void setScaleStartValue(Integer scaleStartValue) {
		this.scaleStartValue = scaleStartValue;
	}

	/**
	 * Gets the scale line color.
	 * 
	 * @return the scale line color
	 */
	public String getScaleLineColor() {
		return scaleLineColor;
	}

	/**
	 * Sets the scale line color.
	 * 
	 * @param scaleLineColor
	 *            color of the scale line
	 */
	public void setScaleLineColor(String scaleLineColor) {
		this.scaleLineColor = scaleLineColor;
	}

	/**
	 * Gets the scale line width.
	 * 
	 * @return the scale line width
	 */
	public Integer getScaleLineWidth() {
		return scaleLineWidth;
	}

	/**
	 * Sets the scale line width.
	 * 
	 * @param scaleLineWidth
	 *            the pixel width of the scale line
	 */
	public void setScaleLineWidth(Integer scaleLineWidth) {
		this.scaleLineWidth = scaleLineWidth;
	}

	/**
	 * Gets the scale show labels.
	 * 
	 * @return the scale show labels
	 */
	public Boolean getScaleShowLabels() {
		return scaleShowLabels;
	}

	/**
	 * Sets the scale show labels.
	 * 
	 * @param scaleShowLabels
	 *            decides whether to show labels on the scale
	 */
	public AbstractScalableChartOptions setScaleShowLabels(Boolean scaleShowLabels) {
		this.scaleShowLabels = scaleShowLabels;
        return this;
	}

	/**
	 * Gets the scale label.
	 * 
	 * @return the scale label
	 */
	public String getScaleLabel() {
		return scaleLabel;
	}

	/**
	 * Sets the scale label.
	 * 
	 * @param scaleLabel
	 *            an interpolated js string that can access value. (default is
	 *            "<%=value%>").
	 */
	public AbstractScalableChartOptions setScaleLabel(String scaleLabel) {
		this.scaleLabel = scaleLabel;
        return this;
	}

	/**
	 * Gets the scale font family.
	 * 
	 * @return the scale font family
	 */
	public String getScaleFontFamily() {
		return scaleFontFamily;
	}

	/**
	 * Sets the scale font family.
	 * 
	 * @param scaleFontFamily
	 *            scale label font declaration for the scale label (default is
	 *            "'Arial'").
	 */
	public void setScaleFontFamily(String scaleFontFamily) {
		this.scaleFontFamily = scaleFontFamily;
	}

	/**
	 * Gets the scale font size.
	 * 
	 * @return the scale font size
	 */
	public Integer getScaleFontSize() {
		return scaleFontSize;
	}

	/**
	 * Sets the scale font size.
	 * 
	 * @param scaleFontSize
	 *            the scale label font size in pixels
	 */
	public void setScaleFontSize(Integer scaleFontSize) {
		this.scaleFontSize = scaleFontSize;
	}

	/**
	 * Gets the scale font style.
	 * 
	 * @return the scale font style
	 */
	public String getScaleFontStyle() {
		return scaleFontStyle;
	}

	/**
	 * Sets the scale font style.
	 * 
	 * @param scaleFontStyle
	 *            the scale label font weight style (default is "normal").
	 */
	public void setScaleFontStyle(String scaleFontStyle) {
		this.scaleFontStyle = scaleFontStyle;
	}

	/**
	 * Gets the scale font color.
	 * 
	 * @return the scale font color
	 */
	public String getScaleFontColor() {
		return scaleFontColor;
	}

	/**
	 * Sets the scale font color.
	 * 
	 * @param scaleFontColor
	 *            the scale label font color (default is "#666").
	 */
	public void setScaleFontColor(String scaleFontColor) {
		this.scaleFontColor = scaleFontColor;
	}

	/**
	 * Gets the scale show grid lines.
	 * 
	 * @return the scale show grid lines
	 */
	public Boolean getScaleShowGridLines() {
		return scaleShowGridLines;
	}

	/**
	 * Sets the scale show grid lines.
	 * 
	 * @param scaleShowGridLines
	 *            decides whether grid lines are shown across the chart (default
	 *            is true).
	 */
	public void setScaleShowGridLines(Boolean scaleShowGridLines) {
		this.scaleShowGridLines = scaleShowGridLines;
	}

	/**
	 * Gets the scale grid line color.
	 * 
	 * @return the scale grid line color
	 */
	public String getScaleGridLineColor() {
		return scaleGridLineColor;
	}

	/**
	 * Sets the scale grid line color.
	 * 
	 * @param scaleGridLineColor
	 *            the new scale grid line color (default is "rgba(0,0,0,.05)").
	 */
	public void setScaleGridLineColor(String scaleGridLineColor) {
		this.scaleGridLineColor = scaleGridLineColor;
	}

	/**
	 * Gets the scale grid line width.
	 * 
	 * @return the scale grid line width
	 */
	public Integer getScaleGridLineWidth() {
		return scaleGridLineWidth;
	}

	/**
	 * Sets the scale grid line width.
	 * 
	 * @param scaleGridLineWidth
	 *            the new scale grid line width (default is 1)
	 */
	public void setScaleGridLineWidth(Integer scaleGridLineWidth) {
		this.scaleGridLineWidth = scaleGridLineWidth;
	}
}
