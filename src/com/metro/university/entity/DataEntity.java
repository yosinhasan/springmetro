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
	/**
	 * Point number.
	 */
	private Long pointNumber;
	/**
	 * Horizontal length.
	 */
	private Double horizontalLength;
	/**
	 * Vertical length.
	 */
	private Double verticalLength;

	/**
	 * Data Entity.
	 */
	public DataEntity() {
	}

	/**
	 * Get point number.
	 * 
	 * @return Long
	 */
	public final Long getPointNumber() {
		return pointNumber;
	}

	/**
	 * Set point number.
	 * 
	 * @param pointNumber
	 *            point number
	 */
	public final void setPointNumber(final Long pointNumber) {
		this.pointNumber = pointNumber;
	}

	/**
	 * Get horizontal length.
	 * 
	 * @return Double
	 */
	public final Double getHorizontalLength() {
		return horizontalLength;
	}

	/**
	 * Set horizontal length.
	 * 
	 * @param horizontalLength
	 *            horizontal length
	 */
	public final void setHorizontalLength(final Double horizontalLength) {
		this.horizontalLength = horizontalLength;
	}

	/**
	 * Get vertical length.
	 * 
	 * @return Double
	 */
	public final Double getVerticalLength() {
		return verticalLength;
	}

	/**
	 * Set vertical length.
	 * 
	 * @param verticalLength
	 *            length
	 */
	public final void setVerticalLength(final Double verticalLength) {
		this.verticalLength = verticalLength;
	}

	@Override
	public String toString() {
		return "\nh = " + horizontalLength + " v = " + verticalLength;
	}
}
