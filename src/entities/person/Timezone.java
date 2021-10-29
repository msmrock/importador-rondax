
package entities.person;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timezone {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("timezoneOffset")
    @Expose
    private Integer timezoneOffset;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Timezone() {
    }

    /**
     * 
     * @param timezoneOffset
     * @param name
     * @param id
     */
    public Timezone(Integer id, String name, Integer timezoneOffset) {
        super();
        this.id = id;
        this.name = name;
        this.timezoneOffset = timezoneOffset;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timezone withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timezone withName(String name) {
        this.name = name;
        return this;
    }

    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public Timezone withTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
        return this;
    }

}
