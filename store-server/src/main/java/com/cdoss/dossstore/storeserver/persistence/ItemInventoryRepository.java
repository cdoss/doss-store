package com.cdoss.dossstore.storeserver.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdoss.dossstore.storeserver.entity.ItemInventory;

@Repository
public interface ItemInventoryRepository extends CrudRepository<ItemInventory, Integer>{

}
