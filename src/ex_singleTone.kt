object bank {
    var money=100000

    fun withDrawMoney(value:Int):Int
    {    money -=value
        return money
    }

}

fun main()
{
    var withdraw=59000
    println(bank.withDrawMoney(withdraw))
}