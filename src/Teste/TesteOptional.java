package Teste;

import model.Seguro;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.util.Optional;

public class TesteOptional {

    public static void main(String[] args) {

        Seguro seguro = new Seguro("Total com franquia reduzida", new BigDecimal("600"));
        Optional<Seguro> seguroOptional = Optional.ofNullable(seguro);

        // Mapeia a "caixa" e me retorna um novo bigdecimal. Pegue esse valor e passe para o println
        seguroOptional.map(Seguro::getValorFranquia).ifPresent(System.out::println);


        // Quando sei que vai ter alguma coisa dentro do Optional
//        Optional<Seguro> seguroOptional = Optional.of(seguro);

        // Quando não sei se vai ter algo dentro da "caixa"
//        Seguro seguro2 = null;
//        Optional<Seguro> seguroOpcionalVazio =  Optional.ofNullable(seguro2);


    }
}
