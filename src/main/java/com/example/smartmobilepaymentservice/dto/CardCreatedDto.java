package com.example.smartmobilepaymentservice.dto;

import com.example.smartmobilepaymentservice.entity.CardType;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class CardCreatedDto {

    @NotBlank(message = "Card number not entered")
    private String card_number;

    @NotBlank(message = "Expire date not entered")
    private String expire_date;

    @NotBlank(message = "Owner id not entered")
    private UUID owner_id;

    @NotBlank(message = "Card type not entered")
    private CardType card_type;

}
