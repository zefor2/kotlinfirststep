class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun depositar(saldo: Double){
        println("Depositando na conta do ${this.titular}")
        this.saldo = saldo
    }
}