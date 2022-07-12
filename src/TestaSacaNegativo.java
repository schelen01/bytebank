public class TestaSacaNegativo {

    public static void main(String[] args){
        Conta conta = new Conta();  //conta é a variável criada
        conta.depositar(100);
        conta.sacar(200); //boolean false
        System.out.println(conta.saldo);

        //Acessar a conta pelo atributo
        conta.saldo = conta.saldo - 101;
        System.out.println(conta.saldo); //aparecerá -1
        // Não é boa prática, pois vc estará acessando o objeto pelo atributo e não pelo método

        //Como INVOCO UM MÉTODO? Trago meu método e seus (argumentos)
        System.out.println(conta.getSaldo());

        //Como faço para definir o número da agência?
        conta.numero = -1377; //seria algo pré-definido, e se percebe a necessidade de ser privado



    }
}
