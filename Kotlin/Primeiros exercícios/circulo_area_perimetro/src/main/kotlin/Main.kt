fun main() {

    // Declaração de variáveis
    var diametro : Int
    var perimetro : Double
    var area : Double

    //input de dados
    print("Digite o diâmetro do círculo: ")
    diametro = readLine()!!.toInt()

    //Cálculo
    perimetro = diametro.toDouble() * 3.14159
    area = 3.14159 * (diametro / 2) * (diametro / 2)

    //Output de respostas
    println("o diâmetro é: $diametro")
    println("O perímetro é: $perimetro")
    println("A área é: $area")

}