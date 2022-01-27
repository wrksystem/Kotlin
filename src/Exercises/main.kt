class Pessoal(val anoNascimento: Int, var nome:String) {
    var olhos: String = ""
    fun dormir () {
    }
    fun acordar () {
    }
}

fun main () {
    //class - comportamento e atributos
    //classe (instância) objetos
    var pessoa: Pessoa = Pessoal(2000, "Fulano")

    pessoa.acordar ()
    pessoa.dormir ()

    // o "." permite acessar atributos e comportamentos das classes e objetos.

}