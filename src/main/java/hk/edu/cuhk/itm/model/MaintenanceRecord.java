package hk.edu.cuhk.itm.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "MaintenanceRecord")
public class MaintenanceRecord implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maintenanceId;
    private int busId;
    @Type(type = "org.jadira.usertype.dateandtime.threeten.PersistentLocalDate")
    private LocalDate checkUpDate;
    private String maintenanceCo;
    private String maintenanceContact;
    private String maintenanceAddress;
    private int maintenanceTel;
    private String workDone;

    public int getMaintenanceId() {
        return maintenanceId;
    }

    public void setMaintenanceId(int maintenanceId) {
        this.maintenanceId = maintenanceId;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public LocalDate getCheckUpDate() {
        return checkUpDate;
    }

    public void setCheckUpDate(LocalDate checkUpDate) {
        this.checkUpDate = checkUpDate;
    }

    public String getMaintenanceCo() {
        return maintenanceCo;
    }

    public void setMaintenanceCo(String maintenanceCo) {
        this.maintenanceCo = maintenanceCo;
    }

    public String getMaintenanceContact() {
        return maintenanceContact;
    }

    public void setMaintenanceContact(String maintenanceContact) {
        this.maintenanceContact = maintenanceContact;
    }

    public String getMaintenanceAddress() {
        return maintenanceAddress;
    }

    public void setMaintenanceAddress(String maintenanceAddress) {
        this.maintenanceAddress = maintenanceAddress;
    }

    public int getMaintenanceTel() {
        return maintenanceTel;
    }

    public void setMaintenanceTel(int maintenanceTel) {
        this.maintenanceTel = maintenanceTel;
    }

    public String getWorkDone() {
        return workDone;
    }

    public void setWorkDone(String workDone) {
        this.workDone = workDone;
    }
}
