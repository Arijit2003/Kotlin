fun main(){
    var felt_temp="cold"
    var room_temp=5
    while(felt_temp=="cold"){
        room_temp++
        if(room_temp>=27){
            felt_temp="Comfy"
            println("Now the room temperature is comfortable")
        }
    }

}