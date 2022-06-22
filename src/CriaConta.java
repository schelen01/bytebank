import java.io.PrintStream;

public class CriaConta {
    public static void main(String[] args) { //ctrl espaço enter
        Conta primeiraConta = new Conta(); //o primeiro "Conta" é o tipo da variável "primeiraConta"
        primeiraConta.saldo =200; // atribui o valor para o atributo
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta =new Conta(); // criou um espaço de memória para a conta
        segundaConta.saldo =50;

        //precisamos orientar ao objeto, poi só "saldo =50" o Java não entende de qual conta é

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);


        //valor padrão para o JAVA é default, ou zero
        System.out.println(primeiraConta.numero);

        //Agora estou redefinindo um valor para agencia para segundaConta
        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta esta " + "na agencia " + segundaConta.agencia);


    }

}
