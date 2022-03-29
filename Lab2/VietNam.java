package Session5.Lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class VietNam extends Thongtin{
        int Dinhmuc;
        String doiTuong;
        public void TT(){
                super.TT();
                System.out.println("\t Nhap dinh muc: ");
                Dinhmuc = sc.nextInt();
        }
        public void In(){
                System.out.println("Duoi day la thong tin khach hang:  "+Name);
                super.In();
                System.out.println("\t Khach hang:"+doiTuong);
                System.out.println("\t Dinh muc: "+ Dinhmuc);
                System.out.println("\t Thanh tien = " +ThanhTien()+"đ");

        }

        public int ThanhTien(){
                if (Soluong < 50){
                        return Soluong * 1000;
                }
                else if (Soluong < 100){
                        return 50 * 1000 + (Soluong-50) * 1200;
                }
                else if (Soluong < 200){
                        return 100 * 1200 + (Soluong-100) * 1500;
                }
                else {
                        return 200 * 1500 + (Soluong-200) * 2000;
                }
        }


}
