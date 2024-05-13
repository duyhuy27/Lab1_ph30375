package huynd.fpoly.lab1_ph30375

class buoi2 {

}

fun main() {

    var arrInt = intArrayOf(1, 2, 3, 4, 5)
    println(arrInt.asList())
    for (i in arrInt) {
        println(i)
    }

    //
    for (i in arrInt.indices){
        println(arrInt[i])
    }
}