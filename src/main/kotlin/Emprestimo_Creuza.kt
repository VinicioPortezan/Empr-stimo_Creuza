fun main(){
    print("Qual o valor do empréstimo? R$")
    val emprestimo = readln().toDouble()
    print("Quantas parcelas? ")
    val parcelas = readln().toInt()
    val imposto = calculoImposto(emprestimo, parcelas)
    val impostoFormatado = String.format("%.2f",imposto)
    print("Vou pagar $parcelas parcelas de R$$impostoFormatado")

}
fun calculoImposto(emprestimo:Double,parcelas:Int):Double {
    return (emprestimo + ((emprestimo * 20) / 100)) / parcelas

}