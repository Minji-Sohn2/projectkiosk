public class Soup extends Menu{
    double price;

    static Soup[] soupMenu = {
            new Soup("고기 만두국", 9.0, "사골육수에 동글 고기만두 듬뿍"),
            new Soup("김치 만두국", 9.0, "사골육수에 동글 김치만두 듬뿍"),
            new Soup("떡국    ", 9.0, "진한 사골육수에 쫀득한 떡 한가득")
    };

    public Soup(){

    }

    public Soup(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public double getPrice(){
        return price;
    }

    public Menu getMenu(int num){
        return soupMenu[num-1];
    }

    public void showMenu(){
        System.out.println("\n\n\"민지 만두에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Soup Menu ]");
        int i = 0;
        for(Soup s : soupMenu){
            i++;
            System.out.println(i + ". " + s.toString());
        }
        System.out.println();
    }

    //객체 내용 출력 -> 메뉴판, 장바구니 확인 등
    public String toString(){
        return getName() + "\t\t| W " + getPrice() + " |\t" + getDescription();
    }
}
