package com.example.smartmobilepaymentservice.Controller;

import com.example.smartmobilepaymentservice.dto.CardCreatedDto;
import com.example.smartmobilepaymentservice.entity.CardEntity;
import com.example.smartmobilepaymentservice.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @PostMapping("/{ownerId}/add")
    public ResponseEntity<CardEntity> add(
            @RequestBody CardCreatedDto cardCreatedDto,
            @PathVariable UUID ownerId
            ){
        return ResponseEntity.ok(cardService.add(cardCreatedDto,ownerId));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<CardEntity>> getAll(
            @RequestParam int size,
            @RequestParam int page
    ){
        return ResponseEntity.ok(cardService.getAllUserCards(size, page));
    }

    @PutMapping("/{ownerId}/update")
    public ResponseEntity<CardEntity> update(
            @RequestBody CardCreatedDto cardCreatedDto,
            @PathVariable UUID ownerId,
            @RequestParam UUID card_id
    ){
        return ResponseEntity.ok(cardService.update(cardCreatedDto,ownerId,card_id));
    }

    @DeleteMapping("/{ownerId}/delete")
    public ResponseEntity<Boolean> delete(
            @PathVariable UUID ownerId,
            @RequestParam UUID card_id
    ){
        return ResponseEntity.ok(cardService.deleteById(ownerId, card_id));
    }

}
