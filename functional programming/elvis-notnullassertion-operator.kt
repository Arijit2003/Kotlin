fun main(){
    var nullable_name:String?="Modak"
    //nullable_name=null
    //elvis operator  ?:
    val name:String=nullable_name?:"Guest" //if 'nullable_name' is null then assign Guest to 'name' otherwise assign the value of 'nullable_name' to name
    println(name)

    //Not null assertion operator(symbol-----  !!)   // basically it is used to convert any nullable variable to not null type variable
    var surname=nullable_name!!
    println(nullable_name!!.toUpperCase())


}