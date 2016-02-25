/**
 * 
 */
package hk.edu.cuhk.itm.model;

import java.io.Serializable;

/**
 * @author Lee
 *
 */
public class SightSeeingCompositeId implements Serializable {
	private String tourCode;
	private int  busId;
	/**
	 * @return the tourCode
	 */
	public String getTourCode() {
		return tourCode;
	}
	/**
	 * @param tourCode the tourCode to set
	 */
	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}
	/**
	 * @return the busId
	 */
	public int getBusId() {
		return busId;
	}
	/**
	 * @param busId the busId to set
	 */
	public void setBusId(int busId) {
		this.busId = busId;
	}

}
