package com.cdoss.dossstore.storeserver.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdoss.dossstore.storeserver.entity.SupplyOrder;


@Repository
public interface SupplyOrderRepository extends JpaRepository<SupplyOrder, Integer>{

}
