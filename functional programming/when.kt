fun main(){
    //when is as similar as switch case
    val day_no=4
    val day=when(day_no){
        1->"Monday"
        2->"Tuesday"
        3->"Wednesday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        else->"invalid day no."
    }
   
    println(day)
}