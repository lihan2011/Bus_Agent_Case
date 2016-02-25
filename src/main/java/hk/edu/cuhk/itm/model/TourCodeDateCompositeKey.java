/**
 * 
 */
package hk.edu.cuhk.itm.model;

import org.hibernate.annotations.Type;
import java.io.Serializable;
import java.time.LocalDate;
/**
 * @author Lee
 *
 */
public class TourCodeDateCompositeKey implements Serializable{
	private String tourCode;
	@Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentLocalDate")
	private LocalDate returnDate;
	public String getTourCode() {
		return tourCode;
	}
	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

}
