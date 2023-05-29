import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Menu menuCategory = new Menu();

        System.out.println("\"민지 만두에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
//        menuCategory.showMenu();
        int input = sc.nextInt();
        switch(input){
            case 1:
                System.out.println(1);
        }


    }
}