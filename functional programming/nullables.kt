fun main(){
    var name:String //Initially garbage is assigned to it
    
    name="Arijit" 
    println(name)
    /*name=null  //null can not be a value of a non-null type String-----compilation error*/
    var nullablename:String?="Arijit"
    println(nullablename)
    //nullablename=null
    //println(nullablename.length)only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // Old method to find the length of a nullable string
    /*var len:Int?=if(nullablename!=null){
        nullablename.length
    }else{
        null
    }
    println(len)*/
    //Latest method to find the length of a nullable string
    var len1=nullablename?.length // As we are assigning a nullable's string's length to a variable len1 so the type of that variable is also a null type
    //var len1:Int?=nullable?.length
    println(len1)

   
    println(nullablename?.toLowerCase()) //if the value of the nullable variable is null then that null can not be converted to lower case thatswhy it showing error
    //nullablename?.let{println(it.toLowerCase())}



}