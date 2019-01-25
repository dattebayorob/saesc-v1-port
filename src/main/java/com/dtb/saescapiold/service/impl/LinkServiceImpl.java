package com.dtb.saescapiold.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtb.saescapiold.model.entities.Link;
import com.dtb.saescapiold.model.repositories.LinkRepository;
import com.dtb.saescapiold.service.LinkService;

@Service
public class LinkServiceImpl implements LinkService{
	@Autowired
	private LinkRepository repository;
	@Override
	public List<Link> buscarTodos() {
		return repository.findAll();
	}

	@Override
	public Link adicionar(Link link) {
		return repository.save(link);
	}

}
