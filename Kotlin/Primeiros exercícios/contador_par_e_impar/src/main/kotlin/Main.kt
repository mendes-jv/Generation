fun main() {

    //Declaração de variáveis
    var contadorImpar = 0
    var contadorPar = 0
    var num: Int
    println("Programa para contar números pares e ímpares!")

    //Contador de e armazenador de números
    for (aux: Int in 1..10) {
        print("Número $aux: ")
        num = readLine()!!.toInt()
        if ((num % 2) != 0) {
            contadorImpar++
        } else {
            contadorPar++
        }
    }

    //Saída de dados
    println("Nessa lista tem $contadorImpar números ímpares e $contadorPar números pares")
}