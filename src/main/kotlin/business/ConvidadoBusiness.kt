package business

import entity.Convite

class ConvidadoBusiness {

    fun maiorDeIdade(idade: Int) = idade >= 18

    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun convidadoValido(convite: Convite) = when (convite.tipo) {
        "comum" -> convite.codigo.startsWith("xt")
        "luxo", "premium" -> convite.codigo.startsWith("xl")
        else -> false
    }
}