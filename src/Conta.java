
public class Conta {
    //especificação em Java
    double saldo;
    int agencia = 42; //especifiquei um valor padrão para agência
    int numero;
    String titular;


    //criando métodos
    void depositar(double valor) {
        this.saldo = this.saldo + valor; // referencio o atributo através do This
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) { //Conta destino é um parâmetro(destino) que é uma referência de Conta
       if(this.saldo >= valor) { // se o meu saldo for maior que valor
           this.saldo -= valor; //subtrair este valor
           destino.depositar(valor); //e depoisita este valor dentro da conta de destino
           return true;
       }
            return false;
       }
    }


//instanciar é criar
