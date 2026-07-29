#  Ejercicios básicos de Kotlin con menú interactivo

##  Descripción del proyecto

Este proyecto contiene una colección de **8 ejercicios básicos desarrollados en Kotlin** dentro de un solo programa interactivo.

El programa funciona mediante un **menú principal**, donde el usuario puede seleccionar qué ejercicio desea ejecutar. Cada ejercicio está separado en una función independiente para mantener el código organizado y fácil de comprender.

El objetivo de la actividad es practicar los fundamentos principales de Kotlin:

- Variables y tipos de datos.
- Entrada de información por consola.
- Conversión de datos.
- Operaciones matemáticas.
- Condicionales `if-else`.
- Control de flujo con `when`.
- Ciclos `for` y `while`.
- Creación y uso de funciones.

---

#  Funcionamiento del programa

Al iniciar el programa aparece un menú con diferentes opciones:

```

==========================================
MENÚ PRINCIPAL DE EJERCICIOS
============================

1. Hola Mundo
2. Declaración e Impresión de Variables
3. Entrada de Datos por Consola
4. Calculadora Básica
5. Condicional if-else (Mayoría de Edad)
6. Control de Flujo con when (Menú)
7. Tabla de Multiplicar (Ciclo for)
8. Mini Reto - Promedio de Estudiante
9. Salir
   ==========================================

```

El usuario selecciona una opción ingresando un número del 0 al 8.

El programa ejecuta el ejercicio seleccionado y luego vuelve al menú principal hasta que el usuario seleccione la opción **0 (Salir)**.

---

#  Tecnologías utilizadas

- **Lenguaje:** Kotlin
- **Entorno de desarrollo:** IntelliJ IDEA
- **Tipo de aplicación:** Consola
- **Control de versiones:** Git y GitHub

---

#  Estructura del proyecto

```

Proyecto-Kotlin
│
├── Main.kt
│
└── README.md

````

El archivo `Main.kt` contiene:

- La función principal `main()`.
- El menú interactivo.
- Las funciones correspondientes a cada ejercicio.

---

#  Explicación de los ejercicios

## 1. Hola Mundo

Muestra un mensaje en pantalla utilizando la función:

```kotlin
println()
````

Ejemplo:

```
Bienvenidos al curso de Kotlin
```

---

## 2. Declaración e impresión de variables

Permite trabajar con diferentes tipos de datos:

```kotlin
val nombre = "Ana"
var edad = 20
val estudiante = true
```

Tipos utilizados:

* `String` → Texto.
* `Int` → Números enteros.
* `Double` → Números decimales.
* `Boolean` → Valores verdadero o falso.

Salida:

```
Nombre: Ana
Edad: 20
Ciudad: Bogotá
Estatura: 1.65 m
¿Es estudiante?: true
```

---

## 3. Entrada de datos por consola

El usuario ingresa información desde el teclado usando:

```kotlin
readln()
```

Ejemplo:

```
Nombre: Carlos
Edad: 22
Carrera: Ingeniería
```

Resultado:

```
Hola, Carlos
Tienes 22 años
Estudias Ingeniería
```

---

## 4. Calculadora básica

Realiza operaciones matemáticas entre dos números:

* Suma.
* Resta.
* Multiplicación.
* División.
* Módulo.

Ejemplo:

Entrada:

```
Primer número: 10
Segundo número: 2
```

Salida:

```
Suma: 12
Resta: 8
Multiplicación: 20
División: 5
Módulo: 0
```

También controla el caso de división entre cero:

```
División: No se puede dividir entre cero
```

---

## 5. Mayoría de edad

Utiliza una estructura condicional:

```kotlin
if - else
```

Ejemplo:

Entrada:

```
Edad: 20
```

Salida:

```
Mayor de edad
```

Si la edad es menor:

```
Menor de edad
```

---

## 6. Menú con estructura when

Permite seleccionar acciones utilizando:

```kotlin
when()
```

Ejemplo:

```
1. Ver perfil
2. Editar datos
3. Cerrar sesión

Selecciona una opción: 1
```

Resultado:

```
Opción seleccionada: Ver perfil
```

---

## 7. Tabla de multiplicar

Utiliza un ciclo:

```kotlin
for
```

para generar una tabla del número seleccionado.

Ejemplo:

Entrada:

```
Número: 5
```

Salida:

```
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
```

---

## 8. Promedio de estudiante

Permite ingresar tres notas y calcular el promedio.

Fórmula utilizada:

```
promedio = (nota1 + nota2 + nota3) / 3
```

Ejemplo:

Entrada:

```
Nombre: Juan
Nota 1: 8
Nota 2: 7
Nota 3: 9
```

Salida:

```
Estudiante: Juan
Promedio: 8.0
Estado: Aprobado
```

Si el promedio es menor:

```
Estado: Reprobado
```

---

#  Conceptos aprendidos

Durante el desarrollo del proyecto se practicaron conceptos fundamentales de Kotlin:

## Variables

Uso de:

```kotlin
val
var
```

`val` para valores que no cambian.

`var` para valores modificables.

---

## Funciones

Cada ejercicio fue separado en una función:

```kotlin
fun ejercicio1()
fun ejercicio2()
```

Esto permite tener un código más limpio y organizado.

---

## Condicionales

Se utilizaron:

```kotlin
if-else
```

para tomar decisiones.

Ejemplo:

```kotlin
if (edad >= 18)
```

---

## Control de flujo

Se utilizó:

```kotlin
when
```

para manejar diferentes opciones del menú.

---

## Ciclos

Se aplicaron:

```kotlin
while
```

para repetir el menú.

```kotlin
for
```

para generar la tabla de multiplicar.

---

#  Cómo ejecutar el proyecto

1. Abrir el proyecto en IntelliJ IDEA.
2. Abrir el archivo:

```
Main.kt
```

3. Ejecutar la función:

```kotlin
main()
```

4. Seleccionar una opción del menú.

---

# 📸 Capturas de ejecución



<img width="363" height="318" alt="image" src="https://github.com/user-attachments/assets/191bfc3c-60dc-4e43-9306-3649e8c649e2" />


