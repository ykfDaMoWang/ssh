package com.web.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ssh.dao.ProductDao;
import com.web.ssh.model.Product;
import com.web.ssh.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	   @Autowired
	    private ProductDao productDao;

	    @Override
	    public void saveProduct(Product product) {
	        productDao.saveProduct(product);
	    }
}
