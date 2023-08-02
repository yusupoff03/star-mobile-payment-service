package com.example.smartmobilepaymentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.UUID;

@Entity(name = "card_entity")
public class CardEntity extends BaseEntity{
    private String card_number;
    private String expire_date;

    private UUID owner_id;

    @Enumerated(value = EnumType.STRING)
    private CardType card_type;

}
