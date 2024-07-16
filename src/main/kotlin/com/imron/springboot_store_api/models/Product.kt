package com.imron.springboot_store_api.models

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

@Entity // กำหนดให้ class เป็น Entity ในฐานข้อมูล เพื่อให้ JPA สามารถจัดการข้อมูลได้
@Table(name = "products") // กำหนดชื่อตารางในฐานข้อมูล
data class Product(
    // กำหนด field ของ class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // กำหนดให้ field เป็น Primary Key และ Auto Increment
    var id: Int = 0,

    @Column(name = "product_name") // กำหนดชื่อ field ในฐานข้อมูล
    @Size(min = 3, max = 50) // กำหนดขนาดของข้อมูล
    @NotBlank(message = "Product name is required") // กำหนดให้ field นี้ไม่สามารถเป็นค่าว่างได้
    val productName: String = "",

    @Column(name = "product_price") // กำหนดชื่อ field ในฐานข้อมูล
    @Size(min = 1, max = 10) // กำหนดขนาดของข้อมูล
    @NotBlank(message = "Product price is required") // กำหนดให้ field นี้ไม่สามารถเป็นค่าว่างได้
    val productPrice: Double = 0.0, // กำหนดค่าเริ่มต้นของ field

    @Column(name = "product_quantity") // กำหนดชื่อ field ในฐานข้อมูล
    @Size(min = 1, max = 10) // กำหนดขนาดของข้อมูล
    @NotBlank(message = "Product quantity is required") // กำหนดให้ field นี้ไม่สามารถเป็นค่าว่างได้
    val productQuantity: Int = 0, // กำหนดค่าเริ่มต้นของ field

    @Column(name = "product_image") // กำหนดชื่อ field ในฐานข้อมูล
    val productImage: String = "" // กำหนด field สำหรับเก็บชื่อไฟล์รูปภาพ
)

