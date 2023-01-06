package com.fdm.webapp.storeinventoryRespository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdm.webapp.storeinventory.StoreInventory;

public interface StoreInventoryRespository extends JpaRepository<StoreInventory, Long> {

	List<StoreInventory> findByName(String Name);

	StoreInventory findByStock(int stockID);

}
