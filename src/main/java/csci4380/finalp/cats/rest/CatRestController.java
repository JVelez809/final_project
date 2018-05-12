/**
 * 
 */
package csci4380.finalp.cats.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import csci4380.finalp.cats.jpa.model.Cat;
import csci4380.finalp.cats.jpa.repo.CatRepository;

/**
 * @author User
 *
 */
@RestController
@RequestMapping("rest/v1/cats")
public class CatRestController {
	@Autowired CatRepository catRepository;
	
	@RequestMapping(value="/echoMessage", method=RequestMethod.GET)
	@GetMapping("/echoMessage")		
	/**
	 * http://localhost:8888/rest/v1/students/echoMessage?msg=Hi
	 */
	public String echoMessage(@RequestParam(value="msg", defaultValue="Hello Jose") String message) {
		return "echoMessage echoed: " + message;
	}
	
	@GetMapping("")
	public Page<Cat>findAll(@RequestParam(defaultValue="0") int page, @RequestParam(value="rowsPerPage", defaultValue="3") int size) {
		Page<Cat> catsPage = catRepository.findAll(new PageRequest(page, size));
		return catsPage;
	}
	
	@GetMapping("/all")
	public  List<Cat> findAll() {
		List<Cat> cats = catRepository.findAll();
		return cats;
	}
	
	@PostMapping("")
	public  Optional<Cat> save(@RequestBody final Cat cat) {
		Cat savedCat = catRepository.save(cat);
		return catRepository.findById(savedCat.getPetId());
	}
	
	@PutMapping("")
	public  Cat insert(@RequestBody final Cat cat) {
		Cat insertedCat = catRepository.save(cat);
		return insertedCat;
	}
	
	@GetMapping("/{petId}")
	public  Optional<List<Cat>> findByPetId(@PathVariable Integer petId) {
		Optional<List<Cat>> cats = catRepository.findByPetId(petId);
		return cats;
	}
	
	@DeleteMapping("/{petId}")
	public  void delete(@PathVariable("petId") Integer petId) {
		catRepository.deleteById(petId);
	}
	
	@GetMapping("/{name}/{ownerName}")
	public  List<Cat> findNameOrOwnerName(@PathVariable String name, @PathVariable String ownerName) {
		List<Cat> cats = catRepository.findNameOrOwnerName(name, ownerName);
		return cats;
	}

}
