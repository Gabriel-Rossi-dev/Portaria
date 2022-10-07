package business

import entity.Convidado

class ConvidadoBusiness {

    fun maiorDeIdade(idade: Int) = idade >= 18

    fun tipoValido(tipo: String) = (tipo == "comum" || tipo == "premium" || tipo == "luxo")

    fun convidadoValido(convidado: Convidado) = when (convidado.tipo) {
        "comum" -> convidado.codigo.startsWith("xt")
        "luxo", "premium" -> convidado.codigo.startsWith("xl")
        else -> false
    }
}