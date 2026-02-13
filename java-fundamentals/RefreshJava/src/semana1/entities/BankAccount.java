package semana1.entities;

import semana1.entities.User;

import java.time.LocalDate;
import java.util.UUID;

public class BankAccount {
    private final LocalDate fechaCreacion = LocalDate.now();
    private final UUID uuid = UUID.randomUUID();
    private final double montoInicial;
    private boolean estado;
    User usuario;

    public BankAccount(
            double montoInicial,
            boolean estado,
            User usuario
    ) {
        this.montoInicial = montoInicial;
        this.estado = estado;
        this.usuario = usuario;
    }

    public LocalDate getFechaCreacion() { return fechaCreacion; }

    public double getMontoInicial() { return montoInicial; }

    public boolean isEstado() { return estado; }

    public void setEstado(boolean estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "BankAccount{" +
                "fechaCreacion=" + fechaCreacion +
                ", uuid=" + uuid +
                ", montoInicial=" + montoInicial +
                ", estado=" + estado +
                ", usuario=" + usuario +
                '}';
    }
}

