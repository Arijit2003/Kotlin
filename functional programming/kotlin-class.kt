package com.example.hello

fun main(){
    val ph1=MobilePhone("Android","Samsung","A22")
    ph1.chargeBattery(30)
}
class MobilePhone(osName:String,brand:String,model:String){
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
    private var battery:Int=45
    fun chargeBattery(charged:Int){
        println("previously the battery was ${battery}%")
        println("${charged}% has charged")
        println("Right now the battery is ${battery+charged}%")
        battery+=charged
    }
}