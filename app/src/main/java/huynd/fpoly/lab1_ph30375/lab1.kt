package huynd.fpoly.lab1_ph30375

fun main() {
    println("Bài tập Lab 1 - PH30375")
    println("=====================")
    print("NNguyễn Duy Huy - PH30375\n")
    print("=====================\n")
    println("Quanh năm Buôn bán ở nom sông ")
    println("Nuôi đủ năm con vơi 1 chồng")
    println("lặn nội thân cờ khi trông vắng ")
    println("Một duyên hai nợ âu đành phận ")
    println("Năm nắng mười mua há chẳng công ")
    println("Cha mẹ thói đời \"Ăn ở bạc\"")
    println("Có chông hỡ hững cũng như không ")
    println("=====================")
    println("Bài 2 - Tính tổng, hiệu, tích, thương của 2 số a và b")

    var a: Double
    var b: Double
    print("Nhập số a: ")
    a = readLine()!!.toDouble()
    print("Nhập số b: ")
    b = readLine()!!.toDouble()
    if (b == 0.0) {
        println("Không thể chia cho 0")
    } else {
        println("Tổng của $a và $b là: ${a + b}")
        println("Hiệu của $a và $b là: ${a - b}")
        println("Tích của $a và $b là: ${a * b}")
        println("Thương của $a và $b là: ${a / b}")
    }
}