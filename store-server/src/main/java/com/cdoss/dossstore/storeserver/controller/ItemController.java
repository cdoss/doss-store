package com.cdoss.dossstore.storeserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdoss.dossstore.storeserver.entity.Item;
import com.cdoss.dossstore.storeserver.persistence.ItemRepository;

@RestController
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping("/items")
	private List<Item> getAllItems(){
		return itemRepository.findAll();
	}
}
