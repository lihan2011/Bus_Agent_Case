/**
 * 
 */
package hk.edu.cuhk.itm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Lee
 *
 */
@Entity
@Table(name = "PrivateBooking")
@IdClass(SightSeeingCompositeId.class)
public class PrivateBooking implements Serializable {
	@Id
	private String tourCode;
	@Id
	private int  busId;
	private int driverPID;
	private String departLocation;
	private String returnLocation;
	@Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentLocalDate")
	private LocalDate returnDate;
	@Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentLocalTime")
	private LocalTime returnTime;
	
	private String contactPerson;
	
	private int contactTel;

	public String getTourCode() {
		return tourCode;
	}

	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int getDriverPID() {
		return driverPID;
	}

	public void setDriverPID(int driverPID) {
		this.driverPID = driverPID;
	}

	public String getDepartLocation() {
		return departLocation;
	}

	public void setDepartLocation(String departLocation) {
		this.departLocation = departLocation;
	}

	public String getReturnLocation() {
		return returnLocation;
	}

	public void setReturnLocation(String returnLocation) {
		this.returnLocation = returnLocation;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public LocalTime getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(LocalTime returnTime) {
		this.returnTime = returnTime;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public int getContactTel() {
		return contactTel;
	}

	public void setContactTel(int contactTel) {
		this.contactTel = contactTel;
	}

}
