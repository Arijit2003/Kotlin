fun main(){
    var m=12
    var n=4
    var result=gcd(m,n)
    println(result)
}
fun gcd(m:Int,n:Int):Int{
    var a:Int
    var b=m
    var c=n
    while(c>0){
        a=b
        b=c
        c=a%c
    }
    return b
}