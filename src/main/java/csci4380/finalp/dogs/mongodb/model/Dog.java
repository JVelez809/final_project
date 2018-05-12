/**
 * 
 */
package csci4380.finalp.dogs.mongodb.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author User
 *
 */
@Document(collection="Dogs")
public class Dog {
	@Id
	private String petId;
	private String name;
	private String type;
	private String ownerName;
	private String address;
	private Integer age;
	private Boolean isSpayed;
	private String birthdate;

	public Dog() {}

	public Dog(String name, String type, String ownerName, String address, Integer age, Boolean isSpayed,
			String birthdate) {
		super();
		this.name = name;
		this.type = type;
		this.ownerName = ownerName;
		this.address = address;
		this.age = age;
		this.isSpayed = isSpayed;
		this.birthdate = birthdate;
	}

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getIsSpayed() {
		return isSpayed;
	}

	public void setIsSpayed(Boolean isSpayed) {
		this.isSpayed = isSpayed;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Dog [petId=" + petId + ", name=" + name + ", type=" + type + ", ownerName=" + ownerName + ", address="
				+ address + ", age=" + age + ", isSpayed=" + isSpayed + ", birthdate=" + birthdate + "]";
	}
	
}
