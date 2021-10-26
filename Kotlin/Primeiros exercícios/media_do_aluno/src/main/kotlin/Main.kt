fun main(args: Array<String>) {

    //Coleta de inputs
    println("Programa para cálculo de média!")
    print("Agora digite a primeira nota: ")
    var media : Double = readLine()!!.toDouble()
    print("Agora digite a segunda nota: ")
    media += readLine()!!.toDouble()
    print("Agora digite a terceira nota: ")
    media += readLine()!!.toDouble()
    print("Agora digite a quarta nota: ")
    media += (readLine()!!.toDouble())
    media /= 4

    //Fluxo de controle com estrutura condicional
    if (media <=4 && media >= 0) {
        println("Reprovado!")
    } else if (media > 4 && media <= 5) {
        println("Média regular!")
    } else if (media > 5 && media <= 8) {
        println("Média boa!")
    } else if (media > 8 && media <= 10) {
        println("Média excelente!")
    } else {
        println("Média inválida!")
    }
    println("Média: $media")
}