package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="restaurantManager")
public class RestaurantManager {
	
	@Id
	private String restaurantManagerNickId;
	
	@NotNull
	private String restaurantManagerMail;
	
	@NotNull
	private String restaurantManagerName;
	
	@NotNull
	private String restaurantManagerSurname;
	
	@NotNull 
	private String restaurantManagerPassword;
	
	@JsonBackReference("restaurant-restaurantManager")
	@ManyToOne
	@JoinColumn(name="restaurantId", referencedColumnName="restaurantId", nullable=false)
	private Restaurant restaurantId;

	public RestaurantManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaurantManager(String restaurantManagerNickId, String restaurantManagerMail, String restaurantManagerName,
			String restaurantManagerSurname, String restaurantManagerPassword, Restaurant restaurantId) {
		super();
		this.restaurantManagerNickId = restaurantManagerNickId;
		this.restaurantManagerMail = restaurantManagerMail;
		this.restaurantManagerName = restaurantManagerName;
		this.restaurantManagerSurname = restaurantManagerSurname;
		this.restaurantManagerPassword = restaurantManagerPassword;
		this.restaurantId = restaurantId;
	}

	public String getRestaurantManagerNickId() {
		return restaurantManagerNickId;
	}

	public void setRestaurantManagerNickId(String restaurantManagerNickId) {
		this.restaurantManagerNickId = restaurantManagerNickId;
	}

	public String getRestaurantManagerMail() {
		return restaurantManagerMail;
	}

	public void setRestaurantManagerMail(String restaurantManagerMail) {
		this.restaurantManagerMail = restaurantManagerMail;
	}

	public String getRestaurantManagerName() {
		return restaurantManagerName;
	}

	public void setRestaurantManagerName(String restaurantManagerName) {
		this.restaurantManagerName = restaurantManagerName;
	}

	public String getRestaurantManagerSurname() {
		return restaurantManagerSurname;
	}

	public void setRestaurantManagerSurname(String restaurantManagerSurname) {
		this.restaurantManagerSurname = restaurantManagerSurname;
	}

	public String getRestaurantManagerPassword() {
		return restaurantManagerPassword;
	}

	public void setRestaurantManagerPassword(String restaurantManagerPassword) {
		this.restaurantManagerPassword = restaurantManagerPassword;
	}

	public Restaurant getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Restaurant restaurantId) {
		this.restaurantId = restaurantId;
	}

	
	
	
}