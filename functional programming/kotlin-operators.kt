fun main(){
    /*Operators
    i)Arithmatic Operators
    ii)Assignment Operators
    iii)Comparison Operators
    iv)Logical Operators 
     */

     // Arithmatic Operators
     var A:Byte=120
     var B:Byte=4
     //Addition
     println(A+B)
     //Subtraction
     println(A-B)
     //Multiplication
     println(A*B)
     //Division
     println(A/B)
     //Modulus---remainder of (x/y)
     println(A%B)
     //Increment
     println(++A)
     println(A++)
     //Decrement
     println(--A)
     println(A--)
     println(A)

     //Assignment Operator

    var R:Int=A.toInt() 
    R+=5 //Add And
    R-=5 //Subtract And
    R*=5 //Multiply And
    R/=5 //Divide And
    R%=5 //Modulus and
    println(R)
    
    // Comparison Operators
    val S=45
    val T=47
    println(S==T)
    println(S!=T)
    println(S>T)
    println(S<T)
    println(S>=T)
    println(S<=T)

    //Logical Operators
    val U=54
    val V=78
    if(U<100 && V<100){
        println(" Both is Less than 100")
    }
    else if(U>100 && V>100){
        println(" Both is Greater than 100")
    }

    val W=78
    val X=107
    if(W>100 || X>100){
        println("Anyone is greater than 100")
    }
    else{
        println("Nothing")
    }
    val bool:Boolean=true
    println(!bool)
}