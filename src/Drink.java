public class Drink extends Menu{

    double price;

    static Drink[] drinkMenu = {
            new Drink("코카콜라", 2.0, "코카콜라 355ml"),
            new Drink("사이다", 2.0, "사이다 355ml")
    };

    public Drink(){

    }

    public Drink(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public double getPrice(){
        return price;
    }

    public Menu getMenu(int num){
        return drinkMenu[num-1];
    }

    public void showMenu(){
        System.out.println("\n\n\"민지 만두에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Drinks Menu ]");
        int i = 0;
        for(Drink d : drinkMenu){
            i++;
            System.out.println(i + ". " + d.toString());
        }
        System.out.println();
    }

    //객체 내용 출력 -> 메뉴판, 장바구니 확인 등
    public String toString(){
        return getName() + "\t\t|\t" + getPrice() + "\t|\t" + getDescription();
    }}
