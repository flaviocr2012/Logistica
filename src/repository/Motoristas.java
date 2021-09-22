package repository;

import model.Caminhao;
import model.Motorista;
import model.Seguro;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Motoristas {

    private Map<String, Optional<Motorista>> motoristas = new HashMap<>();

    public Motoristas() {

        Seguro seguro = new Seguro("Parcial - não cobre roubo", new BigDecimal("5000"));
        Caminhao caminhao = new Caminhao("Mercedes Atron", Optional.ofNullable(seguro));
        Optional<Motorista> motorista1 = Optional.of(new Motorista("João", 40, Optional.ofNullable(caminhao)));
        Optional<Motorista> motorista2 = Optional.of(new Motorista("José", 25, Optional.ofNullable(null)));

        motoristas.put("João", motorista1);
        motoristas.put("José", motorista2);

    }

    public Optional<Motorista> porNome(String nome) {
        return motoristas.get(nome);

    }

}
