fun main(){
    println("Bem vindo ao Bytebank")
    val conta = Conta()
    conta.titular = "Jose"
    println(conta.titular)
    testaLaco()
}

private fun testaLaco() {
    val titular: String = "Alex"
    val numeroConta: Int = 1000
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo -= 400

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")

    testaCondicao(saldo)
}

fun testaCondicao(saldo: Double){

    when{
        saldo > 0.0 ->  println("conta é positiva")
        saldo == 0.0 ->  println("conta é neutra")
        saldo < 0.0 ->  println("conta é negativa")
    }

}