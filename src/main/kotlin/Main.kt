import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    var m = Array(4) { Array<Int>(4) { Random.nextInt(1, 9)} }
    var sumaFilas = ints(m)
    var sumaColum = Array(m[0].size){0}


    extracted(m, sumaFilas)

    sumaColumnas(m,sumaColum)
    println("La suma de las filas es")
    println(Arrays.toString(sumaFilas))
    println("La suma de las columnas es")
    println(Arrays.toString(sumaColum))


}

private fun extracted(m: Array<Array<Int>>, sumaFilas: Array<Int>) {
    for (f in m.indices) {
        for (c in m[f].indices) {
            print("${m[f][c]} ")
        }
        println()
    }
    var f: Int = 0
    var c: Int = 0

    while (f < m.size) {
        while (c < m[0].size) {
            sumaFilas[f] += m[f][c]
            c++
        }
        c = 0
        f++
    }
}

private fun ints(m: Array<Array<Int>>): Array<Int> {
    var sumaFilas = Array(m.size) { 0 }
    return sumaFilas
}


fun sumaColumnas (m:Array<Array<Int>>, sumaColumnas:Array<Int>){
    var f: Int = 0
    var c: Int = 0

    while (c < m.size){
        while (f < m[0].size){
            sumaColumnas[c] += m[f][c]
            f++
        }
        f = 0
        c++
    }

    print(sumaColumnas)
    fun sumaNumeros(){
        print("Escribe dos numeros")
        var a = readln().toInt()
        var b = readln().toInt()
        var c = a+b
    }
}