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

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * The Class AbstractChartOptions provides some basic options, that are
 * available for all kinds of charts.
 * 
 * @author Martin Spielmann
 */
@JsonInclude(Include.NON_NULL)
public abstract class AbstractChartOptions implements Serializable {

	@JsonIgnore
	private static final long serialVersionUID = 2401861279216541412L;

	/** The animation. */
	private Boolean animation;

	/** The animation steps. */
	private Integer animationSteps;

	/** The animation easing. */
	private String animationEasing;

	/** The on animation complete. */
	private String onAnimationComplete;

    /** Flag indicating if the legend should be displayed */
    private Boolean legend;

    /** Flag indicating if the chart should be annotated */
    private Boolean annotateDisplay;

    /** Flag indicating if the data should be showed in the chart */
    private Boolean inGraphDataShow;

	/**
	 * Gets the animation.
	 * 
	 * @return the animation
	 */
	public Boolean getAnimation() {
		return animation;
	}

	/**
	 * Sets the animation.
	 * 
	 * @param animation
	 *            decides whether to animate the chart (default is true)
	 */
	public AbstractChartOptions setAnimation(Boolean animation) {
		this.animation = animation;
        return this;
	}

	/**
	 * Gets the animation steps.
	 * 
	 * @return the animation steps
	 */
	public Integer getAnimationSteps() {
		return animationSteps;
	}

	/**
	 * Sets the animation steps.
	 * 
	 * @param animationSteps
	 *            the number of animation steps (default is 60)
	 */
	public AbstractChartOptions setAnimationSteps(Integer animationSteps) {
		this.animationSteps = animationSteps;
        return this;
	}

	/**
	 * Gets the animation easing.
	 * 
	 * @return the animation easing
	 */
	public String getAnimationEasing() {
		return animationEasing;
	}

	/**
	 * Sets the animation easing.
	 * 
	 * @param animationEasing
	 *            the animation easing effect (default is "easeOutQuart"F)
	 */
	public AbstractChartOptions setAnimationEasing(String animationEasing) {
		this.animationEasing = animationEasing;
        return this;
	}

	/**
	 * Gets the javascript function that fires on animation complete.
	 * 
	 * @return the onAnimationComplete javascript function
	 */
	public String getOnAnimationComplete() {
		return onAnimationComplete;
	}

	/**
	 * Sets the onAnimationComplete javascript function.
	 * 
	 * @param onAnimationComplete
	 *            a function, that fires when the animation is complete
	 */
	public AbstractChartOptions setOnAnimationComplete(String onAnimationComplete) {
		this.onAnimationComplete = onAnimationComplete;
        return this;
	}

    /**
     * Returns the flag indicating if the legend should be visible
     *
     * @return Flag value
     */
    public Boolean getLegend() {
        return legend;
    }

    /**
     * Sets the value of the flag indicating if the legend should be visible.
     *
     * @param legend Flag indicating if the legend should be visible
     */
    public AbstractChartOptions setLegend(Boolean legend) {
        this.legend = legend;
        return this;
    }

    /**
     * Returns the flag indicating that the display should be annotated.
     *
     * @return Flag indicating that the display should be annotated
     */
    public Boolean getAnnotateDisplay() {
        return annotateDisplay;
    }

    /**
     * Sets the flag indicating that the display should be annotated.
     *
     * @param annotateDisplay Flag indicating that the display should be annotated.
     */
    public AbstractChartOptions setAnnotateDisplay(Boolean annotateDisplay) {
        this.annotateDisplay = annotateDisplay;
        return this;
    }

    /**
     * Returns the flag indicating if labels should be drawn near the chart components (i.e. pie slices, nodes, etc.)
     *
     * @return Flag indicating if graph data labels should be displayed
     */
    public Boolean getInGraphDataShow() {
        return inGraphDataShow;
    }

    /**
     * Sets the flag indicating if labels should be drawn near the chart components (i.e. pie slices, nodes, etc.)

     * @param inGraphDataShow Flag indicating if graph data labels should be displayed
     */
    public AbstractChartOptions setInGraphDataShow(Boolean inGraphDataShow) {
        this.inGraphDataShow = inGraphDataShow;
        return this;
    }
}
