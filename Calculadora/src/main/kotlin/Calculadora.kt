import java.util.*

class Calculadora {

}

fun main(){
    println("=====================")
    println("Super calculator 2000")
    println("=====================")

    while(true)
    {
        do {
            println("Informe a operação desejada: \n" +
                    "1 - Soma \n2 - Subtracao\n3 - Multiplicacao \n" +
                    "4 - Divisao\n5 - Fatorial \n0 - Sair")

            var sc = Scanner(System.`in`)
            var op = sc.nextInt()
            var scanner = Scanner(System.`in`)
            when (op){
                1 -> {
                    println("Informe o valor N1: ")
                    var n1 = scanner.nextDouble()
                    println("Informe o valor N2")
                    var n2 = scanner.nextDouble()
                    println("$n1 + $n2 = " + soma(n1, n2))
                }
                2 -> {
                    println("Informe o valor N1: ")
                    var n1 = scanner.nextDouble()
                    println("Informe o valor N2")
                    var n2 = scanner.nextDouble()
                    println("$n1 - $n2 = " + subtracao(n1, n2))
                }
                3 -> {
                    println("Informe o valor N1: ")
                    var n1 = scanner.nextDouble()
                    println("Informe o valor N2")
                    var n2 = scanner.nextDouble()
                    println("$n1 * $n2 = " + mult(n1, n2))
                }
                4 -> {
                    println("Informe o valor N1: ")
                    var n1 = scanner.nextDouble()
                    println("Informe o valor N2")
                    var n2 = scanner.nextDouble()
                    println("$n1 / $n2 = " + div(n1, n2))
                }
                5 -> {
                    println("Informe o valor:")
                    var n1 = scanner.nextDouble()
                    println("Fatorial de $n1 = " + fat(n1))
                }
                0 -> {
                    println("Finalizando programa")
                    System.exit(0)
                }
            }

        } while (op < 0 || op > 5)

    }

}

fun soma(n1:Double, n2:Double):Double{
    return (n1 + n2)
}

fun subtracao(n1:Double, n2:Double):Double{
    return (n1 - n2)
}

fun mult(n1:Double, n2:Double):Double{
    return (n1 * n2)
}

fun div(n1:Double, n2:Double):Double{
    return (n1 / n2)
}

fun fat(n1:Double):Double {
    var res = n1
    for (i in n1.toInt()-1 downTo 1)
    {
        res = res * i
    }
    return res
}