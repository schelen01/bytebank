package Conta;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "Paulo Silveira";
        cliente.cpf = "082.082.082-22";
        cliente.profissao = "programador";

        /*Conta contaUm = new Conta();
        contaUm.depositar(100);
        System.out.println(contaUm.saldo); */
    }
}

   //não funciona pq não foi criado um novo projeto     contaUm.titular = cliente; //composição de objetos //referencia ao paulo
   //não funciona pq não foi criado um novo projeto     System.out.println(contaUm.titular.nome); //Navega pelas "flechas", referencia até chegar no nome
    //}

