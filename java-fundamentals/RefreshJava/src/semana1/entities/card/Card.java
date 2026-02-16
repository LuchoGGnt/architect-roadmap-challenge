package semana1.entities.card;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Card implements Serializable {
    private final UUID uuid;
    private final LocalDateTime createdAt;
    private final String cardNumber;
    private final String ccv;
    private final LocalDateTime expireAt;

    public Card() {
        this.uuid = UUID.randomUUID();
        this.createdAt = LocalDateTime.now();
        this.cardNumber = generateCardNumber();
        this.ccv = generateCCV();
        this.expireAt = createdAt.plusMonths(60);
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getCcv() {
        return this.ccv;
    }
    public LocalDateTime getExpireAt() {
        return this.expireAt;
    }
    public String getExpireAtFormated() {
        DateTimeFormatter ftm = DateTimeFormatter.ofPattern("MM-yy");
        return this.expireAt.format(ftm);
    }

    private String generateCardNumber() {
        return String.valueOf((long) (Math.random() * 8999999999999999.0 + 1000000000000000.0));
    }
    private String generateCCV() {
        return String.valueOf((int)(Math.random() * 899.0 + 100.0));
    }
}
