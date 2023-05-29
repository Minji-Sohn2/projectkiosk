public class Dumpling extends Menu {
    double price;

    Dumpling[] dumpling = {
            new Dumpling("고기 군만두", 8.0, "겉바속촉, 민지만두 인기쟁이"),
            new Dumpling("김치 군만두", 8.0, "겉바속촉, 민지만두 인기쟁이"),
            new Dumpling("고기 찐만두", 7.0, "겉은 쫄깃, 속은 육즙가득"),
            new Dumpling("김치 찐만두", 7.0, "겉은 쫄깃, 속은 매콤아삭"),
    };

    public Dumpling(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void showMenu(){

    }
}
