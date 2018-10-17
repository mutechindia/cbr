package com.pp.utils;

public class Discount {
	private String userType;
	private Integer start;
	private Integer end;
	private String discountPerc;

	public Discount(String userType, Integer start, Integer end, String discountPerc) {
		this.userType = userType;
		this.start = start;
		this.end = end;
		this.discountPerc = discountPerc;

	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getDiscountPerc() {
		return discountPerc;
	}

	public void setDiscountPerc(String discountPerc) {
		this.discountPerc = discountPerc;
	}

	@Override
	public String toString() {
		return this.userType + " " + this.start + " " + this.end + " " + this.discountPerc;
	}

	@Override
	public int hashCode() {
		return this.userType.hashCode() + this.start.hashCode() + this.end.hashCode() + this.discountPerc.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Discount dis = (Discount) obj;
		if (dis != null)
			return this.userType.equals(dis.userType) && this.start.equals(dis.start) && this.end.equals(dis.end)
					&& this.discountPerc.equals(dis.discountPerc);
		else
			return false;
	}

}
