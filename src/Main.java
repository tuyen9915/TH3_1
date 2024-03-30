import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /* For
        for(int i = 1 ; i <= 15 ; i += 2){
            System.out.println(i);
        }

     // do- while
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("Chọn chức năng:");
            System.out.println("1: Thêm mới");
            System.out.println("2: Xóa");
            System.out.println("3: Sửa");
            System.out.println("4: Sắp xếp");
            System.out.println("0: Thoát");
            chon = sc.nextInt();
        } while (chon != 0);{
            System.out.println("Hẹn gặp lại bạn!");
        }*/
        Scanner sc = new Scanner(System.in);
        int so;
        do {
            System.out.print("Nhập 1 số:  ");
            so = sc.nextInt();
            if (so < 2) {
                System.out.println(so + " không phải là số nguyên tố");
            } else {
                int i = 2;
                boolean check = true;
                while (i < so) {
                    if (so % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check)
                    System.out.println(so + " là số nguyên tố");
                else
                    System.out.println(so + " không phải là số nguyên tố");
            }
        } while (so !=0);
    }
}

