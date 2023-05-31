import java.util.ArrayList;

public class Noodle extends Menu{

    double price;

    static Noodle[] noodleMenu = {
            new Noodle("쫄면  ", 8.0, "양배추 듬뿍, 쫄깃 매콤한 쫄면"),
            new Noodle("물냉면", 8.0, "여름엔 냉면이지~ 살얼음 원샷 육수"),
            new Noodle("비빔냉면", 8.0, "숨은 냉면 맛집, 연중 인기 매콤 냉면")
    };

    public Noodle() {

    }

    public Noodle(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public double getPrice(){
        return price;
    }

    public Menu getMenu(int num){
        return noodleMenu[num-1];
    }

    // noodle 메뉴판 보여주기
    public void showMenu( ){
        System.out.println("\n\n\"민지 만두에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Noodle Menu ]");
        int i = 0;
        for(Noodle n : noodleMenu){
            i++;
            System.out.println(i + ". " + n.toString());
        }
        System.out.println();
    }

    public String toString(){
        return getName() + "\t\t| W " + getPrice() + " |\t" + getDescription();
    }
}
