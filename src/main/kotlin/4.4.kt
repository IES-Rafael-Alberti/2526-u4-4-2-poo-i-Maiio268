class Coche(var color: String?, val marca: String?, val modelo: String?, val numeroCaballos: Int?, val numeroPuertas: Int?, val matricula: String?) {
    init {
        require(!marca.isNullOrBlank()) {"Marca no puede ser nulo ni vacío"}
        require(!modelo.isNullOrBlank()) {"Modelo no puede ser nulo ni vacío"}
        require(numeroCaballos != null) {"Numero de caballos no puede ser nulo"}
        require(numeroPuertas != null) {"Numero de puertas no puede ser nulo"}
        require(matricula != null) {"Matricula no puede ser nulo"}
        require(color != null) {"Color no puede ser nulo"}
        require(matricula.length == 7) {"Matricula debe tener 7 caracteres"}
        require(numeroCaballos in 70..700) {"Numero de caballos debe estar entre 70-700"}
        require(numeroPuertas in 3..5) {"Numero de puertas debe estar entre 3-5"}
    }
    override fun toString(): String {
        return "Color: $color, Marca: $marca, Modelo: $modelo, Numero Caballos: $numeroCaballos, Numero Puertas: $numeroPuertas, Matricula: $matricula"
    }

}

fun main() {
    /* Marca vacío */
    println("===COCHE1===")
    try{
        val coche1 = Coche("Rojo", "", "s5", 500, 4, "5678XYZ")
    } catch (e: Exception) {
        println(e.message)
    }
    /* Modelo null */
    println("===COCHE2===")
    try{
        val coche2 = Coche("Rojo", "Ferrari", null, 500, 4, "5678XYZ")
    } catch (e: Exception) {
        println(e.message)
    }
    /* NumeroCaballos fuera del rango */
    println("===COCHE3===")
    try{
        val coche3 = Coche("Rojo", "Ferrari", "s5", 1000, 4, "5678XYZ")
    } catch (e: Exception) {
        println(e.message)
    }
    /* NumeroPuertas fuera del rango */
    println("===COCHE4===")
    try{
        val coche4 = Coche("Rojo", "Ferrari", "s5", 500, 7, "5678XYZ")
    } catch (e: Exception) {
        println(e.message)
    }
    /* Matricula sin cumplir 7 caracteres */
    println("===COCHE5===")
    try{
        val coche5 = Coche("Rojo", "Ferrari", "s5", 500, 7, "234")
    } catch (e: Exception) {
        println(e.message)
    }
    /* Color nulo */
    println("===COCHE6===")
    try{
        val coche6 = Coche(null, "Ferrari", "s5", 500, 7, "234")
    } catch (e: Exception) {
        println(e.message)
    }
}