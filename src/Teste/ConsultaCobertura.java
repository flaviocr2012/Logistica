package Teste;

import model.Caminhao;
import model.Motorista;
import model.Seguro;
import repository.Motoristas;

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

//        System.out.println("A cobertura é: " + cobertura);


    }


}
