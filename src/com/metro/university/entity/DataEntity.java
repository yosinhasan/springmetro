package com.metro.university.entity;

/**
 * 
 * @author elpai
 *
 */
public class DataEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long pointNumber;
	private double horizontalLength;
	private double verticalLength;

	public DataEntity() {
	}

	public long getPointNumber() {
		return pointNumber;
	}

	public void setPointNumber(long pointNumber) {
		this.pointNumber = pointNumber;
	}

	public double getHorizontalLength() {
		return horizontalLength;
	}

	public void setHorizontalLength(double horizontalLength) {
		this.horizontalLength = horizontalLength;
	}

	public double getVerticalLength() {
		return verticalLength;
	}

	public void setVerticalLength(double verticalLength) {
		this.verticalLength = verticalLength;
	}
}
