package com.example.restservice.service;

import com.example.restservice.model.Product;
import com.example.restservice.repository.ProductRepository;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final Map<String, List<Product>> productsByUsernameCache;

    public ProductService(ProductRepository productRepository,
                          Map<String, List<Product>> productsByUsernameCache) {
        this.productRepository = productRepository;
        this.productsByUsernameCache = productsByUsernameCache;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> updateProduct(Long id, Product productDetails) {
        return productRepository.findById(id).map(product -> {
            product.setName(productDetails.getName());
            product.setPrice(productDetails.getPrice());
            product.setCategory(productDetails.getCategory());
            return productRepository.save(product);
        });
    }

    public boolean deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Product> findProductsByUsername(String username) {
        // Проверяем кэш
        if (productsByUsernameCache.containsKey(username)) {
            return productsByUsernameCache.get(username);
        }

        // Если нет в кэше — достаем из БД и сохраняем в кэш
        List<Product> products = productRepository.findProductsByUsername(username);
        productsByUsernameCache.put(username, products);
        return products;
    }
}
