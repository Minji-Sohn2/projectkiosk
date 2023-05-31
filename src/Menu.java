public class Menu {
    String name;
    double price;
    String description;
    int count;
    public Menu(){

    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }


    // 메인 메뉴판
    public void showMenu(){
        System.out.println("\n[ 민지 만두 MENU ]");
        System.out.println("1. Dumpling     | 고기만두, 김치만두,,,");
        System.out.println("2. Soup         | 고기만두국, 김치만두국,,,");
        System.out.println("3. Noodle       | 쫄면, 물냉면,,,");
        System.out.println("4. Drink        | 콜라, 사이다,,,");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order        | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel       | 진행중인 주문을 취소합니다.");

    }

}
