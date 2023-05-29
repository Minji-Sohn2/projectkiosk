public class Menu {
    String name;
    double price;
    String description;
    public Menu(String name, double price, String description){
        this.name = name;
        this.description = description;
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

    public void showMenu(){
        System.out.println("[ 민지 만두 MENU ]");
        System.out.println("1. Dumpling     | 고기만두, 김치만두,,,");
        System.out.println("2. Soup         | 고기만두국, 김치만두국,,,");
        System.out.println("3. Noodle       | 쫄면, 물냉면,,,");
        System.out.println("4. Drink        | 콜라, 사이다,,,");

    }
}
