package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="items")
public class Item implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=45)
	private String name;
	@Column(length=45)
	private String unit;
	@Column(length=45)
	private String type;
	@Column(length=45)
	private String barcode;
	@Column(length=45)
	private String maximum;
	@Column(length=45)
	private String minimum;
	public Item(String name, String unit, String type, String barcode, String maximum, String minimum) {
		super();
		this.name = name;
		this.unit = unit;
		this.type = type;
		this.barcode = barcode;
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public Item(){
		this("","","","","","");
	}
	public Item(int id, String name, String unit, String type, String barcode, String maximum, String minimum) {
		super();
		this.id = id;
		this.name = name;
		this.unit = unit;
		this.type = type;
		this.barcode = barcode;
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getMaximum() {
		return maximum;
	}
	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}
	public String getMinimum() {
		return minimum;
	}
	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", unit=" + unit + ", type=" + type + ", barcode=" + barcode
				+ ", maximum=" + maximum + ", minimum=" + minimum + "]";
	}
	
	
}