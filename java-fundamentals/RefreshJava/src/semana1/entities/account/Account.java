package semana1.entities.account;

import java.time.LocalDate;
import java.util.UUID;

public class Account {
    private final UUID uuid = UUID.randomUUID();
    private final LocalDate createdDate = LocalDate.now();
    private boolean state;

    public Account(boolean state) {
        this.state = state;
    }

    public void activateAccount() {
        this.state = true;
    }
    public LocalDate getCreatedDate() {
        return createdDate;
    }
    public boolean getState() {
        return state;
    }
}
