fun main(){
    val greeting:String="Hello World" //Declaration  + Assignment 
    val name:String //Declaration
    name="Arijit" //Assignment
    // Accessing a string part
    println(greeting[4])
    println(name[5])
    // String Length
    val X:String="ABCDEFGHIJKLMNOP"
    println("Length of the string X is:"+X.length)

    //String Functions
    println(name.toUpperCase())
    println(name.toLowerCase())
    
    // Comparing Strings  ---if output is 0 then same and if output is 1 then different
    val Y="Jello World"
    val Z="Jello World"
    println(Y.compareTo(Z))

    // Finding a substring
    val txt="Please locate where 'locate' occurs!"
    println(txt.indexOf("locate"))

    // String Concatenation
    val gt="Arijit"
    val bt="Modak"
    println(gt+" "+bt)
    println(gt.plus(bt))

    //String Interpolation/Templates
    println("My name is ${gt} ${bt}")
}