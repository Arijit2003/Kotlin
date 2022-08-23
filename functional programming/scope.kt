var b=8 // Global variable
fun main(){
    b=13
    myfunc(5)
    
}
//here 'a' is the parameter  and parameters are immutable variable
fun myfunc(a:Int){
    //here 'a' is variable
    var a=6
    
    println(" value of the variable a is $a and value of b is ${b}")//variable; value will be printed not the parameter's
}