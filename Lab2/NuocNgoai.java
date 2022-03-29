package Session5.Lab2;

import java.util.Scanner;

public class NuocNgoai extends Thongtin{
    String quocTich;

    public void TT(){
        super.TT();
        System.out.println("\t Nhap Quoc tich:");
        quocTich = sc.nextLine();
    }
    public void In(){
        super.In();
        System.out.println("\t Quoc tich:"+quocTich);
        System.out.println("\t Thanh Tien = "+ThanhTien()+ "đ");
    }

    public int ThanhTien(){
        return Soluong * DonGia();
    }

}

