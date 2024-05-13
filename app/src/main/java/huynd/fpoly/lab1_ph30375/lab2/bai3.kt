package huynd.fpoly.lab1_ph30375.lab2

class bai3 {
}

fun main() {
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuận ")
    do {
        println("Nhập năm: ")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai, vui lòng nhập lại năm: ")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        println("Bạn có muốn tiếp tục không? (c/k)")
        s = readLine()
        if (s == "k") {
            break
        }

    } while (true)
    println("Ket thuc chuong trinh")

}
