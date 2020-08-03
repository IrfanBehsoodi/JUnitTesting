package com.mainclass.junit.business;

import java.util.List;

import com.mainclass.junit.business.exception.DifferentCurrenciesException;
import com.mainclass.junit.model.Amount;
import com.mainclass.junit.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}