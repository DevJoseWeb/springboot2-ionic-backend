package com.simplus.gestao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplus.gestao.domain.Product;
import com.simplus.gestao.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> findByCompany(Integer companyId) {
        return repo.findProducts(companyId);
    }

    public List<Product> findAll() {
        return repo.findAllByOrderByName();
    }
}
