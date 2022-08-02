fun factorial(I:Int):Int{
    var mul=1
    for(i in 1..I){
        mul*=i
    }
    return mul
}
fun main(){
    var V:Int=5
    var r=factorial(V)
    println(r)
}
