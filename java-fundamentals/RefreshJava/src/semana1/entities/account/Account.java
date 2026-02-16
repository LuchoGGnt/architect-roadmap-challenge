package semana1.entities.account;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

public class Account implements Serializable {
    private final UUID uuid = UUID.randomUUID();
    private final LocalDateTime createdDate = LocalDateTime.now();
    private boolean state;

    public Account(boolean state) {
        this.state = state;
    }

    public UUID getUuid() {
        return this.uuid;
    }
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }
    public boolean getState() {
        return state;
    }
    public void activateAccount() {
        this.state = true;
    }
}
