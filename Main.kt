//Calculadora Descuento
class Descuento {
    var monto: Double = 0.0
    // definimos los descuentos con un if
    fun calcularDescuento(): Double {
        if (monto < 1000) {
            return 0.0
        } else if (monto < 3000) {
            return monto * 0.10
        } else {
            return monto * 0.20
        }
    }
    fun totalAPagar(): Double{
        return monto - calcularDescuento()

    }
}
fun main (){
    val compra = Descuento()
    compra.monto = 3200.0
    println(compra.calcularDescuento()) // 640.0
    println(compra.totalAPagar())       // 2560.0
}
//---------------------------------------------------------------------------
class Evaluador{
    var calificacion: Int = 0
    fun resultado(): String{
        if (calificacion < 6){
            return "Reprobado"
        }else if (calificacion <= 7){
            return "Suficiente"
        }else if(calificacion <= 9){
            return "Bueno"
        }else {
            return "Excelente"
        }
    }
}
fun main() {
    val eval = Evaluador()
    eval.calificacion = 8
    println(eval.resultado()) // Bueno
}
//--------------------------------------------------------------------------
class Propina {
    var consumo: Double = 0.0

    fun calcularPropina(): Double {
        if (consumo < 500) {
            return consumo * 0.05
        } else if (consumo <= 1000) {
            return consumo * 0.10
        } else {
            return consumo * 0.15
        }
    }

    fun totalConPropina(): Double {
        return consumo + calcularPropina()
    }
}
fun main () {
    val cuenta = Propina()
    cuenta.consumo = 800.0
    println(cuenta.calcularPropina())   // 80.0
    println(cuenta.totalConPropina())   // 880.0
}
//---------------------------------------------------------------------------
class ValidadorEdad{
    var edad:Int = 0
    fun categoria():String{
        if (edad < 18){
            return "Menor de edad"
        }else if (edad < 65){
            return "Adulto"
        }else{
            return "Adulto mayor"
        }
    }
}
fun main() {
    val persona = ValidadorEdad()
    persona.edad = 70
    println(persona.categoria()) // Adulto mayor
}
//--------------------------------------------------------------------------
class Comparador{
    var numero1:Int = 0
    var numero2:Int = 0

    fun comparar(): String {
        if (numero1 > numero2) {
            return "Numero1 es mayor"
        } else if (numero2 > numero1) {
            return "Numero2 es mayor"
        } else {
            return "Son iguales"
        }
    }
}
fun main() {
    val comp = Comparador()
    comp.numero1 = 10
    comp.numero2 = 10
    println(comp.comparar()) // Son iguales
}

