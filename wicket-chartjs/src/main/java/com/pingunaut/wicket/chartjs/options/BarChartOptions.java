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
import com.pingunaut.wicket.chartjs.chart.impl.Bar;

/**
 * The Class BarChartOptions provides options, that are available for
 * {@link Bar}.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class BarChartOptions extends AbstractScalableChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	/** The bar show stroke. */
	private Boolean barShowStroke;

	/** The bar stroke width. */
	private Integer barStrokeWidth;

	/** The bar value spacing. */
	private Integer barValueSpacing;

	/** The bar dataset spacing. */
	private Integer barDatasetSpacing;

	/**
	 * Gets the bar show stroke.
	 * 
	 * @return the bar show stroke
	 */
	public Boolean getBarShowStroke() {
		return barShowStroke;
	}

	/**
	 * Sets the bar show stroke.
	 * 
	 * @param barShowStroke
	 *            the new bar show stroke (default is true).
	 */
	public BarChartOptions setBarShowStroke(Boolean barShowStroke) {
		this.barShowStroke = barShowStroke;
        return this;
	}

	/**
	 * Gets the bar stroke width.
	 * 
	 * @return the bar stroke width
	 */
	public Integer getBarStrokeWidth() {
		return barStrokeWidth;
	}

	/**
	 * Sets the bar stroke width.
	 * 
	 * @param barStrokeWidth
	 *            the new bar stroke width (default is 2).
	 */
	public BarChartOptions setBarStrokeWidth(Integer barStrokeWidth) {
		this.barStrokeWidth = barStrokeWidth;
        return this;
	}

	/**
	 * Gets the bar value spacing.
	 * 
	 * @return the bar value spacing
	 */
	public Integer getBarValueSpacing() {
		return barValueSpacing;
	}

	/**
	 * Sets the bar value spacing.
	 * 
	 * @param barValueSpacing
	 *            the spacing between each of the X value sets (default is 5)
	 */
	public BarChartOptions setBarValueSpacing(Integer barValueSpacing) {
		this.barValueSpacing = barValueSpacing;
        return this;
	}

	/**
	 * Gets the bar dataset spacing.
	 * 
	 * @return the bar dataset spacing
	 */
	public Integer getBarDatasetSpacing() {
		return barDatasetSpacing;
	}

	/**
	 * Sets the bar dataset spacing.
	 * 
	 * @param barDatasetSpacing
	 *            the spacing between data sets within X values (default is 1).
	 */
	public BarChartOptions setBarDatasetSpacing(Integer barDatasetSpacing) {
		this.barDatasetSpacing = barDatasetSpacing;
        return this;
	}

    @Override
    public BarChartOptions setScaleOverlay(Boolean scaleOverlay) {
        super.setScaleOverlay(scaleOverlay);
        return this;
    }

    @Override
    public BarChartOptions setScaleOverride(Boolean scaleOverride) {
        super.setScaleOverride(scaleOverride);
        return this;
    }

    @Override
    public BarChartOptions setScaleSteps(Integer scaleSteps) {
        super.setScaleSteps(scaleSteps);
        return this;
    }

    @Override
    public BarChartOptions setScaleStepWidth(Integer scaleStepWidth) {
        super.setScaleStepWidth(scaleStepWidth);
        return this;
    }

    @Override
    public BarChartOptions setScaleStartValue(Integer scaleStartValue) {
        super.setScaleStartValue(scaleStartValue);
        return this;
    }

    @Override
    public BarChartOptions setScaleLineColor(String scaleLineColor) {
        super.setScaleLineColor(scaleLineColor);
        return this;
    }

    @Override
    public BarChartOptions setScaleLineWidth(Integer scaleLineWidth) {
        super.setScaleLineWidth(scaleLineWidth);
        return this;
    }

    @Override
    public BarChartOptions setScaleShowLabels(Boolean scaleShowLabels) {
        super.setScaleShowLabels(scaleShowLabels);
        return this;
    }

    @Override
    public BarChartOptions setScaleLabel(String scaleLabel) {
        super.setScaleLabel(scaleLabel);
        return this;
    }

    @Override
    public BarChartOptions setScaleFontFamily(String scaleFontFamily) {
        super.setScaleFontFamily(scaleFontFamily);
        return this;
    }

    @Override
    public BarChartOptions setScaleFontSize(Integer scaleFontSize) {
        super.setScaleFontSize(scaleFontSize);
        return this;
    }

    @Override
    public BarChartOptions setScaleFontStyle(String scaleFontStyle) {
        super.setScaleFontStyle(scaleFontStyle);
        return this;
    }

    @Override
    public BarChartOptions setScaleFontColor(String scaleFontColor) {
        super.setScaleFontColor(scaleFontColor);
        return this;
    }

    @Override
    public BarChartOptions setScaleShowGridLines(Boolean scaleShowGridLines) {
        super.setScaleShowGridLines(scaleShowGridLines);
        return this;
    }

    @Override
    public BarChartOptions setScaleGridLineColor(String scaleGridLineColor) {
        super.setScaleGridLineColor(scaleGridLineColor);
        return this;
    }

    @Override
    public BarChartOptions setScaleGridLineWidth(Integer scaleGridLineWidth) {
        super.setScaleGridLineWidth(scaleGridLineWidth);
        return this;
    }

    @Override
    public BarChartOptions setAnimation(Boolean animation) {
        super.setAnimation(animation);
        return this;
    }

    @Override
    public BarChartOptions setAnimationSteps(Integer animationSteps) {
        super.setAnimationSteps(animationSteps);
        return this;
    }

    @Override
    public BarChartOptions setAnimationEasing(String animationEasing) {
        super.setAnimationEasing(animationEasing);
        return this;
    }

    @Override
    public BarChartOptions setOnAnimationComplete(String onAnimationComplete) {
        super.setOnAnimationComplete(onAnimationComplete);
        return this;
    }

    @Override
    public BarChartOptions setLegend(Boolean legend) {
        super.setLegend(legend);
        return this;
    }

    @Override
    public BarChartOptions setAnnotateDisplay(Boolean annotateDisplay) {
        super.setAnnotateDisplay(annotateDisplay);
        return this;
    }

    @Override
    public BarChartOptions setInGraphDataShow(Boolean inGraphDataShow) {
        super.setInGraphDataShow(inGraphDataShow);
        return this;
    }
}
