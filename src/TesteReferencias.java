
public class TesteReferencias { //é uma referência que dá um direcionamento, "uma flecha"
//2 cartas diferentes mas que se direcionam ao mesmo lugar, ou 2 contas diferentes, mas que tem a mesma referência

    public static void main(String[] args){
        Conta primeiraConta =new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; // o sistema não fará ctrl c ctrl v. Ele irá referenciar
        System.out.println("saldo da segunda conta: " + segundaConta.saldo); // O que irá imprimir?
        //300, pois só temos saldo em uma conta
        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        System.out.println("saldo da segunda conta: " + primeiraConta.saldo);// irá sair para o mesmo objeto
        //por isso também será 400

        //Vamos verificar se a primeira conta é a mesma da segunda Conta:
        if(primeiraConta == segundaConta){ // == vai comparar refência!!
            System.out.println(" São a mesmissima conta"); // Compara as referencias e não o objeto

        System.out.println(primeiraConta);// aparecerá Conta@5f184fc6
            System.out.println(segundaConta);//será a mesma conta e a mesma referencia

        }

    }
}
