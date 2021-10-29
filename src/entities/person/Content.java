package entities.person;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("registerDate")
    @Expose
    private String registerDate;
    @SerializedName("lastModificationDate")
    @Expose
    private String lastModificationDate;
    @SerializedName("situation")
    @Expose
    private String situation;
    @SerializedName("registry")
    @Expose
    private String registry;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("federalState")
    @Expose
    private String federalState;
    @SerializedName("zipCode")
    @Expose
    private String zipCode;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("lastAccessDate")
    @Expose
    private String lastAccessDate;
    @SerializedName("currentPhysicalLocation")
    @Expose
    private CurrentPhysicalLocation currentPhysicalLocation;
    @SerializedName("lastAccessAllowedDate")
    @Expose
    private String lastAccessAllowedDate;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Content() {
    }

    /**
     * 
     * @param registry
     * @param zipCode
     * @param address
     * @param gender
     * @param city
     * @param lastAccessAllowedDate
     * @param currentPhysicalLocation
     * @param lastModificationDate
     * @param nationality
     * @param lastAccessDate
     * @param district
     * @param name
     * @param id
     * @param federalState
     * @param situation
     * @param registerDate
     */
    public Content(Integer id, String name, String gender, String registerDate, String lastModificationDate, String situation, String registry, String address, String district, String city, String federalState, String zipCode, String nationality, String lastAccessDate, CurrentPhysicalLocation currentPhysicalLocation, String lastAccessAllowedDate) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.registerDate = registerDate;
        this.lastModificationDate = lastModificationDate;
        this.situation = situation;
        this.registry = registry;
        this.address = address;
        this.district = district;
        this.city = city;
        this.federalState = federalState;
        this.zipCode = zipCode;
        this.nationality = nationality;
        this.lastAccessDate = lastAccessDate;
        this.currentPhysicalLocation = currentPhysicalLocation;
        this.lastAccessAllowedDate = lastAccessAllowedDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Content withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Content withName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Content withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public Content withRegisterDate(String registerDate) {
        this.registerDate = registerDate;
        return this;
    }

    public String getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(String lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public Content withLastModificationDate(String lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
        return this;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public Content withSituation(String situation) {
        this.situation = situation;
        return this;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public Content withRegistry(String registry) {
        this.registry = registry;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Content withAddress(String address) {
        this.address = address;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Content withDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Content withCity(String city) {
        this.city = city;
        return this;
    }

    public String getFederalState() {
        return federalState;
    }

    public void setFederalState(String federalState) {
        this.federalState = federalState;
    }

    public Content withFederalState(String federalState) {
        this.federalState = federalState;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Content withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Content withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public String getLastAccessDate() {
        return lastAccessDate;
    }

    public void setLastAccessDate(String lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
    }

    public Content withLastAccessDate(String lastAccessDate) {
        this.lastAccessDate = lastAccessDate;
        return this;
    }

    public CurrentPhysicalLocation getCurrentPhysicalLocation() {
        return currentPhysicalLocation;
    }

    public void setCurrentPhysicalLocation(CurrentPhysicalLocation currentPhysicalLocation) {
        this.currentPhysicalLocation = currentPhysicalLocation;
    }

    public Content withCurrentPhysicalLocation(CurrentPhysicalLocation currentPhysicalLocation) {
        this.currentPhysicalLocation = currentPhysicalLocation;
        return this;
    }

    public String getLastAccessAllowedDate() {
        return lastAccessAllowedDate;
    }

    public void setLastAccessAllowedDate(String lastAccessAllowedDate) {
        this.lastAccessAllowedDate = lastAccessAllowedDate;
    }

    public Content withLastAccessAllowedDate(String lastAccessAllowedDate) {
        this.lastAccessAllowedDate = lastAccessAllowedDate;
        return this;
    }

}
