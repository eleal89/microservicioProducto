package com.eleal.springbootmicroservice1product.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "product")
//@Getter
//@Setter
//@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String productName;
    private String productDescription;
    private Double unitPrice;
}
