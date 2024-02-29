package com.perscholas.sims.service;

import java.util.List;
import java.util.Optional;

import com.perscholas.sims.model.Sale;

public interface SaleService {

	List<Sale> getAllSales();
	Optional<Sale> getSaleById(Long saleId);
	void addNewSale(Sale sale);
	void updateSale(Sale updatedSale);
	void deleteSaleById(Long saleId);
	
}
