package huynd.fpoly.lab1_ph30375.lab2

class bai2 {
}

fun main() {
    // bai 2 : Nhập vào một tháng bất kỳ, hỏi tháng này thuộc quý mấy trong năm. Biết rằng tháng 1, 2, 3 là quý 1; tháng 4, 5, 6 là quý 2; tháng 7, 8, 9 là quý 3; tháng 10,  11, 12 là quý 4
    println("Bai 2: ")
    println("Nhap thang: ")
    var month = readLine()!!.toInt()
    when (month) {
        in 1..3 -> println("Thang $month thuoc quy 1")
        in 4..6 -> println("Thang $month thuoc quy 2")
        in 7..9 -> println("Thang $month thuoc quy 3")
        in 10..12 -> println("Thang $month thuoc quy 4")
        else -> println("Thang khong hop le")
    }
}