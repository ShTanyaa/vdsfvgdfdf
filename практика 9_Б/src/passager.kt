import zd_kassa.*
class passager(var kol_biletov:Int,var type_train:String,var empstation:String,var emptime:String,var empdata:String,var empcost:Int):Kassir(empstation,emptime,empdata,empcost) {
open fun bilet(){
    println("количество пассажиров-${kol_biletov}")
}
    open fun type_vagon(){
        println("тип вагона-${type_train}")
    }
}