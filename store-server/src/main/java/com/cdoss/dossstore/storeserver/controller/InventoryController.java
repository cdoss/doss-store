package com.cdoss.dossstore.storeserver.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdoss.dossstore.storeserver.entity.ItemInventory;
import com.cdoss.dossstore.storeserver.persistence.ItemInventoryRepository;

@RestController
public class InventoryController {

	@Autowired
	private ItemInventoryRepository itemInventoryRepository;
	
	@GetMapping("/items/inventory")
	private List<ItemInventory> getWholeInventory() {
		return itemInventoryRepository.findAll();
	}
}
