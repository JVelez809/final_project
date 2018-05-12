/**
 * 
 */
package csci4380.finalp.dogs.mongodb.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import csci4380.finalp.dogs.mongodb.model.Dog;

/**
 * @author User
 *
 */
public interface DogRepository extends JpaRepository<Dog, String> {

	public Optional<List<Dog>> findByPetId(String petId);

	public void deleteByPetId(String petId);
	

	public List<Dog> findNameOrOwnerName(String name, String ownerName);

}
