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
import com.pingunaut.wicket.chartjs.chart.impl.Radar;

/**
 * The Class RadarChartOptions provides options, that are available for.
 * 
 * {@link Radar}.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class RadarChartOptions extends AbstractChartOptions {

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

	/** The angle show line out. */
	private Boolean angleShowLineOut;

	/** The angle line color. */
	private String angleLineColor;

	/** The angle line width. */
	private Integer angleLineWidth;

	/** The point label font family. */
	private String pointLabelFontFamily;

	/** The point label font style. */
	private String pointLabelFontStyle;

	/** The point label font size. */
	private Integer pointLabelFontSize;

	/** The point label font color. */
	private String pointLabelFontColor;

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
	 *            decides whether to show a backdrop to the scale label (default
	 *            is true).
	 */
	public RadarChartOptions setScaleShowLabelBackdrop(Boolean scaleShowLabelBackdrop) {
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
	public RadarChartOptions setScaleBackdropColor(String scaleBackdropColor) {
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
	public RadarChartOptions setScaleBackdropPaddingY(Integer scaleBackdropPaddingY) {
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
	 *            (default is 2)
	 */
	public RadarChartOptions setScaleBackdropPaddingX(Integer scaleBackdropPaddingX) {
		this.scaleBackdropPaddingX = scaleBackdropPaddingX;
        return this;
	}

	/**
	 * Gets the angle show line out.
	 * 
	 * @return the angle show line out
	 */
	public Boolean getAngleShowLineOut() {
		return angleShowLineOut;
	}

	/**
	 * Sets the angle show line out.
	 * 
	 * @param angleShowLineOut
	 *            decides whether to show the angle lines out of the radar
	 *            (default is true)
	 */
	public RadarChartOptions setAngleShowLineOut(Boolean angleShowLineOut) {
		this.angleShowLineOut = angleShowLineOut;
        return this;
	}

	/**
	 * Gets the angle line color.
	 * 
	 * @return the angle line color
	 */
	public String getAngleLineColor() {
		return angleLineColor;
	}

	/**
	 * Sets the angle line color.
	 * 
	 * @param angleLineColor
	 *            the new angle line color (default is "rgba(0,0,0,.1)").
	 */
	public RadarChartOptions setAngleLineColor(String angleLineColor) {
		this.angleLineColor = angleLineColor;
        return this;
	}

	/**
	 * Gets the angle line width.
	 * 
	 * @return the angle line width
	 */
	public Integer getAngleLineWidth() {
		return angleLineWidth;
	}

	/**
	 * Sets the angle line width.
	 * 
	 * @param angleLineWidth
	 *            the new angle line width (default is 1)
	 */
	public RadarChartOptions setAngleLineWidth(Integer angleLineWidth) {
		this.angleLineWidth = angleLineWidth;
        return this;
	}

	/**
	 * Gets the point label font family.
	 * 
	 * @return the point label font family
	 */
	public String getPointLabelFontFamily() {
		return pointLabelFontFamily;
	}

	/**
	 * Sets the point label font family.
	 * 
	 * @param pointLabelFontFamily
	 *            the new point label font family (default is "'Arial'").
	 */
	public RadarChartOptions setPointLabelFontFamily(String pointLabelFontFamily) {
		this.pointLabelFontFamily = pointLabelFontFamily;
        return this;
	}

	/**
	 * Gets the point label font style.
	 * 
	 * @return the point label font style
	 */
	public String getPointLabelFontStyle() {
		return pointLabelFontStyle;
	}

	/**
	 * Sets the point label font style.
	 * 
	 * @param pointLabelFontStyle
	 *            the new point label font style (default is "normal").
	 */
	public RadarChartOptions setPointLabelFontStyle(String pointLabelFontStyle) {
		this.pointLabelFontStyle = pointLabelFontStyle;
        return this;
	}

	/**
	 * Gets the point label font size.
	 * 
	 * @return the point label font size
	 */
	public Integer getPointLabelFontSize() {
		return pointLabelFontSize;
	}

	/**
	 * Sets the point label font size.
	 * 
	 * @param pointLabelFontSize
	 *            the new point label font size (default is 12).
	 */
	public RadarChartOptions setPointLabelFontSize(Integer pointLabelFontSize) {
		this.pointLabelFontSize = pointLabelFontSize;
        return this;
	}

	/**
	 * Gets the point label font color.
	 * 
	 * @return the point label font color
	 */
	public String getPointLabelFontColor() {
		return pointLabelFontColor;
	}

	/**
	 * Sets the point label font color.
	 * 
	 * @param pointLabelFontColor
	 *            the new point label font color (default is "#666").
	 */
	public RadarChartOptions setPointLabelFontColor(String pointLabelFontColor) {
		this.pointLabelFontColor = pointLabelFontColor;
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
	public RadarChartOptions setPointDot(Boolean pointDot) {
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
	 *            the new point dot radius (default is 3)
	 */
	public RadarChartOptions setPointDotRadius(Integer pointDotRadius) {
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
	 *            the new point dot stroke width (default is 1)
	 */
	public RadarChartOptions setPointDotStrokeWidth(Integer pointDotStrokeWidth) {
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
	public RadarChartOptions setDatasetStroke(Boolean datasetStroke) {
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
	 *            the new dataset stroke width (default is 2)
	 */
	public RadarChartOptions setDatasetStrokeWidth(Integer datasetStrokeWidth) {
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
	 *            decides whether to fill the dataset with a color (default is
	 *            true).
	 */
	public RadarChartOptions setDatasetFill(Boolean datasetFill) {
		this.datasetFill = datasetFill;
        return this;
	}

    @Override
    public RadarChartOptions setAnimation(Boolean animation) {
        super.setAnimation(animation);
        return this;
    }

    @Override
    public RadarChartOptions setAnimationSteps(Integer animationSteps) {
        super.setAnimationSteps(animationSteps);
        return this;
    }

    @Override
    public RadarChartOptions setAnimationEasing(String animationEasing) {
        super.setAnimationEasing(animationEasing);
        return this;
    }

    @Override
    public RadarChartOptions setOnAnimationComplete(String onAnimationComplete) {
        super.setOnAnimationComplete(onAnimationComplete);
        return this;
    }

    @Override
    public RadarChartOptions setLegend(Boolean legend) {
        super.setLegend(legend);
        return this;
    }

    @Override
    public RadarChartOptions setAnnotateDisplay(Boolean annotateDisplay) {
        super.setAnnotateDisplay(annotateDisplay);
        return this;
    }

    @Override
    public RadarChartOptions setInGraphDataShow(Boolean inGraphDataShow) {
        super.setInGraphDataShow(inGraphDataShow);
        return this;
    }
}
