import java.lang.String;

public class TestaContaSemCliente {

    public static void main(String[] args){
        Conta contaDois = new Conta();
        System.out.println(contaDois.saldo);

        /* System.out.println(contaDois.titular); //mostra null que é o que tem no titular */
        contaDois.titular = new Cliente(); // puxo da ContaDois o titular e jogo para a classe Cliente


        contaDois.titular.nome = "Marcela"; // não funciona, pq não tem flechinha nenhuma puxando de titular para nome do Cliente
        System.out.println(contaDois.titular.nome);
    }

}
