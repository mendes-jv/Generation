fun main(args: Array<String>) {

    //Declaração de variáveis e input de dados
    print("Digite o número do mês: ")
    var mes = readLine()!!.toInt()

    //Controle de fluxo usando estrutura de repetição
    when(mes) {
        1 -> println("Esse mês é o janeiro.")
        2 -> println("Esse mês é o fevereiro.")
        3 -> println("Esse mês é o março.")
        4 -> println("Esse mês é o abril.")
        5 -> println("Esse mês é o maio.")
        6 -> println("Esse mês é o junho.")
        7 -> println("Esse mês é o julho.")
        8 -> println("Esse mês é o agosto.")
        9 -> println("Esse mês é o setembro.")
        10 -> println("Esse mês é o outubro.")
        11 -> println("Esse mês é o novembro.")
        12 -> println("Esse mês é o dezembro.")
        else -> println("Esse mês não existe.")
    }
}