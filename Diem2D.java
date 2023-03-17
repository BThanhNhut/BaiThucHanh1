package BTVN_Bai1_24;

import java.util.Scanner;

public class Diem2D {
	private int x;
	private int y;
	
	
	//-------------------- Constructor ---------------------
	public Diem2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Diem2D() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	//---------------------- GET SET ------------------------
	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}

	//---------------------- METHOD ------------------------------
	// hien thi thong tin
	public void nhapDiem ()
	{
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap vao toa do x");
		x = nhap.nextInt();
		System.out.println("Nhap vao toa do y");
		y = nhap.nextInt();
		nhap.close();
		
	}
	public void hienThi ()
	{
		System.out.println("Toa do la : "+"("+this.x + "," +this.y+")");
	}
	
	public int giaTriX()
	{
		return x;
	}
	
	public int giaTriY()
	{
		return y;
	}
	
	public float khoangCach ()
	{
		return (float)Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
	}
	
	public float khoangCach (Diem2D a)
	{
		return (float)Math.sqrt(Math.pow(a.x - x, 2)+ Math.pow(a.y - y, 2));
	}
	
}
