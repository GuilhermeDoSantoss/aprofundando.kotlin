package br.com.guilhermesantos

class User(
    var name: String,
    var age: Int,
    val password: String
) {


    fun auth(password: String) =
        this.password == password


    override fun toString(): String {
        return "User(name='$name', age=$age)"
    }


}