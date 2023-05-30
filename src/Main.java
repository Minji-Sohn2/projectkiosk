import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Drink drink = new Drink();
        Noodle noodle = new Noodle();
        Order order = new Order();

        ArrayList<Menu> bucket = new ArrayList<Menu>(); // 장바구니
        Drink[] drinkMenu = {
                new Drink("코카콜라", 2.0, "코카콜라 355ml"),
                new Drink("사이다", 2.0, "사이다 355ml")
        };
        while(true){
            System.out.println("\"민지 만두에 오신걸 환영합니다.\"");
            System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
            menu.showMenu();
            int input = sc.nextInt();
            int num, oneOrTwo;

            switch(input){
                case 1:
                    System.out.println(1);
                    break;

                case 2:
                    break;
                case 3:
                    noodle.showNoodle();
                    num = sc.nextInt();
                    order.addToCart(noodle.getMenu(num));
                    oneOrTwo = sc.nextInt();
                    order.addMessage(bucket,noodle.getMenu(num),oneOrTwo);
                    break;

                case 4:
                    drink.showDrink(drinkMenu);
                    System.out.println();
                    num = sc.nextInt();
                    order.addToCart(drinkMenu[num-1]);
                    oneOrTwo = sc.nextInt();
                    order.addMessage(bucket, drinkMenu[num-1],oneOrTwo);
                    break;

                case 5:
                    order.checkBucket(bucket);
                    oneOrTwo = sc.nextInt();
                    order.finishOrder(bucket, oneOrTwo);
                    break;

                case 6:
                    order.cancelOrderMessage();
                    num = sc.nextInt();
                    order.cancelOrder(bucket,num);
                    break;
            }
        }



    }
}