package org.sebastiandev.springsecurityjwtroles.repositories;


import org.sebastiandev.springsecurityjwtroles.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}