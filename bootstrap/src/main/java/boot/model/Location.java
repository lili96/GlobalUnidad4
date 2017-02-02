package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="locations")
public class Location implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=45)
	private String parent;
	@Column(length=45)
	private String optLocationType;
	@Column(length=45)
	private String name;
	@Column(length=45)
	private String isoCode;
	@Column(length=45)
	private String description;
	
	

	public Location(String parent, String optLocationType, String name, String isoCode, String description) {
		super();
		this.parent = parent;
		this.optLocationType = optLocationType;
		this.name = name;
		this.isoCode = isoCode;
		this.description = description;
	}



	public Location() {
		this("","","","","");
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getParent() {
		return parent;
	}



	public void setParent(String parent) {
		this.parent = parent;
	}



	public String getOptLocationType() {
		return optLocationType;
	}



	public void setOptLocationType(String optLocationType) {
		this.optLocationType = optLocationType;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getIsoCode() {
		return isoCode;
	}



	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Location [id=" + id + ", parent=" + parent + ", optLocationType=" + optLocationType + ", name=" + name
				+ ", isoCode=" + isoCode + ", description=" + description + "]";
	}
	
}