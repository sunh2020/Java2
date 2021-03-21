package com.sunh.lookify.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="songs")
public class Lookify {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@NotNull
    @Size(min = 5, max = 20)
    private String name;
	@NotNull
    @Size(min = 5, max = 20)
	private String title;
	@NotNull
	@Size(min = 1, max = 10)
    private String rating;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public Lookify(Long id, @NotNull @Size(min = 5, max = 20) String name,
			@NotNull @Size(min = 5, max = 20) String title, @NotNull @Size(min = 1, max = 10) String rating) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.rating = rating;
	}
    
}
