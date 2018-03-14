package jpa_mongo.coulibaly_mackongo;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import java.net.UnknownHostException;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;

import redis.clients.jedis.Jedis;

public class App {
	public static void main(String[] args) throws UnknownHostException, InterruptedException {
		Morphia morphia = new Morphia();
		MongoClient mongo = new MongoClient();
		morphia.map(Person.class).map(Address.class);
		Datastore ds = morphia.createDatastore(mongo, "my_database");

		String[] noms = { "Louise-Agnès", "Naomia", "Fanta", "Julie", "Charles-Olivier", "Nabé", "Jean-Christian",
				"Neil", "Gregoire", "Bernard" };
		String[] articles = { "Extracteur", "Ordinateur", "Téléphone", "Stylo", "Crayon", "Cahier", "Gomme", "Plats",
				"Tétine", "MP3" };

		for (int i = 0; i < 10; i++) {
			Person p = new Person();
			Article a = new Article();
			p.setName(noms[i]);
			a.setName(articles[i]);
			a.setStars(i);

			Address address = new Address();
			address.setStreet("12" + i + " Some street");
			address.setCity("Some city");
			address.setPostCode("123 456" + i * 10);
			address.setCountry("Some country");
			ds.save(address);
			// set address
			p.setAddress(address);
			// System.out.println(address);
			// Save the POJO
			ds.save(p);
			ds.save(a);
		}

		Query<Person> query = ds.createQuery(Person.class);
		query.filter("name =", "Louise-Agnès");
		query.field("name").equal("Louise-Agnès").field("address.country").equal("Some country");
		query.and(query.criteria("name").equal("Louise-Agnès"),
				query.criteria("address.country").equal("Some country"));

		/*Query<Article> query1 = ds.createQuery(Article.class);
		query.filter("name =", "%");
		query.field("name").equal("%");
		query.and(query.criteria("name").equal("%")); */

		for (Person e : query)
			System.err.println(e);
	}
}
