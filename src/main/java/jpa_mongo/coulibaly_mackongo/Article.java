package jpa_mongo.coulibaly_mackongo;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

/**
 * 
 * @author Fanta Coulibaly & Louise-Agnès MACKONGO
 *
 */

@Entity
public class Article {

	// Déclaration des variables
	@Id
	private ObjectId id;
	private String name;
	private int stars;

	// Getter and setter
	public ObjectId getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return stars
	 */
	public int getStars() {
		return stars;
	}

	/**
	 * 
	 * @param stars
	 */
	public void setStars(int stars) {
		this.stars = stars;
	}
	
	@Override
	public String toString() {
		return "Article [name=" + name + ", stars=" + stars + "]";
	}

}
