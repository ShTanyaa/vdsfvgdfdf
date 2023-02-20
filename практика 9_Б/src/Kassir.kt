package zd_kassa
open class Kassir(var station:String,var time:String,var data:String,var cost:Int){
    open fun IsOver(){
        if(cost<10) println("счет не оплачен")
        else println("счет оплачен")
    }


}