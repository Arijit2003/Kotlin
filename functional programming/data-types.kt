fun main(){
    /*Int, Double, Char, Boolean, String */
    val A:Int=65
    val B:Double=4.56
    val C:Char='A'
    val D:Boolean=true
    val E:String="Hey Arijit"
    println(A)
    println(B)
    println(C)
    println(D)
    println(E)
    //Types of Int
    /*
    i)  Byte: -128 to 127
    ii) Short: -32768 to 32767
    iii)Int: -2147483648 to 2147483647
    iv)Long: -9223372036854775807 to 9223372036854775807
     */

    // Types of floating point
    /*
    i)Float (6 to 7 digits after decimal point)
    ii)Double(upto 15 digits after decimal point)
    */
    val F:Float=7.56F
    println(F)
    val G:Double=4.56
    println(G)
    val H:Double=4.47852E7
    println(H)

    //Boolean
    val I:Boolean=true
    val J=false
    println(I)
    println(J)

    // Char
    val K:Char='L'
    println(K)

    // String
    val L:String="Hey Arijit"
    println(L)

    // Type Conversion 
    val M:Int=78
    /* val N:Long=M   //type mismatch: inferred type is Int but Long was expected  */
    val N:Long=M.toLong()
    println(N)
    

}