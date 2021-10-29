package entities;

import java.util.ArrayList;
import java.util.List;

public class Contain {

	private Integer totalPages;
	private Integer totalElements;
	private List<Person> contents = new ArrayList<Person>();
	
	public Contain() {
	}



	public Contain(Integer totalPages, Integer totalElements, List<Person> contents) {
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

	public Integer getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}

	public List<Person> getPersons() {
		return contents;
	}

	public void setPersons(List<Person> persons) {
		this.contents = persons;
	}

}