class Persona(val peso: Double, var altura: Double) {
    var nombre:String = ""
    val imc:Double = (altura*altura)/peso

    override fun toString(): String {
        return "Nombre: $nombre, Peso: $peso, Altura: $altura, IMC: $imc"
    }

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }
}

/* Funcion para pedir y modificar nombre Persona 1 */
fun pedirNombre(): String {
    var nombre: String? = null
    do{
        println("Introduce nuevo nombre para Persona1: ")
        val entrada:String? = readLine()?.trim()
        if (entrada != null && entrada.isNotBlank() && entrada.all {it -> it.isLetter()}){
            nombre = entrada
        } else {
            println("Entrada Inválida")
        }
    } while(nombre == null)
    return nombre
}

fun main() {
    val persona1 = Persona(60.0, 1.70)
    val persona2 = Persona("Juan",70.0, 1.75)
    val persona3 = Persona("Pepe",80.0, 1.80)
    println("===Personas INICIALES===")
    println(persona1)
    println(persona2)
    println(persona3)
    persona1.nombre = pedirNombre()
    println("Nombre: ${persona1.nombre}, Peso : ${persona1.peso}, Altura: ${persona1.altura}")
    println("Peso : ${persona3.peso}, Altura: ${persona3.altura}, IMC: ${persona3.imc}")
    persona3.altura = 1.80
    println("Peso: ${persona3.peso}, Altura: ${persona3.altura}, IMC: ${persona3.imc}")
    persona2.altura = persona3.altura
    println(persona2)
    println(persona3)
    if (persona2.nombre == persona3.nombre && persona2.peso == persona3.peso && persona2.altura == persona3.peso){
        println("Las personas 2 y 3 son IGUALES")
    } else {
        println("Las personas 2 y 3 son DIFERENTES")
    }
}