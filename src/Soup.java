public class Soup extends Menu{
    double price;

    Soup[] soup = {
            new Soup("고기 만두국", 9.0, "사골육수에 동글 고기만두 듬뿍"),
            new Soup("김치 만두국", 9.0, "사골육수에 동글 김치만두 듬뿍"),
            new Soup("떡국", 9.0, "진한 사골육수에 쫀득한 떡 한가득")
    };

    public Soup(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
