package entities;

public class Location {

    private Integer id;
    private Integer parent;
    private String name;
    private String status;
    private String discriminator;
    private String acessDate;

    public Location() {
	}

	public Location(Integer id, Integer parent, String name, String status, String discriminator, String acessDate) {
		super();
		this.id = id;
		this.parent = parent;
		this.name = name;
		this.status = status;
		this.discriminator = discriminator;
		this.acessDate = acessDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDiscriminator() {
		return discriminator;
	}

	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	public String getAcessDate() {
		return acessDate;
	}

	public void setAcessDate(String acessDate) {
		this.acessDate = acessDate;
	}


}


