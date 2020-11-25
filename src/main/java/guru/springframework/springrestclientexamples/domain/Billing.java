package guru.springframework.springrestclientexamples.domain;

import lombok.Data;

@Data
public class Billing {
    private Card card;
    private String iban;
    private String swift;
}
