package jpa_mongo.coulibaly_mackongo;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

/**
 * 
 * @author Fanta Coulibaly & Louise-Agnès MACKONGO
 *
 */

@Entity
public class Person {
	
	//Déclaration des variables
	@Id
	private ObjectId id;
	private String name;
	private Address address;
	
	//Getter and setter
			/**
			 * 
			 * @return id
			 */
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
			 * @return address
			 */
			public Address getAddress() {
				return address;
			}
			/**
			 * 
			 * @param address
			 */
			public void setAddress(Address address) {
				this.address = address;
			}
			
			@Override
			public String toString() {
				return "Person [name=" + name + ", address=" + address.toString() + "]";
			}

}
