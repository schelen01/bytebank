public class TestaGetESet {

    public static void main(String[] args) { //main ctrl + espaço
        Conta conta = new Conta(1337, 24226);//Conta() está invocando o construtor
        // conta.numero = 1377; //Não compila, mas porque?
        conta.setNumero(1337); //Agora irá compilar
        System.out.println(conta.getNumero()); //como vejo o numero da agência?

        //lembra do: conta.titular = paulo; (?)
        Cliente paulo = new Cliente();
        conta.setTitular(paulo);
        //setNome para setar o nome do paulo
        paulo.setNome("Paulo Silveira");
        //altero o atributo titular, apar a variável titular. Lembre-se é uma REFERÊNCIA
        conta.setTitular(paulo);
        System.out.println(conta.getTitular()); //valor da referencia
        System.out.println(conta.getTitular().getNome()); //anda pelas flechas dos objetos, até chegar no nome do objeto 2

        conta.getTitular().setProfissao("Cozinheiro");
        //agora em 2 linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Cozinheiro"); // chegará no mesmo resultado


        System.out.println(titularDaConta); //Cliente@15db9742
        System.out.println(paulo);//Cliente@15db9742
        System.out.println(conta.getTitular());//Cliente@15db9742

    }
}
