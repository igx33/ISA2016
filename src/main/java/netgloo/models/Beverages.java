package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "beverages")
public class Beverages {

	@JsonBackReference("restaurant-beverages")
	@ManyToOne
	@JoinColumn(name = "restaurantId", referencedColumnName = "restaurantId", nullable = false)
	private Restaurant restaurantId;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long beveragesId;

	@NotNull
	private String beveragesDescription;

	@NotNull
	private String beveragesName;

	@NotNull
	private Float beveragesPrice;

	public Beverages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Beverages(Restaurant restaurantId, Long beveragesId, String beveragesDescription, String beveragesName,
			Float beveragesPrice) {
		super();
		this.restaurantId = restaurantId;
		this.beveragesId = beveragesId;
		this.beveragesDescription = beveragesDescription;
		this.beveragesName = beveragesName;
		this.beveragesPrice = beveragesPrice;
	}

	public Restaurant getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Restaurant restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Long getBeveragesId() {
		return beveragesId;
	}

	public void setBeveragesId(Long beveragesId) {
		this.beveragesId = beveragesId;
	}

	public String getBeveragesDescription() {
		return beveragesDescription;
	}

	public void setBeveragesDescription(String beveragesDescription) {
		this.beveragesDescription = beveragesDescription;
	}

	public String getBeveragesName() {
		return beveragesName;
	}

	public void setBeveragesName(String beveragesName) {
		this.beveragesName = beveragesName;
	}

	public Float getBeveragesPrice() {
		return beveragesPrice;
	}

	public void setBeveragesPrice(Float beveragesPrice) {
		this.beveragesPrice = beveragesPrice;
	}

}
