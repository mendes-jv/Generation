fun main() {

    // Declaração de variáveis
    var nome : String
    var idade : Int = 0
    var emprego : String
    var pais : String
    var sangue : String
    var ano : Int

    //input de dados
    print("Digite seu nome: ")
    nome = readLine()!!
    print("Digite sua idade: ")
    idade = readLine()!!.toInt()
    print("Digite sua preferência de emprego: ")
    emprego = readLine()!!
    print("Digite sua nacionalidade: ")
    pais = readLine()!!
    print("Digite seu tipo sanguíneo: ")
    sangue = readLine()!!

    //Cálculo
    ano = 2021 - idade

    //Output de respostas
    println("Seu nome é: $nome")
    println("Sua idade é: $idade")
    println("Sua preferência de emprego é: $emprego")
    println("Sua nacionalidade é: $pais")
    println("Seu tipo sanguíneo é: $sangue")
    println("O ano de seu nascimento é: $ano")

}