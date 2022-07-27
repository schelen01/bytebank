public class TesteValores {
    public static void main(String[] args){
        Conta conta = new Conta(1337, 24226);

        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(1337, 22522);
        Conta conta3 = new Conta(1334, 22336);
        System.out.println(Conta.getTotal()); //precisa declarar o static, para que compile


    }
}
