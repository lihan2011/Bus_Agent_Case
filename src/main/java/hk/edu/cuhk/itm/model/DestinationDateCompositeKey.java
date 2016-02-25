/**
 * 
 */
package hk.edu.cuhk.itm.model;
import java.io.Serializable;
import java.time.LocalDate;

import org.hibernate.annotations.Type;

/**
 * @author Lee
 *
 */
public class DestinationDateCompositeKey implements Serializable{
	private String destination;
	
	@Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentLocalDate")
	private LocalDate departDate;
	

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getDepartDate() {
		return departDate;
	}

	public void setDepartDate(LocalDate departDate) {
		departDate = departDate;
	}

	
}
