package com.cdoss.dossstore.storeserver.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdoss.dossstore.storeserver.entity.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer>{

}