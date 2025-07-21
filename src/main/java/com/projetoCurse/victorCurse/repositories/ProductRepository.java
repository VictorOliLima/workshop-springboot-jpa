package com.projetoCurse.victorCurse.repositories;

import com.projetoCurse.victorCurse.entities.Category;
import com.projetoCurse.victorCurse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
