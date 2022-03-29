package Session5.Lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Thongtin {
        String ID;
        String Name;
        String ngayraHoadon;
        int Soluong;

    Scanner sc = new Scanner(System.in);

    public void TT(){
        System.out.println("\t Nhap Id:");
        ID = sc.nextLine();
        System.out.println("\t Nhap Name:");
        Name = sc.nextLine();
        System.out.println("\t In hoa don:");
        ngayraHoadon = sc.nextLine();
        System.out.println("\t So luong:");
        Soluong = sc.nextInt();
        sc.nextLine();

    }
    public void In(){
        System.out.println("Duoi day la thong tin khach hang:  "+Name);
        System.out.println("\t ID:"+ID);
        System.out.println("\t Ten khach hang:"+ Name);
        System.out.println("\t Ngay ra hoa don:"+ ngayraHoadon);
        System.out.println("\t So luong KW:"+Soluong);
    }

    public int DonGia(){
        if (Soluong < 50){
            return 1000;
        }
        else if (Soluong < 100){
            return 1200;
        }
        else if (Soluong < 200){
            return 1500;
        }
        else {
            return 2000;
        }
    }

}
