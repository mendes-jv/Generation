fun main(args: Array<String>) {

    //Coleta de inputs
    println("Programa de cálculo de comissão!")
    print("Digite o valor total vendido pelo representante: ")
    var venda : Double = readLine()!!.toDouble()
    var comissao : Double

    // Fluxo de controle com estrutura condicional
    if (venda > 10000.0) {
       comissao = venda * 3/10
    } else if (venda > 5000.00 && venda <= 10000.0) {
        comissao = venda * 2/10
    } else if (venda >= 1001.00 && venda <= 5000) {
        comissao = venda * 1/10
    } else {
        comissao = 0.0
    }

    //Output
    println("O representante ganhará R$$comissao de comissão")
}