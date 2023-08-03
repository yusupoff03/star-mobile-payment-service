package com.example.smartmobilepaymentservice.service;

import com.example.smartmobilepaymentservice.dto.CardCreatedDto;
import com.example.smartmobilepaymentservice.entity.CardEntity;

import java.util.List;
import java.util.UUID;

public interface CardService {
    CardEntity add(CardCreatedDto card,UUID owner_id);
    List<CardEntity> getAllUserCards(int size, int page);
    Boolean deleteById(UUID card_id, UUID owner_id);
    CardEntity update(CardCreatedDto update,UUID card_id,UUID owner_id);
}
