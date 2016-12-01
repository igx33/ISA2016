package netgloo.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * An entity User composed by three fields (id, email, name). The Entity
 * annotation indicates that this class is a JPA entity. The Table annotation
 * specifies the name for the table in the db.
 *
 * @author netgloo
 */
@Entity
@Table(name = "user")
public class User {

	// ------------------------
	// PRIVATE FIELDS
	// ------------------------

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long user_id;

	@NotNull
	private String user_email;

	@NotNull
	private String user_password;

	@NotNull
	private String user_name;

	@NotNull
	private String user_surname;

	@NotNull
	private Date user_birth_date;

	@NotNull
	private Date user_registration_date;

	@NotNull
	private String user_role;

	public User(Long user_id, String user_email, String user_password, String user_name, String user_surname,
			Date user_birth_date, Date user_registration_date, String user_role) {
		super();
		this.user_id = user_id;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_name = user_name;
		this.user_surname = user_surname;
		this.user_birth_date = user_birth_date;
		this.user_registration_date = user_registration_date;
		this.user_role = user_role;
	}
	
	public User(Long user_id) {
		super();
		this.user_id = user_id;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_surname() {
		return user_surname;
	}

	public void setUser_surname(String user_surname) {
		this.user_surname = user_surname;
	}

	public Date getUser_birth_date() {
		return user_birth_date;
	}

	public void setUser_birth_date(Date user_birth_date) {
		this.user_birth_date = user_birth_date;
	}

	public Date getUser_registration_date() {
		return user_registration_date;
	}

	public void setUser_registration_date(Date user_registration_date) {
		this.user_registration_date = user_registration_date;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	

	
	/*
	 * 
	 * 
	 * // An autogenerated id (unique for each user in the db)
	 * 
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.AUTO) private long id;
	 * 
	 * // The user's email
	 * 
	 * @NotNull private String email;
	 * 
	 * // The user's name
	 * 
	 * @NotNull private String name;
	 * 
	 * // ------------------------ // PUBLIC METHODS // ------------------------
	 * 
	 * public User() { }
	 * 
	 * public User(long id) { this.id = id; }
	 * 
	 * public User(String email, String name) { this.email = email; this.name =
	 * name; }
	 * 
	 * // Getter and setter methods
	 * 
	 * public long getId() { return id; }
	 * 
	 * public void setId(long value) { this.id = value; }
	 * 
	 * public String getEmail() { return email; }
	 * 
	 * public void setEmail(String value) { this.email = value; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String value) { this.name = value; }
	 */

} // class User
