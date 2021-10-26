fun main(args: Array<String>) {

    //Declaração de variáveis
    var idade : Byte
    var numIngresso : Byte
    var ingresso : Double = 18.0

    //Coleta de inputs
    println("Programa de cálculo de desconto no ingresso de cinema")
    print("Digite sua idade: ")
    idade = readLine()!!.toByte()

    // Fluxo de controle com estrutura condicional
    if (idade < 5) {
        ingresso *= 2.0/5.0
    } else if (idade >= 60) {
        ingresso *= 9.0/20.0
    } else {
        print("Digite a quantidade de ingressos que quer comprar: ")
        numIngresso = readLine()!!.toByte()
        if (numIngresso >= 2) {
            ingresso *= 7.0/10.0
        }
    }

    //Output
    println("Você pagará R$$ingresso por cada ingresso")
}