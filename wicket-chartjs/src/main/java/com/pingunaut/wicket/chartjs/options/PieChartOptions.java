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

import java.util.HashMap;
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

    /**
     * Enumeration of cross text locations.
     */
    public enum CrossText {
        UP_LEFT,
        UP_CENTER,
        UP_RIGHT,
        MID_LEFT,
        MID_CENTER,
        MID_RIGHT,
        DOWN_LEFT,
        DOWN_CENTER,
        DOWN_RIGHT;

        private static Map<String, CrossText> nameMap = new HashMap<String, CrossText>() {{
            put("up left", UP_LEFT);
            put("up center", UP_CENTER);
            put("up right", UP_RIGHT);
            put("mid left", MID_LEFT);
            put("mid center", MID_CENTER);
            put("mid right", MID_RIGHT);
            put("down left", DOWN_LEFT);
            put("down center", DOWN_CENTER);
            put("down right", DOWN_RIGHT);
        }};

        @JsonCreator
        public static CrossText forValue(String value){
            return nameMap.get(value.toLowerCase());
        }

        @JsonValue
        public String toValue() {

            for (Map.Entry<String, CrossText> entry : nameMap.entrySet()) {
                if (entry.getValue() == this)
                    return entry.getKey();
            }

            return null;
        }
    }

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
    private CrossText crossText;

    /** Flag indicating if cross text should be displayed. */
    private Boolean crossTextOverlay;

    /** Font family used for the cross text. */
    private String crossTextFontFamily;

    /** Font size used for the cross text. */
    private Integer crossTextFontSize;

    /** Font color used for the cross text. */
    private String crossTextFontColor;

    /** Font style used for the cross text. */
    private String crossTextFontStyle;

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

    public CrossText getCrossText() {
        return crossText;
    }

    public void setCrossText(CrossText crossText) {
        this.crossText = crossText;
    }

    public Boolean getCrossTextOverlay() {
        return crossTextOverlay;
    }

    public void setCrossTextOverlay(Boolean crossTextOverlay) {
        this.crossTextOverlay = crossTextOverlay;
    }

    public String getCrossTextFontFamily() {
        return crossTextFontFamily;
    }

    public void setCrossTextFontFamily(String crossTextFontFamily) {
        this.crossTextFontFamily = crossTextFontFamily;
    }

    public Integer getCrossTextFontSize() {
        return crossTextFontSize;
    }

    public void setCrossTextFontSize(Integer crossTextFontSize) {
        this.crossTextFontSize = crossTextFontSize;
    }

    public String getCrossTextFontColor() {
        return crossTextFontColor;
    }

    public void setCrossTextFontColor(String crossTextFontColor) {
        this.crossTextFontColor = crossTextFontColor;
    }

    public String getCrossTextFontStyle() {
        return crossTextFontStyle;
    }

    public void setCrossTextFontStyle(String crossTextFontStyle) {
        this.crossTextFontStyle = crossTextFontStyle;
    }
}
