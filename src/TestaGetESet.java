public class TestaGetESet {

    public static void main(String[] args) { //main ctrl + espaço
        Conta conta = new Conta();
        // conta.numero = 1377; //Não compila, mas porque?
        conta.setNumero(1337); //Agora irá compilar
        System.out.println(conta.getNumero()); //como vejo o numero da agência?



    }
}
