class PersonaEj3(val nombre: String, val peso: Double, var altura: Double) {
    val imc:Double = (altura*altura)/peso

    override fun toString(): String {
        return "Nombre: $nombre, Peso: $peso, Altura: $altura, IMC: $imc"
    }

    fun saludar(): String {
        return "Hola $nombre!"
    }
    fun alturaEncimaMedia(): Boolean {
        var mensajeAltura: String = ""
        if (altura >= 1.75) {
            return true
        } else {
            return false
        }
    }
    fun pesoEncimaMedia(): Boolean {
        var mensajePeso: String = ""
        if (peso >= 70) {
            return true
        } else {
            return false
        }
    }
    fun mensajeIMC(): String {
        var mensajeImc: String = ""
        if (imc < 18.5) {
            mensajeImc = "Peso insuficiente"
        } else if (imc in 18.5..24.9) {
            mensajeImc = "Peso saludable"
        } else if (imc in 25.0..29.9) {
            mensajeImc = "Sobrepeso"
        } else if (imc > 30.0) {
            mensajeImc = "Obesidad"
        }
        return mensajeImc
    }
}

fun main() {
    val persona1 = PersonaEj3("Roberto", 60.0, 1.70)
    val persona2 = PersonaEj3("Juan",70.0, 1.75)
    val persona3 = PersonaEj3("Pepe",50.0, 1.70)
    val persona4 = PersonaEj3("Inma",85.0, 1.83)
    val persona5 = PersonaEj3("Adrián",100.0, 1.60)
    /* Creo lista con las 5 personas */
    val listaPersonas: List<PersonaEj3> = listOf(persona1, persona2, persona3, persona4, persona5)
    var mensajeAltura = ""
    var mensajePeso = ""
    for (i in listaPersonas) {
        if (i.alturaEncimaMedia()) {
            mensajeAltura = "Por encima de la media"
        } else {
            mensajeAltura = "Por debajo de la media"
        }
        if (i.pesoEncimaMedia()) {
            mensajePeso = "Por encima de la media"
        } else {
            mensajePeso = "Por debajo de la media"
        }
        println(i.saludar())
        println("${i.nombre} con una altura de ${i.altura}m $mensajeAltura y un peso ${i.peso}kg $mensajePeso tiene un IMC de ${i.imc} ${i.mensajeIMC()}")
    }
}