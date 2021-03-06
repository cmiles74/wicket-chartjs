package com.pingunaut.wicket.chartjs.data;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.awt.*;
import java.io.Serializable;

/**
 * Provides a data object that models a data point in a chart that also includes a title attribute.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TitleColorValueChartData<T> implements Serializable {

    /**
     * The numeric value of this data point.
     */
    private T value;

    /**
     * The title that accompanies this data point.
     */
    private String title;

    /**
     * The color for this data point.
     */
    private String color;

    /**
     * Create a new instance.
     *
     * @param value Numeric value of this data point
     * @param color Color of this data point
     */
    public TitleColorValueChartData(T value, String color) {
        this(value, null, color);
    }

    /**
     * Create a new instance.
     *
     * @param value Numeric value of this data point
     * @param color Color of this data point
     */
    public TitleColorValueChartData(T value, Color color) {
        this(value, null, WebColor.toCssColor(color));
    }

    /**
     * Create a new instance.
     *
     * @param value Numeric value of this data point
     * @param title Title that accompanies this data pont
     * @param color Color of this data point
     */
    public TitleColorValueChartData(T value, String title, Color color) {

        this(value, title, WebColor.toCssColor(color));
    }

    /**
     * Create a new instance.
     *
     * @param value Numeric value of this data point
     * @param title Title that accompanies this data pont
     * @param color Color of this data point
     */
    public TitleColorValueChartData(T value, String title, String color) {

        this.value = value;
        this.title = title;
        this.color = color;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

