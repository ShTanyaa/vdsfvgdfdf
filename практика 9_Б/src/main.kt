import zd_kassa.Kassir
import  zd_kassa.Kassir as NewKassir
fun main(args:Array<String>){
    var kassir1=Kassir("первомайская","10:25","15.07.2021",150)
    kassir1.IsOver()

    var kassir2=Train(10,"восточная","15:08","10.06.2020",220)
    kassir2.vagonn()
    kassir2.type_poezdd()

    var kassir3=passager(3,"купе","вокзал","18:05","18.11.2022",830)
    kassir3.bilet()
    kassir3.type_vagon()
}