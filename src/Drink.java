public class Drink extends Menu{

    double price;

    public Drink(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }


    public double getPrice(){
        return price;
    }

    public Drink(){

    }

    public void showDrink(Drink[] drink){
        System.out.println("\"민지 만두에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ Drinks Menu ]");
        int i = 0;
        for(Drink d : drink){
            i++;
            System.out.println(i + ". " + d.toString());
        }
    }

    //객체 내용 출력 -> 메뉴판, 장바구니 확인 등
    public String toString(){
        return getName() + "\t\t|\t" + getPrice() + "\t|\t" + getDescription();
    }}
