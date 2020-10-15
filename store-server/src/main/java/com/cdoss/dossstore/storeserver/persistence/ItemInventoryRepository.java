package com.cdoss.dossstore.storeserver.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdoss.dossstore.storeserver.entity.ItemInventory;

@Repository
public interface ItemInventoryRepository extends JpaRepository<ItemInventory, Integer>{

}
