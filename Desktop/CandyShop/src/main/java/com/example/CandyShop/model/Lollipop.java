package com.example.CandyShop.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "lollipop")
public class Lollipop {

    @Id
    private ObjectId _id;
    private String color;
    private String size;
    private String favor;
    private String smell;




}
