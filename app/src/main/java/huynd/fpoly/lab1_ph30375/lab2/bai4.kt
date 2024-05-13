package huynd.fpoly.lab1_ph30375.lab2

class bai4 {
}

fun main() {
    println("Menu quan ly Sinh Vien Bai 4")
    println("1. Them sinh vien")
    println("2. Hien thi danh sach sinh vien")
    println("3. Xoa sinh vien theo mssv")
    println("4. Cap nhat thong tin sinh vien theo mssv")
    println("5. Thoat chuong trinh")

    val quanLySinhVien = QuanLySinhVien() // Tạo đối tượng quản lý sinh viên ngoài vòng lặp
    var tiepTuc: Boolean
    do {
        try {
            print("Nhap lua chon cua ban: ")
            val options: Int = readLine()!!.toInt()
            when (options) {
                1 -> {
                    do {
                        println("Them sinh vien")
                        println("--------------------------")

                        // Nhập và kiểm tra tên sinh viên
                        var tenSV: String
                        do {
                            println("Nhap ten sinh vien: ")
                            tenSV = readLine()!!
                            if (tenSV.isBlank()) {
                                println("Ten sinh vien khong duoc de trong. Vui long nhap lai.")
                            }
                        } while (tenSV.isBlank())

                        // Nhập và kiểm tra mã số sinh viên
                        var mssv: String
                        do {
                            println("Nhap mssv: ")
                            mssv = readLine()!!
                            if (mssv.isBlank()) {
                                println("MSSV khong duoc de trong. Vui long nhap lai.")
                            }
                        } while (mssv.isBlank())

                        // Nhập và kiểm tra điểm trung bình
                        var diemTB: Float?
                        do {
                            println("Nhap diem trung binh: ")
                            diemTB = readLine()?.toFloatOrNull()
                            if (diemTB == null) {
                                println("Diem trung binh khong hop le. Vui long nhap lai.")
                            }
                        } while (diemTB == null)

                        // Nhập và kiểm tra tình trạng tốt nghiệp
                        var daTotNghiep: Boolean?
                        do {
                            println("Nhap da tot nghiep (true/false) -> ky tu khac true hoac false se mac dinh la false: ")
                            val daTotNghiepStr = readLine()
                            daTotNghiep = daTotNghiepStr?.toBoolean()
                            if (daTotNghiep == null) {
                                println("Gia tri nhap vao khong hop le. Vui long nhap true hoac false.")
                            }
                        } while (daTotNghiep == null)

                        // Nhập và kiểm tra tuổi
                        var tuoi: Int?
                        do {
                            println("Nhap tuoi: ")
                            tuoi = readLine()?.toIntOrNull()
                            if (tuoi == null) {
                                println("Tuoi khong hop le. Vui long nhap lai.")
                            }
                        } while (tuoi == null)

                        // Tạo đối tượng SinhVien nếu tất cả các trường đều hợp lệ
                        val sinhVien = SinhVien(tenSV, mssv, diemTB, daTotNghiep, tuoi)
                        quanLySinhVien.addSinhVien(sinhVien)

                        println("Them sinh vien thanh cong")
                        println("--------------------------")
                        println("Ban co muon tiep tuc them sinh vien khong? (c/k)")
                        val s = readLine()
                        if (s == "k") {
                            break
                        }
                    } while (true)
                }


                2 -> {
                    println("Danh sach sinh vien")
                    println("--------------------------")
                    quanLySinhVien.xemDanhSachSinhVien()
                }

                3 -> {
                    do {
                        println("Xoa sinh vien")
                        println("--------------------------")
                        println("Nhap mssv can xoa: ")
                        val mssv = readLine()!!
                        val result = quanLySinhVien.checkMSSV(mssv)
                        if (result) {
                            quanLySinhVien.removeSinhVien(mssv)
                            println("Xoa sinh vien thanh cong")
                        } else {
                            println("Khong tim thay sinh vien co mssv $mssv")
                        }

                        println("Ban co muon tiep tuc xoa sinh vien khong? (c/k)")
                        val s = readLine()
                        if (s == "k") {
                            break
                        }

                    } while (true)
                }

                4 -> {
                    do {
                        println("Cap nhat thong tin sinh vien")
                        println("Nhap mssv can cap nhat: ")
                        val mssv = readLine()!!
                        val check = quanLySinhVien.checkMSSV(mssv)
                        val sinhVien = quanLySinhVien.getDetailSinhVien(mssv)
                        if (check && sinhVien != null) {
                            var tenSV: String
                            do {
                                println("Nhap ten sinh vien: - Ten hien tai: ${sinhVien.tenSV}")
                                tenSV = readLine()!!
                                if (tenSV.isBlank()) {
                                    println("Ten sinh vien khong duoc de trong. Vui long nhap lai.")
                                }
                            } while (tenSV.isBlank())

                            // Nhập và kiểm tra điểm trung bình
                            var diemTB: Float?
                            do {
                                println("Nhap diem trung binh: - Diem hien tai: ${sinhVien.diemTB}")
                                diemTB = readLine()?.toFloatOrNull()
                                if (diemTB == null) {
                                    println("Diem trung binh khong hop le. Vui long nhap lai.")
                                }
                            } while (diemTB == null)

                            // Nhập và kiểm tra tình trạng tốt nghiệp
                            var daTotNghiep: Boolean?
                            do {
                                println("Nhap da tot nghiep (true/false): - Trang thai tot nghiep hien tai: ${sinhVien.daTotNghiep}")
                                val daTotNghiepStr = readLine()
                                daTotNghiep = daTotNghiepStr?.toBoolean()
                                if (daTotNghiep == null) {
                                    println("Gia tri nhap vao khong hop le. Vui long nhap true hoac false.")
                                }
                            } while (daTotNghiep == null)

                            // Nhập và kiểm tra tuổi
                            var tuoi: Int?
                            do {
                                println("Nhap tuoi: - Tuoi hien tai: ${sinhVien.tuoi}")
                                tuoi = readLine()?.toIntOrNull()
                                if (tuoi == null) {
                                    println("Tuoi khong hop le. Vui long nhap lai.")
                                }
                            } while (tuoi == null)

                            val result = quanLySinhVien.updateSinhVien(
                                mssv,
                                tenSV,
                                diemTB,
                                daTotNghiep,
                                tuoi
                            )
                            if (result) println("Cap nhat thong tin sinh vien thanh cong")
                        } else {
                            println("Khong tim thay sinh vien co mssv $mssv")
                        }

                        println("Ban co muon tiep tuc sua sinh vien khong? (c/k)")
                        val s = readLine()
                        if (s == "k") {
                            break
                        }
                    } while (true)
                }

                5 -> {
                    println("Ket thuc chuong trinh")
                    tiepTuc = false
                }

                else -> {
                    println("Nhap sai, vui long nhap lai")
                }
            }
            println("Ban co muon chon tiep lua chon tren menu? (c/k) ")
            val s = readLine()
            tiepTuc = s == "c"
        } catch (e: Exception) {
            println("Nhap sai, vui long nhap lai")
            tiepTuc = true
        }

    } while (tiepTuc)

}

