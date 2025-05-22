## 📦 Fundamentos de Kotlin: Estrutura e Boas Práticas

Este repositório contém exemplos práticos dos principais fundamentos da linguagem Kotlin, voltados à estruturação de classes, criação de objetos, uso de propriedades, métodos e boas práticas seguindo a convenção de código da linguagem.

## ✅ Conteúdos abordados

**🗂️ Criação de pacotes**

Organização do código em pacotes para melhor modularização e reutilização:

package br.com.guilhermesantos

## 🧱 Declaração de classes e criação de instâncias

**Exemplos de como declarar classes e instanciar objetos:**

class User(val nome: String, val idade: Int)

val pessoa = Pessoa("Guilherme", 30)

## 🧬 Properties (propriedades)

**Demonstração do uso de propriedades com val, var, get() e set():**


class Produto(var nome: String, var preco: Double) {
    val emEstoque: Boolean
        get() = preco > 0
}

## 🛠️ Construtores primário e secundário

**Como usar e combinar construtores para maior flexibilidade:**


class Livro(val titulo: String, val autor: String) {

    var anoPublicacao: Int = 0
    constructor(titulo: String, autor: String, ano: Int) : this(titulo, autor) {
        this.anoPublicacao = ano
    }
}

## 📝 Implementação de toString()##

**Sobrescrita do método toString() para melhor exibição dos objetos:**


override fun toString(): String {
    return "Livro(titulo='$titulo', autor='$autor', ano=$anoPublicacao)"
}

## ➕ Adicionando métodos personalizados

**Criação de métodos que agregam funcionalidades às classes:**

fun exibirInformacoes() {

    println(toString())
}

## 📏 Convenção de código Kotlin

**Seguindo as boas práticas recomendadas pela Kotlin Coding Conventions, o código deste projeto aplica:**

Nomes em camelCase para variáveis e funções.

Classes e arquivos com nomes significativos e iniciando com letra maiúscula.

Uso apropriado de val e var.

Organização por pacotes e modularização.

Limpeza e legibilidade do código.

## 🚀 Objetivo

Esse projeto tem como objetivo reforçar os conceitos básicos de orientação a objetos em Kotlin, com exemplos comentados e fáceis de entender para quem está começando com a linguagem ou migrando de outra stack.

## 📚 Requisitos

Kotlin 1.9+

IntelliJ IDEA
