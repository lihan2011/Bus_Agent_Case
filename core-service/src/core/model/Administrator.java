package core.model;



public class Administrator {
	private String ID;
	private String Name;
	private String Password;
	private String Gender;
	private String Tel;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return Tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		Tel = tel;
	}
	
}
