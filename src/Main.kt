import br.com.guilhermesantos.User

fun main() {

    val Guilherme = User(
        "Guilherme",
        29,
        "1234")

    println(Guilherme.auth("1234"))
    println(Guilherme)

}