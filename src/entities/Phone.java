package entities;

public class Phone {

    private Integer id;
    private Boolean preferential;
    private Integer ddi;
    private String phoneNumber;
    private String extensionLine;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getPreferential() {
        return preferential;
    }

    public void setPreferential(Boolean preferential) {
        this.preferential = preferential;
    }

    public Integer getDdi() {
        return ddi;
    }

    public void setDdi(Integer ddi) {
        this.ddi = ddi;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getExtensionLine() {
        return extensionLine;
    }

    public void setExtensionLine(String extensionLine) {
        this.extensionLine = extensionLine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}