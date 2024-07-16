package com.imron.springboot_store_api.repository

import com.imron.springboot_store_api.models.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository:JpaRepository<Product, Int> {
}