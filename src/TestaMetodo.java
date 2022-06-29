import java.sql.SQLOutput;

public class TestaMetodo {

    public static void main(String[] args){
     Conta contaUm = new Conta();
     contaUm.saldo = 100;
     contaUm.depositar(1000);
        System.out.println(contaUm.saldo); //Se aparecer somente 100 é porque precisa passar para o método na aba "testa método" o que precisa retornar
        // foi invocado o método para a ContaUm
     boolean conseguiuRetirar = contaUm.sacar(20);
        System.out.println(contaUm.saldo);
        System.out.println(conseguiuRetirar);

     Conta contaDois = new Conta();
     contaDois.depositar(1000); // a conta dois tem este valor


        if(contaDois.transfere(300, contaUm)) { //se eu quero saber se o valor da conta será o suficiente
                                //valor e destino
            System.out.println("transferência feita com sucesso");
        }else{
            System.out.println("faltou dinheiro");
        }
        System.out.println(contaDois.saldo);//após a transferência do valor, ficará?
        System.out.println(contaUm.saldo); //verifico qual é o saldo final da contaUm após a transferência

        contaUm.titular = "Paulo Silveira"; //se fosse assim, lá em conta deveria ser STRING TITULAR
        System.out.println(contaUm.titular);
    }
    //Para navegar nas classes utilizamos o ctrl (está linkando todos os atributos, métodos e variáveis)
}
