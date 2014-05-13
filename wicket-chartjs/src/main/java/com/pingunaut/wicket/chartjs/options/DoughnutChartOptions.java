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
import com.pingunaut.wicket.chartjs.chart.impl.Doughnut;

import java.awt.*;
import java.util.List;

/**
 * The Class DoughnutChartOptions provides options, that are available for
 * {@link Doughnut}.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public class DoughnutChartOptions extends PieChartOptions {

	@JsonIgnore
	private static final long serialVersionUID = -5356780831848556616L;

	/** The percentage inner cutout. */
	private Integer percentageInnerCutout;

    public Integer getPercentageInnerCutout() {
        return percentageInnerCutout;
    }

    public DoughnutChartOptions setPercentageInnerCutout(Integer percentageInnerCutout) {
        this.percentageInnerCutout = percentageInnerCutout;
        return this;
    }

    @Override
    public DoughnutChartOptions setInGraphDataShow(Boolean inGraphDataShow) {
        super.setInGraphDataShow(inGraphDataShow);
        return this;
    }

    @Override
    public DoughnutChartOptions setSegmentShowStroke(Boolean segmentShowStroke) {
        super.setSegmentShowStroke(segmentShowStroke);
        return this;
    }

    @Override
    public DoughnutChartOptions setSegmentStrokeColor(String segmentStrokeColor) {
        super.setSegmentStrokeColor(segmentStrokeColor);
        return this;
    }

    @Override
    public DoughnutChartOptions setSegmentStrokeWidth(Integer segmentStrokeWidth) {
        super.setSegmentStrokeWidth(segmentStrokeWidth);
        return this;
    }

    @Override
    public DoughnutChartOptions setAnimateRotate(Boolean animateRotate) {
        super.setAnimateRotate(animateRotate);
        return this;
    }

    @Override
    public DoughnutChartOptions setAnimateScale(Boolean animateScale) {
        super.setAnimateScale(animateScale);
        return this;
    }

    @Override
    public DoughnutChartOptions setCrossText(List<String> crossText) {
        super.setCrossText(crossText);
        return this;
    }

    @Override
    public DoughnutChartOptions setCrossText(Object crossText) {
        super.setCrossText(crossText);
        return this;
    }

    @Override
    public DoughnutChartOptions setCrossTextOverlay(List<Boolean> crossTextOverlay) {
        super.setCrossTextOverlay(crossTextOverlay);
        return this;
    }

    @Override
    public DoughnutChartOptions setCrossTextOverlay(Boolean crossTextOverlay) {
        super.setCrossTextOverlay(crossTextOverlay);
        return this;
    }

    @Override
    public DoughnutChartOptions setCrossTextFontFamily(List<String> crossTextFontFamily) {
        super.setCrossTextFontFamily(crossTextFontFamily);
        return this;
    }

    @Override
    public DoughnutChartOptions setCrossTextFontFamily(String crossTextFontFamily) {
        super.setCrossTextFontFamily(crossTextFontFamily);
        return this;
    }

    @Override
    public DoughnutChartOptions setCrossTextFontSize(List<Integer> crossTextFontSize) {
        super.setCrossTextFontSize(crossTextFontSize);
        return this;
    }

    @Override
    public DoughnutChartOptions setCrossTextFontColor(List<String> crossTextFontColor) {
        super.setCrossTextFontColor(crossTextFontColor);
        return this;
    }

    @Override
    public DoughnutChartOptions setCrossTextFontSize(Integer crossTextFontSize) {
        super.setCrossTextFontSize(crossTextFontSize);
        return this;
    }

    @Override
    public DoughnutChartOptions setCrossTextFontColor(Color color) {
        super.setCrossTextFontColor(color);
        return this;
    }

    @Override
    public DoughnutChartOptions setCrossTextFontStyle(List<String> crossTextFontStyle) {
        super.setCrossTextFontStyle(crossTextFontStyle);
        return this;
    }

    @Override
    public AbstractChartOptions setAnimation(Boolean animation) {
        super.setAnimation(animation);
        return this;
    }

    @Override
    public AbstractChartOptions setAnimationSteps(Integer animationSteps) {
        super.setAnimationSteps(animationSteps);
        return this;
    }

    @Override
    public AbstractChartOptions setAnimationEasing(String animationEasing) {
        super.setAnimationEasing(animationEasing);
        return this;
    }

    @Override
    public AbstractChartOptions setOnAnimationComplete(String onAnimationComplete) {
        super.setOnAnimationComplete(onAnimationComplete);
        return this;
    }

    @Override
    public AbstractChartOptions setLegend(Boolean legend) {
        super.setLegend(legend);
        return this;
    }

    @Override
    public AbstractChartOptions setAnnotateDisplay(Boolean annotateDisplay) {
        super.setAnnotateDisplay(annotateDisplay);
        return this;
    }
}
