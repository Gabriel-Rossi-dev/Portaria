package control

class Console private constructor() {

    companion object{

        fun readInt(msg: String): Int {
            var idade: Int? = null
            do {
                print(msg)

                val info = readLine()

                if (info != null && info != "") {
                    idade = info.toIntOrNull()

                    if (idade == null || idade <= 0) {
                        println("Valor inválido")
                    }
                } else {
                    "Valor inválido"
                }

            } while (idade == null || idade <= 0)
            return idade
        }

        fun readString(msg: String): String {
            var code: String? = null
            do {
                println(msg)
                val info = readLine()

                if (info != null && info != "") {
                    code = info.lowercase()
                }else{
                    println("Valor inválido")
                }
            }while (code == null)
            return code
        }
    }
}


