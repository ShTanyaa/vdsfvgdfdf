import zd_kassa.*
class Train(var kol_vagonov:Int,var empstation:String,var emptime:String,var empdata:String,var empcost:Int):Kassir(empstation,emptime,empdata,empcost) {
    open fun vagonn(){
        println("количество вагонов в поезде-${kol_vagonov}")
    }
    open fun type_poezdd(){
        if(kol_vagonov>15) println("это грузовой поезд")
    }
}