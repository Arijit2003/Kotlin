fun main(){
    val x=45
    val y=46
    val z=49
    if(x>y && y>z){
        println("x is greater")
    }
    else if(y>x && y>z){
        println("y is greater")
    }
    else{
        println("z is greater")
    }
    val time=20
    val result=if(time>20){
        "Good"
    }else{
        "bad"
    }
    println(result)
    val res=if(time<=20)"Hey" else "Nice"
    println(res)  

}