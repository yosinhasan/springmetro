package com.metro.university.entity;

import java.io.Serializable;

/**
 * 
 * @author elpai
 *
 */
public class SettingsEntity implements Serializable {

    private double coefficientVertical;
    private double deltaVertical;
    private double coefficientHorizontal;
    private double deltaHorizontal;
    private double length;
    private int id;

    public double getCoefficientVertical() {
        return coefficientVertical;
    }

    public void setCoefficientVertical(double coefficientVertical) {
        this.coefficientVertical = coefficientVertical;
    }

    public double getDeltaVertical() {
        return deltaVertical;
    }

    public void setDeltaVertical(double deltaVertical) {
        this.deltaVertical = deltaVertical;
    }

    public double getCoefficientHorizontal() {
        return coefficientHorizontal;
    }

    public void setCoefficientHorizontal(double coefficientHorizontal) {
        this.coefficientHorizontal = coefficientHorizontal;
    }

    public double getDeltaHorizontal() {
        return deltaHorizontal;
    }

    public void setDeltaHorizontal(double deltaHorizontal) {
        this.deltaHorizontal = deltaHorizontal;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SettingsEntity that = (SettingsEntity) o;

        if (Double.compare(that.coefficientVertical, coefficientVertical) != 0) return false;
        if (Double.compare(that.deltaVertical, deltaVertical) != 0) return false;
        if (Double.compare(that.coefficientHorizontal, coefficientHorizontal) != 0) return false;
        if (Double.compare(that.deltaHorizontal, deltaHorizontal) != 0) return false;
        if (Double.compare(that.length, length) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(coefficientVertical);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(deltaVertical);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(coefficientHorizontal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(deltaHorizontal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Length = " + length + ", deltaVertical = " + deltaVertical + ", coefficientVertical = " + coefficientVertical
                + ", deltaHorizontal = " + deltaHorizontal + ", coefficientHorizontal = " + coefficientHorizontal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
