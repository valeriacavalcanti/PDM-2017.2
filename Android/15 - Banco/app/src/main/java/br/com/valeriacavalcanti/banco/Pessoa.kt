package br.com.valeriacavalcanti.banco

/**
 * Created by Valéria on 29/11/2017.
 */
class Pessoa {
    var id: Int
    var nome: String
    var idade: Int

    constructor (id: Int, nome: String, idade: Int){
        this.id = id
        this.nome = nome
        this.idade = idade
    }

    constructor (nome: String, idade: Int){
        this.id = -1
        this.nome = nome
        this.idade = idade
    }

    override fun toString(): String {
        return "${id} - ${nome} - ${idade}"
    }
}