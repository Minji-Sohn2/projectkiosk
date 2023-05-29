public class Noodle extends Menu{

    double price;

    Noodle[] noodle = {
            new Noodle("쫄면", 8.0, "양배추 듬뿍, 쫄깃 매콤한 쫄면"),
            new Noodle("물냉면", 8.0, "여름엔 냉면이지~ 살얼음 원샷 육수"),
            new Noodle("비빔냉면", 8.0, "숨은 냉면 맛집, 연중 인기 매콤 냉면")
    };

    public Noodle(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }
}
