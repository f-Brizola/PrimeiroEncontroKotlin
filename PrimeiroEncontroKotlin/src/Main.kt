
var version = 56565

fun main(args: Array<String>) {

    //variaveis mutaveis
    // para isso uso a palavra chave var

    var idade = 30
    idade = 31

    //var nome_variavel: tipo = valor
    var nome: String = "Cleiton"
    var valor: Double = 5.5
    var peso: Int = 90
    var ePessoa: Boolean = true

    println("Minha idade é $idade e meu peso é $peso")

    //Variaveis imutaveis
    //para isso uso o val
    val pi = 3.14
    val percentualIcms: Int = 19
    val nomeEmpresa = "UNIPAR"


    println("version ${version}")
    mudarVersion(50)
    println("version ${version}")

    var total = somarValores(10,20)
    println("Total é $total")
}

//void
// fun nome_funcao(parametros)
fun mudarVersion(versionchange: Int){
    version = versionchange

    mudarVersion(50)

}

//Funcoes com retorno
fun somarValores(valorA: Int, valorB: Int): Int {
    return valorA + valorB

}