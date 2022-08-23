fun main(){
    // Creating an array
    val fruits=arrayOf("mango","guava","orange","banana","grapes")
    //Access the Elements of an Array
    println(fruits[0])
    println(fruits[1])
    //Change an Array Element
    fruits[0]="lichi"
    println(fruits[0])
    //Array Length / Size

    /*val fr="cnjscbscs"
    println(fr.length)*/  //only  for string
    println(fruits.size)

    //Check if an Element Exists
    if("mango" in fruits){
        println("mango Exists")
    }
    else{
        println("mango doesn't exists")
    }

    if("guava" in fruits){
        println("guava exists")
    }
    else{
        println("guava doesn't exists")
    }

    //Loop Through an Array
    for(i in fruits){
        println(i)
    }

}