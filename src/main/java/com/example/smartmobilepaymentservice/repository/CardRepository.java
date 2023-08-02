package com.example.smartmobilepaymentservice.repository;

import com.example.smartmobilepaymentservice.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardRepository extends JpaRepository<CardEntity, UUID> {

}
