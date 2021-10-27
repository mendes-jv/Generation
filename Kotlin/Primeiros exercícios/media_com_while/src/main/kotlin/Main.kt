fun main() {

    //Declaração de variáveis
    var nota: Double = 0.0
    var aux = 1
    println("Programa para cálculo de média!")

    //Contador de e armazenador de números
    while (aux < 5) {
        print("Nota $aux: ")
        nota += readLine()!!.toDouble()
        aux++
    }

    //Saída de dados
    nota /= 4
    println("A média é $nota")
}