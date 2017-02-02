package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="person_physicals")
public class PersonPhysical implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=45)
	private String optBloodType;
	@Column(length=45)
	private String height;
	@Column(length=45)
	private String weight;
	@Column(length=45)
	private String optEyeColor;
	@Column(length=45)
	private String optSkinColor;
	@Column(length=45)
	private String optHairColor;
	@Column(length=45)
	private String injuries;
	@Column(length=45)
	private String comments;
	public PersonPhysical( String optBloodType, String height, String weight, String optEyeColor,
			String optSkinColor, String optHairColor, String injuries, String comments) {
		super();
		this.optBloodType = optBloodType;
		this.height = height;
		this.weight = weight;
		this.optEyeColor = optEyeColor;
		this.optSkinColor = optSkinColor;
		this.optHairColor = optHairColor;
		this.injuries = injuries;
		this.comments = comments;
	}
	public PersonPhysical() {
		this("","","","","","","","");
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOptBloodType() {
		return optBloodType;
	}
	public void setOptBloodType(String optBloodType) {
		this.optBloodType = optBloodType;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getOptEyeColor() {
		return optEyeColor;
	}
	public void setOptEyeColor(String optEyeColor) {
		this.optEyeColor = optEyeColor;
	}
	public String getOptSkinColor() {
		return optSkinColor;
	}
	public void setOptSkinColor(String optSkinColor) {
		this.optSkinColor = optSkinColor;
	}
	public String getOptHairColor() {
		return optHairColor;
	}
	public void setOptHairColor(String optHairColor) {
		this.optHairColor = optHairColor;
	}
	public String getInjuries() {
		return injuries;
	}
	public void setInjuries(String injuries) {
		this.injuries = injuries;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "PersonPhysical [id=" + id + ", optBloodType=" + optBloodType + ", height=" + height + ", weight="
				+ weight + ", optEyeColor=" + optEyeColor + ", optSkinColor=" + optSkinColor + ", optHairColor="
				+ optHairColor + ", injuries=" + injuries + ", comments=" + comments + "]";
	}
	
	
	
	
	
	

}
