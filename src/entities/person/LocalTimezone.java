
package entities.person;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocalTimezone {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("timezone")
    @Expose
    private Timezone timezone;
    @SerializedName("daylightSaving")
    @Expose
    private Boolean daylightSaving;
    @SerializedName("offsetDaylightSaving")
    @Expose
    private String offsetDaylightSaving;
    @SerializedName("_discriminator")
    @Expose
    private String discriminator;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LocalTimezone() {
    }

    /**
     * 
     * @param daylightSaving
     * @param timezone
     * @param name
     * @param offsetDaylightSaving
     * @param id
     * @param discriminator
     */
    public LocalTimezone(Integer id, String name, Timezone timezone, Boolean daylightSaving, String offsetDaylightSaving, String discriminator) {
        super();
        this.id = id;
        this.name = name;
        this.timezone = timezone;
        this.daylightSaving = daylightSaving;
        this.offsetDaylightSaving = offsetDaylightSaving;
        this.discriminator = discriminator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalTimezone withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTimezone withName(String name) {
        this.name = name;
        return this;
    }

    public Timezone getTimezone() {
        return timezone;
    }

    public void setTimezone(Timezone timezone) {
        this.timezone = timezone;
    }

    public LocalTimezone withTimezone(Timezone timezone) {
        this.timezone = timezone;
        return this;
    }

    public Boolean getDaylightSaving() {
        return daylightSaving;
    }

    public void setDaylightSaving(Boolean daylightSaving) {
        this.daylightSaving = daylightSaving;
    }

    public LocalTimezone withDaylightSaving(Boolean daylightSaving) {
        this.daylightSaving = daylightSaving;
        return this;
    }

    public String getOffsetDaylightSaving() {
        return offsetDaylightSaving;
    }

    public void setOffsetDaylightSaving(String offsetDaylightSaving) {
        this.offsetDaylightSaving = offsetDaylightSaving;
    }

    public LocalTimezone withOffsetDaylightSaving(String offsetDaylightSaving) {
        this.offsetDaylightSaving = offsetDaylightSaving;
        return this;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public LocalTimezone withDiscriminator(String discriminator) {
        this.discriminator = discriminator;
        return this;
    }

}
