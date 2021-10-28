import kotlin.math.log
import kotlin.math.pow

fun main() {

    //Inserção de dados pelo usuário
    print("Digite o primeiro número dos cálculos: ")
    val numero1: Double = readLine()!!.toDouble()
    print("Digite o segundo número dos cálculos: ")
    val numero2: Double = readLine()!!.toDouble()

    //Retorno de dados ao usuário
    println("\nSoma -> ($numero1 + $numero2) = " + adicao(numero1, numero2))
    println("\nSubtração -> ($numero1 - $numero2) = " + subtracao(numero1, numero2))
    println("\nMultiplicação -> ($numero1 * $numero2) = " + multiplicacao(numero1, numero2))
    println("\nDivisão -> ($numero1 / $numero2) = " + divisao(numero1, numero2))
    println("\nPotenciação -> ($numero1)^$numero2 = " + potenciacao(numero1, numero2))
    println("\nLogaritmo -> (Log de $numero1 na base de $numero2 = " + logaritmo(numero1, numero2))

}

fun adicao(num1: Double, num2: Double): Double = (num1 + num2)

fun subtracao(num1: Double, num2: Double): Double = (num1 - num2)

fun multiplicacao(num1: Double, num2: Double):Double = (num1 * num2)

fun divisao(num1: Double, num2: Double): Double = (num1 / num2)

fun potenciacao(num1: Double, num2: Double): Double = (num1.pow(num2))

fun logaritmo(num1: Double, num2: Double): Double = (log(num1, num2))