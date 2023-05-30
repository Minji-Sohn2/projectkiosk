public class Dumpling extends Menu {
    double price;

    static Dumpling[] dumplingMenu = {
            new Dumpling("고기 군만두", 8.0, "겉바속촉, 민지만두 인기쟁이"),
            new Dumpling("김치 군만두", 8.0, "겉바속촉, 민지만두 인기쟁이"),
            new Dumpling("고기 찐만두", 7.0, "겉은 쫄깃, 속은 육즙가득"),
            new Dumpling("김치 찐만두", 7.0, "겉은 쫄깃, 속은 매콤아삭"),
    };

    public Dumpling(){

    }

    public Dumpling(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public double getPrice(){
        return price;
    }

    public Menu getMenu(int num){
        return dumplingMenu[num-1];
    }

    public void showMenu(){
        System.out.println("\n\n\"민지 만두에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Dumpling Menu ]");
        int i = 0;
        for(Dumpling d : dumplingMenu){
            i++;
            System.out.println(i + ". " + d.toString());
        }
        System.out.println();
    }

    public String toString(){
        return getName() + "\t|\t" + getPrice() + "\t|\t" + getDescription();
    }

}
