/**
 * 
 */
package csci4380.finalp.init;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;

import csci4380.finalp.cats.jpa.model.Cat;
import csci4380.finalp.cats.jpa.repo.CatRepository;


/**
 * @author User
 *
 */
public class InitCatDb implements CommandLineRunner {
	
	private CatRepository catRepository;
	
	public InitCatDb(CatRepository catRepository) {
		this.catRepository = catRepository;
	}

	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		Cat t1 = new Cat(1, "Snuffles", "Siberian", "Jason","63 Norflix Rd, Ontario, Canada", 2, false, "04/30/2016");
		Cat t2 = new Cat(2, "Simba", "Lion Cub", "Mike","Pride Rock, Pride Lands, Africa", 1, true, "1/12/2017");
		Cat t3 = new Cat(3, "Black", "Panther", "T-Chella","1 Unoko St, Wakanda, Africa", 8, false, "06/26/2009");
		Cat t4 = new Cat(4, "Bell", "Short Hair", "Mary","69 Pride Rd, Beverly Hills, California, 90210", 2, false, "03/15/2016");
		
		// add our to DB
		List<Cat> cats = Arrays.asList(t1,t2,t3,t4);
		catRepository.saveAll(cats);

	}

}
