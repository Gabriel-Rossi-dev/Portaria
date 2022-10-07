package control

import business.ConvidadoBusiness
import entity.Convite


class Portaria {

    private val convidadoBusiness = ConvidadoBusiness()

    init {
        println("Portaria Inicializada")
        println(controle())
    }

    private fun controle(): String {
        val idade = Console.readInt("Qual sua idade? ")
        if (!convidadoBusiness.maiorDeIdade(idade)) {
            return ("Negado. Menores de idade não são permitidos.")

        }

        val tipoConvite = Console.readString("Qual o tipo de convite? ")
        if (!convidadoBusiness.tipoValido(tipoConvite)) {
            return "Negado. Convite inválido."
        }


        val codigo = Console.readString("Qual o codigo de convite? ")
        val convidado = Convite(tipoConvite, codigo, idade)
        if (!convidadoBusiness.convidadoValido(convidado)) {
            return "Negado. Convite inválido."
        }
        return "Welcome! :)"
    }
}

