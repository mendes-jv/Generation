fun main() {

    //input de dados
    print("Digite seu nome: ")
    var nome : String = readLine()!!
    print("Digite sua idade: ")
    var idade = readLine()!!.toInt()
    print("Digite sua preferência de emprego: ")
    var emprego : String = readLine()!!
    print("Digite sua nacionalidade: ")
    var pais : String = readLine()!!
    print("Digite seu tipo sanguíneo: ")
    var sangue : String = readLine()!!

    //Cálculo
    var ano : Int = 2021 - idade

    //Output de respostas
    println("Seu nome é: $nome")
    println("Sua idade é: $idade")
    println("Sua preferência de emprego é: $emprego")
    println("Sua nacionalidade é: $pais")
    println("Seu tipo sanguíneo é: $sangue")
    println("O ano de seu nascimento é: $ano")

}