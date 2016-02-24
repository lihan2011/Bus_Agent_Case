/**
 * 
 */
package hk.edu.cuhk.itm.model;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import java.time.*;
import java.time.LocalTime;
/**
 * @author Lee
 *
 */

@Entity
@Table(name = "TourListing")
public class TourListing implements Serializable{
	
	@Id
	private String tourCode;
	private String destination;
	private String description;
	@Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentLocalDate")
	private LocalDate departDate;
	
	@Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentLocalTime")
	private LocalTime departTime;
	private String tourDuration;
	
	public String getTourCode() {
		return tourCode;
	}
	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDepartDate() {
		return departDate;
	}
	public void setDepartDate(LocalDate departDate) {
		this.departDate = departDate;
	}
	public LocalTime getDepartTime() {
		return departTime;
	}
	public void setDepartTime(LocalTime departTime) {
		this.departTime = departTime;
	}
	public String getTourDuration() {
		return tourDuration;
	}
	public void setTourDuration(String tourDuration) {
		this.tourDuration = tourDuration;
	}
	
}
