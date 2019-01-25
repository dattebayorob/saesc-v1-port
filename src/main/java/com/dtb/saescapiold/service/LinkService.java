package com.dtb.saescapiold.service;

import java.util.List;

import com.dtb.saescapiold.model.entities.Link;

public interface LinkService {
	public List<Link> buscarTodos();
	public Link adicionar(Link link);
}
