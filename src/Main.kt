import java.util.stream.IntStream.range

fun main(args: Array<String>) {


var inicio=0
var fin=10
var sumaPares=0
var sumaImpares=0


for(i in range(inicio,fin)){
    if(i%2==0)
        sumaPares+=i
    else
        sumaImpares+=i



}
    println("Bucle FOR: ")
    println("Suma de números pares: "+sumaPares)
    println("Suma de números impares: "+sumaImpares)


    sumaPares=0
    sumaImpares=0
    range(inicio,fin).forEach {
        if(it%2==0) {
            sumaPares += it
        }
        else {
            sumaImpares += it
        }

    }

    println("\n")
    println("Bucle FOR EACH: ")
    println("Suma de números pares: "+sumaPares)
    println("Suma de números impares: "+sumaImpares)

    var contador=0
    sumaPares=0
    sumaImpares=0


    while(contador<fin){
        if(contador%2==0) {
            sumaPares += contador
            contador++
        }
        else {
            sumaImpares += contador
            contador++
        }
    }

    println("\n")
    println("Bucle WHILE: ")
    println("Suma de números pares: "+sumaPares)
    println("Suma de números impares: "+sumaImpares)

    sumaPares=0
    sumaImpares=0
    contador=0
    do{


        if(contador%2==0) {
            sumaPares += contador
            contador++
        }
        else {
            sumaImpares += contador
            contador++
        }

    }while(contador<fin)

    println("\n")
    println("Bucle DO WHILE: ")
    println("Suma de números pares: "+sumaPares)
    println("Suma de números impares: "+sumaImpares)

}


/*

Ejercicio 2

var numero1 : Int? = 5

var numero2 = 5

var numero3 : Int = 5

La diferencia entre la forma de inicializar las variables es que en numero1 la variable puede tomar el valor null
y en numero3 esta forzando a la variable a ser un integer

El riesgo que nos encontramos es que en el numero1 haya un null

De los nulls nos protegemos con un .let o haciendo un if(numero1!=null)

* */