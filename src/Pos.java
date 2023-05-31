import java.util.ArrayList;

public class Pos {
    double total = 0.0;
    public double getTotalSales(ArrayList<Menu> totalSales){
        for(Menu m : totalSales){
            total += m.getPrice();
        }
        return total;
    }

    public void printTotalSales(ArrayList<Menu> totalSales){
        System.out.println("[ 총 판매금액 현황 ]");
        System.out.println("현재까지 총 판매된 금액은 [ W " + getTotalSales(totalSales) + " ] 입니다.");
        System.out.println();
        System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.");
        System.out.println();
        for(Menu m : totalSales){
            System.out.println("- " + m.getName() + "\t| W " + m.getPrice());
        }
        System.out.println();
        System.out.println("1. 돌아가기");
    }

    public void backToMain(int oneOrTwo){
        if(oneOrTwo==1){
            return;
        }else{
            System.out.println("잘못된 번호 입력입니다.");
        }
    }

}
