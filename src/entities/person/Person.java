package entities.person;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Person {

    @SerializedName("totalPages")
    @Expose
    private Integer totalPages;
    @SerializedName("totalElements")
    @Expose
    private Integer totalElements;
    @SerializedName("contents")
    @Expose
    private List<Content> contents = new ArrayList<Content>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Person() {
    }

    /**
     * 
     * @param contents
     * @param totalPages
     * @param totalElements
     */
    public Person(Integer totalPages, Integer totalElements, List<Content> contents) {
        super();
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.contents = contents;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Person withTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Person withTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    public Person withContents(List<Content> contents) {
        this.contents = contents;
        return this;
    }

}
