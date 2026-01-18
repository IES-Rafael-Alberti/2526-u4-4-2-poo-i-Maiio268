class Rectangulo(val base: Double, val altura: Double) {
    init {
        require(base > 0.0) {"La base tiene que ser mayor que 0"}
        require(altura > 0.0) {"La altura tiene que ser mayor que 0"}
    }

    fun calcularArea(): Double {
        val area: Double = base*altura
        return area
    }

    fun calcularPerimetro(): Double {
        val perimetro: Double = base*2 + altura*2
        return perimetro
    }
    override fun toString(): String {
        return "Base--> $base, Altura--> $altura, Área=${calcularArea()}, Perímetro=${calcularPerimetro()}"
    }
}

fun main() {
    val rectangulo1 = Rectangulo(10.0, 20.0)
    val rectangulo2 = Rectangulo(5.0, 12.0)
    val rectangulo3 = Rectangulo(15.0, 4.0)
    /* Printeamos los objetos */
    println(rectangulo1)
    println(rectangulo2)
    println(rectangulo3)
}