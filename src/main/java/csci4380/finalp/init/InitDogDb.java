/**
 * 
 */
package csci4380.finalp.init;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;

import csci4380.finalp.dogs.mongodb.model.Dog;
import csci4380.finalp.dogs.mongodb.repo.DogRepository;


/**
 * @author User
 *
 */
public class InitDogDb implements CommandLineRunner {
	
	private DogRepository dogRepository;
	
	public InitDogDb(DogRepository dogRepository) {
		this.dogRepository = dogRepository;
	}

	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		Dog t1 = new Dog("Snow", "Siberian Husky", "Jose","63 Columbia Dr, North Brunswick NJ, 08902", 3, false, "03/21/2015");
		Dog t2 = new Dog("Lady", "Pitbull", "Mike","New York, New York", 1, true, "09/21/2016");
		Dog t3 = new Dog("Black", "Boxer", "Tyler","1 Medow Blvd, North Brunswick NJ, 08902", 8, false, "07/21/2009");
		Dog t4 = new Dog("Wanda", "Yorkie", "Marlaina","69 Hickory St, Beverly Hills, California, 90210", 2, false, "02/14/2016");
		
		// add our teachers to DB
		List<Dog> dogs = Arrays.asList(t1,t2,t3,t4);
		dogRepository.saveAll(dogs);

	}

}
