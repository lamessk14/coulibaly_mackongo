package jpa_mongo.coulibaly_mackongo;

import org.mongodb.morphia.annotations.*;

/**
 * 
 * @author Fanta Coulibaly & Louise-Agnès MACKONGO
 *
 */

@Entity
public class Address {
	
	//Déclaration des variables
	@Id
	private int id;
	private String street;
	private String city;
	private String postCode;
	private String country;
	
	//Getter and setter
	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * 
	 * @param street
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * 
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 
	 * @return postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * 
	 * @param postCode
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * 
	 * @return country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * 
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", postCode=" + postCode + ", country=" + country + "]";
	}

}
