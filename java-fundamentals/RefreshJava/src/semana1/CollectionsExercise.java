package semana1;

import semana1.entities.account.Account;
import semana1.entities.account.nocredit.CurrentAccount;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsExercise {
    public static void main(String[] args) {

        int n = 50;
        double min = 2500.0, max = 15000.0;
        double randomValue;

        List<CurrentAccount> listaCuentas = new ArrayList<CurrentAccount>();
        for (int i = 0; i < n; i++) {
            boolean state = i % 2 == 0;
            randomValue = (double) (Math.random() * (max - min) + 1);

            CurrentAccount cuenta = new CurrentAccount(state, randomValue);

            listaCuentas.add(cuenta);
        }

        // EJERCICIO 1: Filtra solo cuentas activas
        // TODO: Implementar con streams
        listaCuentas.stream()
                .filter(o -> o.getState() == false);

        // EJERCICIO 2: Obtén lista de montos de cuentas activas
        // TODO: Implementar con map
        Map<UUID, CurrentAccount> mapCuentas = new HashMap<>();
        listaCuentas.stream()
                .filter(cuenta -> cuenta.getState() == false)
                .collect(
                        Collectors.toMap(
                                CurrentAccount::getUuid,
                                Function.identity()
                        )
                );

        // EJERCICIO 3: Suma total de dinero en cuentas activas
        // TODO: Implementar con reduce o sum
        double sumaMontos = listaCuentas.stream()
                .filter(cuenta -> cuenta.getState() == true)
                .mapToDouble(cuenta -> cuenta.getAmount()).sum();
        System.out.println(sumaMontos);

        double sumaMontosReduce = listaCuentas.stream()
                .filter(cuenta -> cuenta.getState() == true)
                .reduce(0.0, (parcial, suma) -> parcial + suma.getAmount(), (suma1, suma2) -> suma1 + suma2);
        System.out.println(sumaMontos);

        // EJERCICIO 4: Encuentra cuenta con mayor saldo
        // TODO: Implementar con max
        // Ejemplo con max()
        CurrentAccount cuentaMayorR = listaCuentas.stream()
                .filter(cuenta -> cuenta.getState() == true)
                .max(Comparator.comparingDouble(cuenta -> cuenta.getAmount()))
                .orElse(null);
        System.out.println(cuentaMayorR.getUuid());
        // Ejemplo con reduce()
        CurrentAccount cuentaMayorM = listaCuentas.stream()
                .filter(cuenta -> cuenta.getState() == true)
                .reduce((a, b) -> a.getAmount() > b.getAmount() ? a : b)
                .orElse(null);
        System.out.println(cuentaMayorM.getUuid());
    }
}

