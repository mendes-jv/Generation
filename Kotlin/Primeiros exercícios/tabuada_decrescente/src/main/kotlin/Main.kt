fun main() {

    //Coleta de dados
    print("Programa de cálculo de tabuada!\nDigite um número de 1 a 10: ")
    var num: Int = readLine()!!.toInt()

    //Controle de fluxo usando estrutura condicional e estrutura de repetição
    while(num !in (1..10)) {
        print("\nNúmero inválido, digite novamente: ")
        num = readLine()!!.toInt()
    }
    when(num) {
        1 -> println("\nTabuada do um")
        2 -> println("\nTabuada do dois")
        3 -> println("\nTabuada do três")
        4 -> println("\nTabuada do quatro")
        5 -> println("\nTabuada do cinco")
        6 -> println("\nTabuada do seis")
        7 -> println("\nTabuada do sete")
        8 -> println("\nTabuada do oito")
        9 -> println("\nTabuada do nove")
        10 -> println("\nTabuada do dez")
    }

    // Saída de dados usando contador
    for(aux: Int in 10 downTo 1) println("$num X $aux = ${num * aux}")
}