package BTVN_Bai1_24;


public class SDDiem {

	public static void main(String[] args) {
		// Tạo ra lớp A có tọa độ (3,4)
		System.out.println("Tọa độ điểm A");
		Diem2D A = new Diem2D(3,4);
		A.hienThi();
		// tạo ra 1 lớp B có tọa độ nhập từ bàn phím
		System.out.println("Nhập tọa độ điểm B");
		Diem2D B = new Diem2D();
		B.nhapDiem();
		System.out.println("Tọa độ điểm B");
		B.hienThi();
		// Tạo ra điểm c đối xứng với B qua góc tọa độ
		System.out.println("Tọa độ điểm C");
		Diem2D C = new Diem2D(B.giaTriX()*-1,B.giaTriY()*-1);
		C.hienThi();
		// khoảng cách từ điểm B đến tâm O
		System.out.println("Khoảng cách từ điểm B đến tâm O là " + B.khoangCach());
		// Khoảng cách từ điểm A đến điểm B
		System.out.println("Khoảng cách từ điểm A đến B là " + A.khoangCach(B));
		}
	}
