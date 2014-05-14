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
import com.pingunaut.wicket.chartjs.chart.impl.Line;

/**
 * The Class LineChartOptions provides options, that are available for
 * {@link Line}.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class LineChartOptions extends AbstractScalableChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	/** The bezier curve. */
	private Boolean bezierCurve;

	/** The point dot. */
	private Boolean pointDot;

	/** The point dot radius. */
	private Integer pointDotRadius;

	/** The point dot stroke width. */
	private Integer pointDotStrokeWidth;

	/** The dataset stroke. */
	private Boolean datasetStroke;

	/** The dataset stroke width. */
	private Integer datasetStrokeWidth;

	/** The dataset fill. */
	private Boolean datasetFill;

	/**
	 * Gets the bezier curve.
	 * 
	 * @return the bezier curve
	 */
	public Boolean getBezierCurve() {
		return bezierCurve;
	}

	/**
	 * Sets the bezier curve.
	 * 
	 * @param bezierCurve
	 *            decides whether the line is curved between points (default is
	 *            true).
	 */
	public LineChartOptions setBezierCurve(Boolean bezierCurve) {
		this.bezierCurve = bezierCurve;
        return this;
	}

	/**
	 * Gets the point dot.
	 * 
	 * @return the point dot
	 */
	public Boolean getPointDot() {
		return pointDot;
	}

	/**
	 * Sets the point dot.
	 * 
	 * @param pointDot
	 *            decides whether to show a dot for each point (default is
	 *            true).
	 */
	public LineChartOptions setPointDot(Boolean pointDot) {
		this.pointDot = pointDot;
        return this;
	}

	/**
	 * Gets the point dot radius.
	 * 
	 * @return the point dot radius
	 */
	public Integer getPointDotRadius() {
		return pointDotRadius;
	}

	/**
	 * Sets the point dot radius.
	 * 
	 * @param pointDotRadius
	 *            the new point dot radius (default is 3).
	 */
	public LineChartOptions setPointDotRadius(Integer pointDotRadius) {
		this.pointDotRadius = pointDotRadius;
        return this;
	}

	/**
	 * Gets the point dot stroke width.
	 * 
	 * @return the point dot stroke width
	 */
	public Integer getPointDotStrokeWidth() {
		return pointDotStrokeWidth;
	}

	/**
	 * Sets the point dot stroke width.
	 * 
	 * @param pointDotStrokeWidth
	 *            the new point dot stroke width (default is 1).
	 */
	public LineChartOptions setPointDotStrokeWidth(Integer pointDotStrokeWidth) {
		this.pointDotStrokeWidth = pointDotStrokeWidth;
        return this;
	}

	/**
	 * Gets the dataset stroke.
	 * 
	 * @return the dataset stroke
	 */
	public Boolean getDatasetStroke() {
		return datasetStroke;
	}

	/**
	 * Sets the dataset stroke.
	 * 
	 * @param datasetStroke
	 *            decides whether to show a stroke for datasets (default is
	 *            true)
	 */
	public LineChartOptions setDatasetStroke(Boolean datasetStroke) {
		this.datasetStroke = datasetStroke;
        return this;
	}

	/**
	 * Gets the dataset stroke width.
	 * 
	 * @return the dataset stroke width
	 */
	public Integer getDatasetStrokeWidth() {
		return datasetStrokeWidth;
	}

	/**
	 * Sets the dataset stroke width.
	 * 
	 * @param datasetStrokeWidth
	 *            the new dataset stroke width (default is 2).
	 */
	public LineChartOptions setDatasetStrokeWidth(Integer datasetStrokeWidth) {
		this.datasetStrokeWidth = datasetStrokeWidth;
        return this;
	}

	/**
	 * Gets the dataset fill.
	 * 
	 * @return the dataset fill
	 */
	public Boolean getDatasetFill() {
		return datasetFill;
	}

	/**
	 * Sets the dataset fill.
	 * 
	 * @param datasetFill
	 *            whether to fill the dataset with a color (default is true)
	 */
	public LineChartOptions setDatasetFill(Boolean datasetFill) {
		this.datasetFill = datasetFill;
        return this;
	}

    @Override
    public LineChartOptions setScaleShowLabels(Boolean scaleShowLabels) {
        super.setScaleShowLabels(scaleShowLabels);
        return this;
    }

    @Override
    public LineChartOptions setLegend(Boolean legend) {
        super.setLegend(legend);
        return this;
    }

    @Override
    public LineChartOptions setAnnotateDisplay(Boolean annotateDisplay) {
        super.setAnnotateDisplay(annotateDisplay);
        return this;
    }

    @Override
    public LineChartOptions setScaleLabel(String scaleLabel) {
        super.setScaleLabel(scaleLabel);
        return this;
    }

    @Override
    public LineChartOptions setScaleOverlay(Boolean scaleOverlay) {
        super.setScaleOverlay(scaleOverlay);
        return this;
    }

    @Override
    public LineChartOptions setScaleOverride(Boolean scaleOverride) {
        super.setScaleOverride(scaleOverride);
        return this;
    }

    @Override
    public LineChartOptions setScaleSteps(Integer scaleSteps) {
        super.setScaleSteps(scaleSteps);
        return this;
    }

    @Override
    public LineChartOptions setScaleStartValue(Integer scaleStartValue) {
        super.setScaleStartValue(scaleStartValue);
        return this;
    }

    @Override
    public LineChartOptions setScaleStepWidth(Integer scaleStepWidth) {
        super.setScaleStepWidth(scaleStepWidth);
        return this;
    }

    @Override
    public LineChartOptions setScaleLineColor(String scaleLineColor) {
        super.setScaleLineColor(scaleLineColor);
        return this;
    }

    @Override
    public LineChartOptions setScaleLineWidth(Integer scaleLineWidth) {
        super.setScaleLineWidth(scaleLineWidth);
        return this;
    }

    @Override
    public LineChartOptions setScaleFontFamily(String scaleFontFamily) {
        super.setScaleFontFamily(scaleFontFamily);
        return this;
    }

    @Override
    public LineChartOptions setScaleFontSize(Integer scaleFontSize) {
        super.setScaleFontSize(scaleFontSize);
        return this;
    }

    @Override
    public LineChartOptions setScaleFontStyle(String scaleFontStyle) {
        super.setScaleFontStyle(scaleFontStyle);
        return this;
    }

    @Override
    public LineChartOptions setScaleFontColor(String scaleFontColor) {
        super.setScaleFontColor(scaleFontColor);
        return this;
    }

    @Override
    public LineChartOptions setScaleShowGridLines(Boolean scaleShowGridLines) {
        super.setScaleShowGridLines(scaleShowGridLines);
        return this;
    }

    @Override
    public LineChartOptions setScaleGridLineColor(String scaleGridLineColor) {
        super.setScaleGridLineColor(scaleGridLineColor);
        return this;
    }

    @Override
    public LineChartOptions setScaleGridLineWidth(Integer scaleGridLineWidth) {
        super.setScaleGridLineWidth(scaleGridLineWidth);
        return this;
    }

    @Override
    public LineChartOptions setAnimation(Boolean animation) {
        super.setAnimation(animation);
        return this;
    }

    @Override
    public LineChartOptions setAnimationSteps(Integer animationSteps) {
        super.setAnimationSteps(animationSteps);
        return this;
    }

    @Override
    public LineChartOptions setAnimationEasing(String animationEasing) {
        super.setAnimationEasing(animationEasing);
        return this;
    }

    @Override
    public LineChartOptions setOnAnimationComplete(String onAnimationComplete) {
        super.setOnAnimationComplete(onAnimationComplete);
        return this;
    }

    @Override
    public LineChartOptions setInGraphDataShow(Boolean inGraphDataShow) {
        super.setInGraphDataShow(inGraphDataShow);
        return this;
    }
}
