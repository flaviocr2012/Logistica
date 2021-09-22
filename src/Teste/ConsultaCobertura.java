package Teste;

import model.Caminhao;
import model.Motorista;
import model.Seguro;
import repository.Motoristas;

import java.util.Optional;

public class ConsultaCobertura {

    public static void main(String[] args) {

        Motoristas motoristas = new Motoristas();
//        Motorista motorista = motoristas.porNome("João"); // José não tem caminhão, por isso dá NulPointerException

//        String cobertura = motorista.getCaminhao().getSeguro().getCobertura();

        // Pra não ficar usando vários ifs, posso usar a classe Optional
//        String cobertura = "Sem cobertura";
///        if (motorista != null) {
//            Caminhao caminhao = motorista.getCaminhao();
//            if (caminhao != null) {
//                Seguro seguro = caminhao.getSeguro();
//                if (seguro != null) {
//                    cobertura = seguro.getCobertura();
//                }
//            }
//        }

        // Utilizando flatMap pra agrupar dois Optionals

//        Optional<Motorista> motoristaOpcional = motoristas.porNome("João");
//        Optional<Caminhao> caminhaoOpcional = motoristaOpcional.flatMap(Motorista::getCaminhao);

//        System.out.println("A cobertura é: " + cobertura);

        Optional<String> coberturaOpcional = motoristas.porNome("João")
                .flatMap(Motorista::getCaminhao)
                .flatMap(Caminhao::getSeguro)
                .map(Seguro::getCobertura);

        coberturaOpcional.ifPresent(System.out::println);







    }


}
