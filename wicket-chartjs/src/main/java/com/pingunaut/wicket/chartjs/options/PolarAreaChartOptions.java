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
import com.pingunaut.wicket.chartjs.chart.impl.PolarArea;

/**
 * The Class PolarAreaChartOptions provides options, that are available for.
 * 
 * {@link PolarArea}.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class PolarAreaChartOptions extends AbstractScalableChartOptions {

	/** The Constant serialVersionUID. */
	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	/** The scale show label backdrop. */
	private Boolean scaleShowLabelBackdrop;

	/** The scale backdrop color. */
	private String scaleBackdropColor;

	/** The scale backdrop padding y. */
	private Integer scaleBackdropPaddingY;

	/** The scale backdrop padding x. */
	private Integer scaleBackdropPaddingX;

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

	/**
	 * Gets the scale show label backdrop.
	 * 
	 * @return the scale show label backdrop
	 */
	public Boolean getScaleShowLabelBackdrop() {
		return scaleShowLabelBackdrop;
	}

	/**
	 * Sets the scale show label backdrop.
	 * 
	 * @param scaleShowLabelBackdrop
	 *            decides whether to show a backdrop to the scale label
	 */
	public PolarAreaChartOptions setScaleShowLabelBackdrop(Boolean scaleShowLabelBackdrop) {
		this.scaleShowLabelBackdrop = scaleShowLabelBackdrop;
        return this;
	}

	/**
	 * Gets the scale backdrop color.
	 * 
	 * @return the scale backdrop color
	 */
	public String getScaleBackdropColor() {
		return scaleBackdropColor;
	}

	/**
	 * Sets the scale backdrop color.
	 * 
	 * @param scaleBackdropColor
	 *            the new scale backdrop color (default is
	 *            "rgba(255,255,255,0.75)").
	 */
	public PolarAreaChartOptions setScaleBackdropColor(String scaleBackdropColor) {
		this.scaleBackdropColor = scaleBackdropColor;
        return this;
	}

	/**
	 * Gets the scale backdrop padding y.
	 * 
	 * @return the scale backdrop padding y
	 */
	public Integer getScaleBackdropPaddingY() {
		return scaleBackdropPaddingY;
	}

	/**
	 * Sets the scale backdrop padding y.
	 * 
	 * @param scaleBackdropPaddingY
	 *            the backdrop padding above & below the label in pixels
	 *            (default is 2).
	 */
	public PolarAreaChartOptions setScaleBackdropPaddingY(Integer scaleBackdropPaddingY) {
		this.scaleBackdropPaddingY = scaleBackdropPaddingY;
        return this;
	}

	/**
	 * Gets the scale backdrop padding x.
	 * 
	 * @return the scale backdrop padding x
	 */
	public Integer getScaleBackdropPaddingX() {
		return scaleBackdropPaddingX;
	}

	/**
	 * Sets the scale backdrop padding x.
	 * 
	 * @param scaleBackdropPaddingX
	 *            the backdrop padding to the side of the label in pixels
	 *            (default is 2).
	 */
	public PolarAreaChartOptions setScaleBackdropPaddingX(Integer scaleBackdropPaddingX) {
		this.scaleBackdropPaddingX = scaleBackdropPaddingX;
        return this;
	}

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
	public PolarAreaChartOptions setSegmentShowStroke(Boolean segmentShowStroke) {
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
	public PolarAreaChartOptions setSegmentStrokeColor(String segmentStrokeColor) {
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
	public PolarAreaChartOptions setSegmentStrokeWidth(Integer segmentStrokeWidth) {
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
	public PolarAreaChartOptions setAnimateRotate(Boolean animateRotate) {
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
	public PolarAreaChartOptions setAnimateScale(Boolean animateScale) {
		this.animateScale = animateScale;
        return this;
	}

    @Override
    public PolarAreaChartOptions setScaleOverride(Boolean scaleOverride) {
        super.setScaleOverride(scaleOverride);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleSteps(Integer scaleSteps) {
        super.setScaleSteps(scaleSteps);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleStepWidth(Integer scaleStepWidth) {
        super.setScaleStepWidth(scaleStepWidth);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleStartValue(Integer scaleStartValue) {
        super.setScaleStartValue(scaleStartValue);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleLineColor(String scaleLineColor) {
        super.setScaleLineColor(scaleLineColor);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleLineWidth(Integer scaleLineWidth) {
        super.setScaleLineWidth(scaleLineWidth);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleShowLabels(Boolean scaleShowLabels) {
        super.setScaleShowLabels(scaleShowLabels);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleOverlay(Boolean scaleOverlay) {
        super.setScaleOverlay(scaleOverlay);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleLabel(String scaleLabel) {
        super.setScaleLabel(scaleLabel);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleFontFamily(String scaleFontFamily) {
        super.setScaleFontFamily(scaleFontFamily);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleFontSize(Integer scaleFontSize) {
        super.setScaleFontSize(scaleFontSize);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleFontStyle(String scaleFontStyle) {
        super.setScaleFontStyle(scaleFontStyle);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleFontColor(String scaleFontColor) {
        super.setScaleFontColor(scaleFontColor);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleShowGridLines(Boolean scaleShowGridLines) {
        super.setScaleShowGridLines(scaleShowGridLines);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleGridLineColor(String scaleGridLineColor) {
        super.setScaleGridLineColor(scaleGridLineColor);
        return this;
    }

    @Override
    public PolarAreaChartOptions setScaleGridLineWidth(Integer scaleGridLineWidth) {
        super.setScaleGridLineWidth(scaleGridLineWidth);
        return this;
    }

    @Override
    public PolarAreaChartOptions setAnimation(Boolean animation) {
        super.setAnimation(animation);
        return this;
    }

    @Override
    public PolarAreaChartOptions setAnimationSteps(Integer animationSteps) {
        super.setAnimationSteps(animationSteps);
        return this;
    }

    @Override
    public PolarAreaChartOptions setAnimationEasing(String animationEasing) {
        super.setAnimationEasing(animationEasing);
        return this;
    }

    @Override
    public PolarAreaChartOptions setOnAnimationComplete(String onAnimationComplete) {
        super.setOnAnimationComplete(onAnimationComplete);
        return this;
    }

    @Override
    public PolarAreaChartOptions setLegend(Boolean legend) {
        super.setLegend(legend);
        return this;
    }

    @Override
    public PolarAreaChartOptions setAnnotateDisplay(Boolean annotateDisplay) {
        super.setAnnotateDisplay(annotateDisplay);
        return this;
    }

    @Override
    public PolarAreaChartOptions setInGraphDataShow(Boolean inGraphDataShow) {
        super.setInGraphDataShow(inGraphDataShow);
        return this;
    }
}
