/**
 * 
 */
package hk.edu.cuhk.itm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Lee
 *
 */
@Entity
@Table(name = "Regular")
public class Regular implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Tourcode;
    private int busId;
    private int diverPId;
    private String departLocation;
    private int noOfParticipants;
	/**
	 * @return the tourcode
	 */
	public String getTourcode() {
		return Tourcode;
	}
	/**
	 * @param tourcode the tourcode to set
	 */
	public void setTourcode(String tourcode) {
		Tourcode = tourcode;
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
	 * @return the diverPId
	 */
	public int getDiverPId() {
		return diverPId;
	}
	/**
	 * @param diverPId the diverPId to set
	 */
	public void setDiverPId(int diverPId) {
		this.diverPId = diverPId;
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
