fun main() {

    //Declaração de variáveis
    var num: Double
    var numSoma = 0.0
    var aux = 0
    var menorNum = 0.0
    var maiorNum = 0.0
    println("Programa para análise de números")

    //Estrutura de repetição para análise dos números digitados
    do {
        print("Digite um número: ")
        num = readLine()!!.toDouble()
        numSoma += num
        if (num > maiorNum) maiorNum = num else if (num < menorNum) menorNum = num
        if (menorNum == 0.0) menorNum = num else if (maiorNum == 0.0) maiorNum = num
        aux++
    } while (num != 0.0)

    //Saída dos dados
    val media: Double = numSoma/(aux - 1)
    println("A soma dos valores digitados é $numSoma, e a média dos valores é $media, " +
            "sendo $maiorNum o maior número digitado e $menorNum o menor número digitado")
}