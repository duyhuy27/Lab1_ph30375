package huynd.fpoly.lab1_ph30375.lab2

class SinhVienModel {
    var name: String = ""
    var mssv: String = ""
    var avg: Float = 0.0f
    var statusGraduted: Boolean = false
    var age: Int = 0

    constructor() {
        println("Constructor không tham số")
        name = "noname"
    }

    constructor(name: String, mssv: String, avg: Float, statusGraduted: Boolean, age: Int) {
        println("Constructor có tham số name = $name")
        this.name = name
        this.mssv = mssv
        this.avg = avg
        this.statusGraduted = statusGraduted
        this.age = age
    }


}