package entities;

import java.util.List;

public class Person {

	private Integer id;
	private String name;
	private List<Document> documents = null;
	private List<Email> emails = null;
	private List<Phone> phones = null;
	private Integer gender;
	private String birthday;
	private String registry;
	private String registerDate;
	private String lastModificationDate;
	private String address;
	private String district;
	private String city;
	private String uf;
	private String cep;
	private String nationality;
	private String lastAccessDate;
	private Integer situation;
	private Boolean hasValidRole;
	private Boolean hasProvisoryRole;
	private CurrentPhysicalLocation currentPhysicalLocation;
	private String lastFeedbackPollDate;
	private String lastIndexPhoto;

	public Person() {
	}





	public Person(Integer id, String name, List<Document> documents, List<Email> emails, List<Phone> phones,
			Integer gender, String birthday, String registry, String registerDate, String lastModificationDate,
			String address, String district, String city, String uf, String cep, String nationality,
			String lastAccessDate, Integer situation, Boolean hasValidRole, Boolean hasProvisoryRole,
			CurrentPhysicalLocation currentPhysicalLocation, String lastFeedbackPollDate, String lastIndexPhoto) {
		super();
		this.id = id;
		this.name = name;
		this.documents = documents;
		this.emails = emails;
		this.phones = phones;
		this.gender = gender;
		this.birthday = birthday;
		this.registry = registry;
		this.registerDate = registerDate;
		this.lastModificationDate = lastModificationDate;
		this.address = address;
		this.district = district;
		this.city = city;
		this.uf = uf;
		this.cep = cep;
		this.nationality = nationality;
		this.lastAccessDate = lastAccessDate;
		this.situation = situation;
		this.hasValidRole = hasValidRole;
		this.hasProvisoryRole = hasProvisoryRole;
		this.currentPhysicalLocation = currentPhysicalLocation;
		this.lastFeedbackPollDate = lastFeedbackPollDate;
		this.lastIndexPhoto = lastIndexPhoto;
	}





	@Override
	public String toString() {
		return "contents [id=" + id + ", name=" + name + ", documents=" + documents + ", emails=" + emails + ", phones="
				+ phones + ", gender=" + gender + ", birthday=" + birthday + ", registry=" + registry
				+ ", registerDate=" + registerDate + ", lastModificationDate=" + lastModificationDate + ", address="
				+ address + ", district=" + district + ", city=" + city + ", uf=" + uf + ", cep=" + cep
				+ ", nationality=" + nationality + ", lastAccessDate=" + lastAccessDate + ", situation=" + situation
				+ ", hasValidRole=" + hasValidRole + ", hasProvisoryRole=" + hasProvisoryRole
				+ ", currentPhysicalLocation=" + currentPhysicalLocation + ", lastFeedbackPollDate="
				+ lastFeedbackPollDate + ", lastIndexPhoto=" + lastIndexPhoto + "]";
	}





	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getRegistry() {
		return registry;
	}

	public void setRegistry(String registry) {
		this.registry = registry;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(String lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getLastAccessDate() {
		return lastAccessDate;
	}

	public void setLastAccessDate(String lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}

	public Integer getSituation() {
		return situation;
	}

	public void setSituation(Integer situation) {
		this.situation = situation;
	}

	public Boolean getHasValidRole() {
		return hasValidRole;
	}

	public void setHasValidRole(Boolean hasValidRole) {
		this.hasValidRole = hasValidRole;
	}

	public Boolean getHasProvisoryRole() {
		return hasProvisoryRole;
	}

	public void setHasProvisoryRole(Boolean hasProvisoryRole) {
		this.hasProvisoryRole = hasProvisoryRole;
	}

	public CurrentPhysicalLocation getCurrentPhysicalLocation() {
		return currentPhysicalLocation;
	}

	public void setCurrentPhysicalLocation(CurrentPhysicalLocation currentPhysicalLocation) {
		this.currentPhysicalLocation = currentPhysicalLocation;
	}

	public String getLastFeedbackPollDate() {
		return lastFeedbackPollDate;
	}

	public void setLastFeedbackPollDate(String lastFeedbackPollDate) {
		this.lastFeedbackPollDate = lastFeedbackPollDate;
	}

	public String getLastIndexPhoto() {
		return lastIndexPhoto;
	}

	public void setLastIndexPhoto(String lastIndexPhoto) {
		this.lastIndexPhoto = lastIndexPhoto;
	}
	
}