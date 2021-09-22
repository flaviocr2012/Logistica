package repository;

import model.Caminhao;
import model.Motorista;
import model.Seguro;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Motoristas {

    private Map<String, Motorista> motoristas = new HashMap<>();

    public Motoristas() {

        Seguro seguro = new Seguro("Parcial - não cobre roubo", new BigDecimal("5000"));
        Caminhao caminhao = new Caminhao("Mercedes Atron", seguro);
        Motorista motorista1 = new Motorista("João", 40, caminhao);
        Motorista motorista2 = new Motorista("José", 25, null);

        motoristas.put("João", motorista1);
        motoristas.put("José", motorista2);

    }

    public Motorista porNome(String nome) {
        return motoristas.get(nome);

    }

}
