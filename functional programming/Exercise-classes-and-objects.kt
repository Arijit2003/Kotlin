fun main(){
    var Samsung_Galaxy_S20_Ultra=MobilePhone("Android","Samsung","Galaxy S20 Ultra")
    var Samsung_Galaxy_A22=MobilePhone("Android","Samsung","Galaxy A22")
    var Pixel_4a=MobilePhone("Android","Pixel","4a")

}
class MobilePhone(osName:String,brand:String,model:String){
    //initializer block
    init{
        println("OS name is ${osName}, brand is ${brand} and model is ${model}")
    }
}