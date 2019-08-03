package com.galleryService.model;

import java.util.List;

public class Gallery {

	private long id;
	private List<Object> images;

	public Gallery() {
	}

	public Gallery(int galleryId) {
		this.id = galleryId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Object> getImages() {
		return images;
	}

	public void setImages(List<Object> images) {
		this.images = images;
	}
}
