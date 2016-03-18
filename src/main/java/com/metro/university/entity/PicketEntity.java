package com.metro.university.entity;

/**
 * 
 * @author elpai
 *
 */
public class PicketEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Information.
	 */
	private String information;
	/**
	 * Start point.
	 */
	private Integer startPoint;
	/**
	 * Finish point.
	 */
	private Integer finishPoint;
	/**
	 * Start position.
	 */
	private Integer startPosition;
	/**
	 * Finish position.
	 */
	private Integer finishPosition;

	/**
	 * Picket entity.
	 */
	public PicketEntity() {
	}

	/**
	 * Picket entity.
	 * 
	 * @param information
	 *            information
	 * @param startPoint
	 *            start point
	 * @param finishPoint
	 *            finish point
	 * @param startPosition
	 *            start position
	 * @param finishPosition
	 *            finish position
	 */
	public PicketEntity(final String information, final Integer startPoint, final Integer finishPoint,
			final Integer startPosition, final Integer finishPosition) {
		this.information = information;
		this.startPoint = startPoint;
		this.finishPoint = finishPoint;
		this.startPosition = startPosition;
		this.finishPosition = finishPosition;
	}

	/**
	 * Get information.
	 * 
	 * @return String
	 */
	public final String getInformation() {
		return information;
	}

	/**
	 * Set information.
	 * 
	 * @param information
	 *            information
	 */
	public final void setInformation(final String information) {
		this.information = information;
	}

	/**
	 * Get start point.
	 * 
	 * @return Integer
	 */
	public final Integer getStartPoint() {
		return startPoint;
	}

	/**
	 * Set start point.
	 * 
	 * @param startPoint
	 *            start point
	 */
	public final void setStartPoint(final Integer startPoint) {
		this.startPoint = startPoint;
	}

	/**
	 * Get finish point.
	 * 
	 * @return Integer
	 */
	public final Integer getFinishPoint() {
		return finishPoint;
	}

	/**
	 * Set finish point.
	 * 
	 * @param finishPoint
	 *            point
	 */
	public final void setFinishPoint(final Integer finishPoint) {
		this.finishPoint = finishPoint;
	}

	/**
	 * Get start position.
	 * 
	 * @return Integer
	 */
	public Integer getStartPosition() {
		return startPosition;
	}

	/**
	 * Set start position.
	 * 
	 * @param startPosition
	 *            start position
	 */
	public final void setStartPosition(final Integer startPosition) {
		this.startPosition = startPosition;
	}

	/**
	 * Get finish position.
	 * 
	 * @return Integer
	 */
	public final Integer getFinishPosition() {
		return finishPosition;
	}

	/**
	 * Set finish position.
	 * 
	 * @param finishPosition
	 *            finish postion
	 */
	public final void setFinishPosition(final Integer finishPosition) {
		this.finishPosition = finishPosition;
	}

	@Override
	public String toString() {
		return information;
	}
}
