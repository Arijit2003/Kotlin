fun main(){
    var arijit:Person=Person("Arijit","Modak")
    var braj:Person=Person()
    var lb:Person=Person(firstname="Praveen")

}
class Person(firstname:String="Braj Kishore",lastname:String="Sharma"){
    //initializer block
    init{
        println("Person is created whose name is ${firstname} ${lastname} ")

    }
    
}