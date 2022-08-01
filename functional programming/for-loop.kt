fun main(){
    for(i in 1..10){
        print("$i ")
    }
    println("\n***********")
    for(j in 1 until 10){  // Same as - for(i in 1.until(10))
        print("$j ")
    }
    println("\n***********")
    for(k in 10 downTo 1){
        print("$k ")
    }
    println("\n***********")
    for(l in 10 downTo 1 step 2){ // Same as - for(i in 10.downTo(1))
        print("$l ")
    }
    println("\n***********")
    for(m in 1..10 step 2){ // Same as - for(i in 1.until(10).step(2))

        print("$m ")
    }
    
}