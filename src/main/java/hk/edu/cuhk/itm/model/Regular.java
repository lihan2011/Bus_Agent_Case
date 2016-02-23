/**
 * 
 */
package hk.edu.cuhk.itm.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * @author Lee
 *
 */
@Entity
@Table(name = "Regular")
@IdClass(RegularCompositeId.class)
public class Regular implements Serializable {
    @Id
    private String tourCode;
	@Id
    private int busId;
    private int driverPID;
    private String departLocation;
    private int noOfParticipants;
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
	/**
	 * @return the driverPID
	 */
	public int getDriverPID() {
		return driverPID;
	}
	/**
	 * @param driverPID the driverPID to set
	 */
	public void setDriverPID(int driverPID) {
		this.driverPID = driverPID;
	}
	/**
	 * @return the departLocation
	 */
	public String getDepartLocation() {
		return departLocation;
	}
	/**
	 * @param departLocation the departLocation to set
	 */
	public void setDepartLocation(String departLocation) {
		this.departLocation = departLocation;
	}
	/**
	 * @return the noOfParticipants
	 */
	public int getNoOfParticipants() {
		return noOfParticipants;
	}
	/**
	 * @param noOfParticipants the noOfParticipants to set
	 */
	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

}
