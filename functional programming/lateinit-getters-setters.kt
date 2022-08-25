fun  main(){
    var BMW=car()
    println(BMW.owner)

}
class car(){
    lateinit var owner:String
    init{
        this.owner="Arijit"
    }

}