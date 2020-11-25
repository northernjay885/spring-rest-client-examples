package guru.springframework.springrestclientexamples.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Card {
    private String type;
    private String number;
    private Date expiration_date;
}
