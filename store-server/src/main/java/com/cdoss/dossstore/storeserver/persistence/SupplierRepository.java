package com.cdoss.dossstore.storeserver.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdoss.dossstore.storeserver.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

}
