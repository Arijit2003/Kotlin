package com.example.hello

import android.renderscript.Matrix4f
import java.lang.IllegalArgumentException

fun main(){
    var c1=Car()
    println(c1.owner)
    println(c1.brand)
    //c1.maxspeed=-56
    c1.maxspeed=150
    println(c1.maxspeed)
    //c1.model="M3" //can not assign "M3" to c1.model because the setter is private in car class
    println(c1.model)
}
class Car(){
    lateinit var owner:String
    init {
        this.owner="Arijit"
    }
    var brand:String="BMW"
    //custom getters
    get(){
        return field.toLowerCase()
    }
    //default setters
    set(value) {
        field=value
    }
    var maxspeed:Int=250
    //default getters
    get()=field
    //custom setters
    set(value){
        field=if(value>=0) value else throw IllegalArgumentException("Maximum speed can never be 0")
    }
    var model:String="M4"
    private set
    init {
        this.model="M3"
    }


}