/**
 * 
 */
package csci4380.finalp.cats.jpa.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import csci4380.finalp.cats.jpa.model.Cat;

/**
 * 
 * @author Jose Velez
 *
 */
public interface CatRepository extends JpaRepository<Cat, Integer> {


	public Optional<List<Cat>> findByPetId(Integer petId);
	
	
	public List<Cat> findNameOrOwnerName(String name, String ownerName);

}
