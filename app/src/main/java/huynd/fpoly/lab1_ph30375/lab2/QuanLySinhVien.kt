package huynd.fpoly.lab1_ph30375.lab2

data class SinhVien(
    var tenSV: String,
    var mssv: String,
    var diemTB: Float,
    var daTotNghiep: Boolean?,
    var tuoi: Int?
)

class QuanLySinhVien {
    private val sinhVienList = mutableListOf<SinhVien>()

    fun addSinhVien(sinhVien: SinhVien) {
        sinhVienList.add(sinhVien)
    }

    fun getDetailSinhVien(mssv: String): SinhVien? {
        return sinhVienList.find { it.mssv == mssv }
    }

    fun removeSinhVien(mssv: String): Boolean {
        val sinhVien = sinhVienList.find { it.mssv == mssv }
        if (sinhVien == null) {
            return false
        }
        sinhVienList.removeAll { it.mssv == mssv }
        return true
    }

    fun checkMSSV(mssv: String): Boolean {
        val sinhVien = sinhVienList.find { it.mssv == mssv }
        return sinhVien != null
    }

    fun updateSinhVien(
        mssv: String,
        tenSV: String,
        diemTB: Float,
        daTotNghiep: Boolean?,
        tuoi: Int?
    ): Boolean {
        val sinhVien = sinhVienList.find { it.mssv == mssv }
        if (sinhVien == null) {
            return false
        }
        sinhVien?.apply {
            this.tenSV = tenSV
            this.diemTB = diemTB
            this.daTotNghiep = daTotNghiep
            this.tuoi = tuoi
        }
        return true;

    }

    fun xemDanhSachSinhVien() {
        if (sinhVienList.isEmpty()) {
            println("Danh sách sinh viên đang trống.")
        } else {
            sinhVienList.forEachIndexed { index, sinhVien ->
                println("Sinh viên ${index + 1}:")
                println("Tên: ${sinhVien.tenSV}")
                println("MSSV: ${sinhVien.mssv}")
                println("Điểm TB: ${sinhVien.diemTB}")
                println("Đã tốt nghiệp: ${sinhVien.daTotNghiep ?: "Chưa có thông tin"}")
                println("Tuổi: ${sinhVien.tuoi ?: "Chưa có thông tin"}")
                println("--------------------")
            }
        }
    }
}