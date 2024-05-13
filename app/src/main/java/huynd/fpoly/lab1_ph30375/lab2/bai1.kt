package huynd.fpoly.lab1_ph30375.lab2

class lab2 {

}

fun main() {

    //bai 1: 1: Nhập 2 số a và b, Viết chương trình giải phương trình bậc 1: ax+b=0
    println("Bai 1: ")
    println("Nhap a: ")
    var a = readLine()!!.toDouble()
    println("Nhap b: ")
    var b = readLine()!!.toDouble()
    if (a == 0.0) {
        if (b == 0.0) {
            println("Phuong trinh vo so nghiem")
        } else {
            println("Phuong trinh vo nghiem")
        }
    } else {
        var x = -b / a
        println("Phuong trinh co nghiem x = $x")
    }


}