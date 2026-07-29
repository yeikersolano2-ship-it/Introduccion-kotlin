/**
 * Ejercicios de Kotlin consolidados en un solo archivo interactivo.
 * Se define la función main() con un menú y cada ejercicio como una función independiente.
 */

fun main() {
    var continuar = true

    while (continuar) {
        println("\n==========================================")
        println("       MENÚ PRINCIPAL DE EJERCICIOS       ")
        println("==========================================")
        println("1. Hola Mundo")
        println("2. Declaración e Impresión de Variables")
        println("3. Entrada de Datos por Consola")
        println("4. Calculadora Básica")
        println("5. Condicional if-else (Mayoría de Edad)")
        println("6. Control de Flujo con when (Menú)")
        println("7. Tabla de Multiplicar (Ciclo for)")
        println("8. Mini Reto - Promedio de Estudiante")
        println("0. Salir")
        println("==========================================")
        print("Selecciona una opción (0-8): ")

        val opcion = readlnOrNull()?.toIntOrNull() ?: -1

        println() // Línea en blanco para separar la salida

        when (opcion) {
            1 -> ejercicio1()
            2 -> ejercicio2()
            3 -> ejercicio3()
            4 -> ejercicio4()
            5 -> ejercicio5()
            6 -> ejercicio6()
            7 -> ejercicio7()
            8 -> ejercicio8()
            0 -> {
                println("¡Programa finalizado!")
                continuar = false
            }
            else -> println("Opción no válida, por favor intenta de nuevo.")
        }
    }
}

// -------------------------------------------------------------
// FUNCIONES DE CADA EJERCICIO
// -------------------------------------------------------------

fun ejercicio1() {
    println("--- EJERCICIO 1: Hola Mundo ---")
    println("Bienvenidos al curso de Kotlin")
}

fun ejercicio2() {
    println("--- EJERCICIO 2: Declaración e Impresión de Variables ---")
    val nombre = "Ana"
    var edad = 20
    val ciudad = "Bogotá"
    var estatura = 1.65
    val estudiante = true

    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Ciudad: $ciudad")
    println("Estatura: $estatura m")
    println("¿Es estudiante?: $estudiante")
}

fun ejercicio3() {
    println("--- EJERCICIO 3: Entrada de Datos por Consola ---")
    print("Nombre: ")
    val nombre = readln()

    print("Edad: ")
    val edad = readln().toIntOrNull() ?: 0

    print("Carrera: ")
    val carrera = readln()

    println("\nHola, $nombre")
    println("Tienes $edad años")
    println("Estudias $carrera")
}

fun ejercicio4() {
    println("--- EJERCICIO 4: Calculadora Básica ---")
    print("Ingresa el primer número: ")
    val a = readln().toDoubleOrNull() ?: 0.0

    print("Ingresa el segundo número: ")
    val b = readln().toDoubleOrNull() ?: 0.0

    println("\nSuma: ${a + b}")
    println("Resta: ${a - b}")
    println("Multiplicación: ${a * b}")
    if (b != 0.0) {
        println("División: ${a / b}")
        println("Módulo (Residuo): ${a % b}")
    } else {
        println("División: No se puede dividir entre cero")
    }
}

fun ejercicio5() {
    println("--- EJERCICIO 5: Condicional if-else ---")
    print("Ingresa tu edad: ")
    val edad = readln().toIntOrNull() ?: 0

    if (edad >= 18) {
        println("Mayor de edad")
    } else {
        println("Menor de edad")
    }
}

fun ejercicio6() {
    println("--- EJERCICIO 6: Control de Flujo con when ---")
    println("1. Ver perfil")
    println("2. Editar datos")
    println("3. Cerrar sesión")
    print("Selecciona una opción: ")

    val opcion = readln().toIntOrNull() ?: 0

    when (opcion) {
        1 -> println("Opción seleccionada: Ver perfil")
        2 -> println("Opción seleccionada: Editar datos")
        3 -> println("Opción seleccionada: Cerrar sesión")
        else -> println("Opción inválida")
    }
}

fun ejercicio7() {
    println("--- EJERCICIO 7: Tabla de Multiplicar ---")
    print("Número: ")
    val n = readln().toIntOrNull() ?: 0

    println("\nTabla del $n:")
    for (i in 1..10) {
        println("$n x $i = ${n * i}")
    }
}

fun ejercicio8() {
    println("--- EJERCICIO 8: Mini Reto - Promedio de Estudiante ---")
    print("Nombre del estudiante: ")
    val nombre = readln()

    print("Ingrese la nota 1: ")
    val nota1 = readln().toDoubleOrNull() ?: 0.0

    print("Ingrese la nota 2: ")
    val nota2 = readln().toDoubleOrNull() ?: 0.0

    print("Ingrese la nota 3: ")
    val nota3 = readln().toDoubleOrNull() ?: 0.0

    val promedio = (nota1 + nota2 + nota3) / 3

    println("\nEstudiante: $nombre")
    println("Promedio: $promedio")

    if (promedio >= 6.0) {
        println("Estado: Aprobado")
    } else {
        println("Estado: Reprobado")
    }
}