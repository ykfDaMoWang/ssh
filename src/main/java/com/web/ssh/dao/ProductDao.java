package com.web.ssh.dao;

import com.web.ssh.model.Product;

/**
 * 商品操作-持久层接口
 *
 */
public interface ProductDao {
    void saveProduct(Product product);
}
