fun main() {

    //Declaração de variáveis
    val listaConvidados = mutableListOf<String>()
    var convidado = ""

    //Declaração de funções auxiliares
    fun baseConvidado(): String {
        println("Digite o nome do convidado: ")
        convidado = readLine()!!
        return convidado
    }
    fun removeConvidado() {
        listaConvidados.remove(baseConvidado())
        println("Convidado $convidado removido.")
    }
    fun adicionaConvidado() {
        listaConvidados.add(baseConvidado())
        println("Convidado $convidado adicionado.")
    }
    println("Bem vindos ao programa de lista de convidados!")
    fun mostraLista() {
        if (listaConvidados.isEmpty()) println("Lista vazia!")
        else {
            println("A sua lista de convidados é:")
            for (i in 0 until listaConvidados.size) println(listaConvidados[i])
        }
    }

    //Controle de fluxo usando laço de repetição e estrutura condicional
    while(true) { //Menu no console
        println("Digite 1 adicionar novos convidados." +
            "\nDigite 2 para remover um convidado." +
            "\nDigite 3 para mostrar lista de convidados." +
            "\nDigite sair ou qualquer outra coisa para sair do programa.")
        when (readLine()!!) {
            "1" -> adicionaConvidado()
            "2" -> removeConvidado()
            "3" -> mostraLista()
            else -> break
        }
    }
}
