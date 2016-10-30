package org.blade.admin.entity.biz;

import org.blade.admin.entity.base.BaseEntity;

/**
 * 
 * @author blade
 *
 */
public class ItemSize extends BaseEntity<String> {

	/**
	 * length;
	 */
	private double l;
	
	/**
	 * 
	 */
	private double w;
	
	private double h;
	
	private double r;
	
	private String unit;

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
}
