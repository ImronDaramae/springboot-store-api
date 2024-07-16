package com.imron.springboot_store_api.services

import com.imron.springboot_store_api.models.Product
import com.imron.springboot_store_api.repository.ProductRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductService(private val productRepository: ProductRepository) {

    // Get all products
    fun getAllProducts(): List<Product> = productRepository.findAll() // select * from products

    // Get product by id
    fun getProductById(id: Int): Optional<Product> {
        return if (productRepository.existsById(id)) {
            productRepository.findById(id) // select * from products where id = ?
        } else {
            throw RuntimeException("Product not found with id: $id")
        }
    }

    // Create product
    fun createProduct(product: Product): Product = productRepository.save(product)

    // Update Product
    fun updateProduct(id: Int, updateProduct: Product): Product {
        return if (productRepository.existsById(id)) {
            updateProduct.id = id
            productRepository.save(updateProduct)
        } else {
            throw RuntimeException("Product not found with id: $id")
        }
    }

    // Delete Product
    fun deleteProduct(id: Int) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id)
        } else {
            throw RuntimeException("Product not found with id: $id")
        }
    }
}