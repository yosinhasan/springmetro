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
	private String information;
	private int startPoint;
	private int finishPoint;
	private int startPosition;
	private int finishPosition;

	public PicketEntity() {
	}

	public PicketEntity(String information, int startPoint, int finishPoint, int startPosition, int finishPosition) {
		this.information = information;
		this.startPoint = startPoint;
		this.finishPoint = finishPoint;
		this.startPosition = startPosition;
		this.finishPosition = finishPosition;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public int getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}

	public int getFinishPoint() {
		return finishPoint;
	}

	public void setFinishPoint(int finishPoint) {
		this.finishPoint = finishPoint;
	}

	public int getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}

	public int getFinishPosition() {
		return finishPosition;
	}

	public void setFinishPosition(int finishPosition) {
		this.finishPosition = finishPosition;
	}

	@Override
	public String toString() {
		return information;
	}
}
