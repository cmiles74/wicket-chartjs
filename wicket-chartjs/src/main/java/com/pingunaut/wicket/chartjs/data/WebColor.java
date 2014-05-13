package com.pingunaut.wicket.chartjs.data;

import java.awt.*;

/**
 * Provides functions for translating between Java and CSS colors.
 */
public class WebColor {

    /**
     * Returns a CSS color String (RGBA) for the provided Java color.
     *
     * @param color Java color
     * @return String with the CSS color
     */
    public static String toCssColor(Color color) {
        return "rgba(" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + "," + color.getAlpha() + ")";
    }
}
