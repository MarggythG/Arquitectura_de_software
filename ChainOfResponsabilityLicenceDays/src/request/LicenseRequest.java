/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package request;

/**
 *
 * @author mjoha
 */
public class LicenseRequest {
	private double days;
	private String purpose;

	public LicenseRequest(double days, String purpose) {
		this.days = days;
		this.purpose = purpose;
	}

	public double getDays() {
		return days;
	}

	public void setDays(double day) {
		days = day;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String reason) {
		purpose = reason;
	}
}
