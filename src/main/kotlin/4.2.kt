class Persona(val peso: Double, val altura: Double) {

    constructor(nombreEntrada: String, peso: Double, altura: Double) : this(peso, altura) {
        var nombre = nombreEntrada
    }
}

fun main() {
    val persona1 = Persona(60.0, 1.70)
    val persona2 = Persona("Juan",70.0, 1.75)
    val persona3 = Persona("Pepe",80.0, 1.80)
    println("===Personas INICIALES===")
    println(persona1)
    println(persona2)
    println(persona3)

    /* Pedir y modificar nombre Persona 1 */
    println("Introduce nuevo nombre para Persona1: ")
    var nombreNuevo: String?
    do {
        nombreNuevo = readLine()?.trim()
    } while (nombreNuevo.isBlank())
}