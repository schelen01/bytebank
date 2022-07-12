public class Conta {
    //especificação em Java
   private double saldo;
   private int agencia = 42; //especifiquei um valor padrão para agência
   private int numero;
   private Cliente titular;


    //criando métodos
    public void depositar(double valor) {
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
       public double getSaldo(){
        //quando alguém pede o saldo, o que é preciso fazer? RETORNAR o saldo!
           return this.saldo;
       }

       public int getNumero(){ //atributo privado, obtenho ele
          return this.numero;
       }
       public void setNumero(int novoNumero){ //seto para obter novo número
            this.numero = novoNumero; //this numero é o numero do atributo e o da direita é só numero, argumento
       }

        public int getAgencia() {
          return this.agencia;
    }

        public void setAgencia(int agencia) { //agencia não é o atributo agencia da classe Conta
          this.agencia = agencia;
    }

        Conta contaDois = new Conta();

        public void Cliente() {

    }

}

//instanciar é criar
