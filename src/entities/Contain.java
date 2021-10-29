package entities;

import java.util.ArrayList;
import java.util.List;

public class Contain {

    private Integer totalPages;
    private Integer totalElements;
    private List<Location> contents = new ArrayList<Location>();

    public Contain(Integer totalPages, Integer totalElements, List<Location> contents) {
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
	public Integer getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}
	public List<Location> getContents() {
		return contents;
	}
	public void setContents(List<Location> contents) {
		this.contents = contents;
	}
    
}