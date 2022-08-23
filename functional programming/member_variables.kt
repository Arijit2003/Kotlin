package com.example.hello

fun main(){
    var per1=person("Rahul","Ghosh",19,5.5F,"playing cricket")
    per1.about()
    var per2=person()
    per2.about()
}
class person(firstname:String="Arijit",lastname:String="Modak"){


    /* Member Variables= Properties*/
    var firstname:String?=null
    /*Initializer BLock*/
    init {
        println("A person is created with the firstname=$firstname and lastname=$lastname")
        this.firstname= firstname
    }
    /* Member Variables= Properties*/
    var age:Int?=null
    var height:Float?=null
    var hobby:String?=null

    /* Member Functions = Methods */

    /* secondary constructor*/
    constructor(firstname:String,lastname:String,age:Int,height:Float,hobby:String):this(firstname,lastname){
        this.age=age
        this.height=height
        this.hobby=hobby
    }

    fun about(){
        println("$firstname\'s age is $age , height is $height and hobby is $hobby ")
    }
}