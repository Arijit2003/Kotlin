package com.example.hello

fun main(){
    var user1:User=User(1,"Arijit",19)
    print("id = ${user1.id}")
    print(" Name: ${user1.name}  Age: ")
    println(user1.age)
    user1.name="Rahul"
    println(" Name: ${user1.name}")

    val user2=User(2,"Devansh",19)
    print("id = ${user2.id}")
    print(" Name: ${user2.name}  Age: ")
    println(user2.age)

    // copy one object to another
    val user3:User=user2.copy(id = 3, name = "Braj")
    print("id = ${user3.id}")
    print(" Name: ${user3.name}  Age: ")
    println(user3.age)

    //checking  equality
    println(user1==user2)
    println(user1.component1())
    println(user1.component2())
    val (id,name,age)=user1
    println(id)
    println(name)
    println(age)


}
data class User(var id:Int,var name:String, var age:Int)
