package com.cdoss.dossstore.storeserver.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdoss.dossstore.storeserver.entity.SupplierItemPricing;

@Repository
public interface SupplierItemPricingRepository extends CrudRepository<SupplierItemPricing, Integer>{

}
