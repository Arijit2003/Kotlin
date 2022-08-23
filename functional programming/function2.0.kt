fun main(){
    //1
    myfunc()
    var x=5
    var y=6
    var result=add_To(x,y)
    var res=add_To(10,7)
    println(result + res)
    var avg:Double=average(x,y)
    println("AVerage is $avg")
}
fun myfunc(){
    println("My function executed")
}

fun add_To(a:Int,b:Int):Int{
    return a+b
}
fun average(a:Int,b:Int):Double{
    return ((a+b)/2).toDouble()
}