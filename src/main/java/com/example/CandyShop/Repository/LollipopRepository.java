package com.example.CandyShop.Repository;


import com.example.CandyShop.model.Lollipop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LollipopRepository extends MongoRepository<Lollipop, String> {


}
