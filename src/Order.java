import java.util.ArrayList;

public class Order {

    int waitingNumber = 0;
    public Order(){

    }

    public void addToCart(Menu menu){
        System.out.println("\"" + menu.toString() + "\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인       2. 취소");
    }

    //장바구니 추가 여부 확인 및 장바구니(bucket)에 추가
    public void addMessage(ArrayList<Menu> bucket, Menu menu, int oneOrTwo){
        if(oneOrTwo==1){
            //bucket 배열에 menu 추가
            bucket.add(menu);
            System.out.println(menu.getName() + " 가 장바구니에 추가되었습니다.\n\n\n");
        }else if(oneOrTwo==2){
            System.out.println("처음 화면으로 돌아갑니다.");
        }
    }

    // bucket에 담긴 음식 확인 후 주문할지 메뉴판으로 돌아갈지 결정
    public void checkBucket(ArrayList<Menu> bucket){
        System.out.println("\n아래와 같이 주문 하시겠습니까?\n");
        System.out.println("[ Orders ]");
        double total = 0.0;
        for(Menu m : bucket){
            System.out.println(m.toString());
            total += m.getPrice();
        }
        System.out.println("\n[ Total ]\n\\" + total + "\n");
        System.out.println("1. 주문       2. 메뉴판");
    }

    // 주문완료 화면
    public void finishOrder(int oneOrTwo){
        if(oneOrTwo==1){
            System.out.println("\n주문이 완료되었습니다!\n");
            waitingNumber++;
            System.out.println("대기번호는 [ " + waitingNumber + " ] 번 입니다.");
            System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
            // 3초 대기
        }else if(oneOrTwo==2){
            return;
        }

    }
    public void cancelOrderMessage(){
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인       2. 취소");
    }

    public void cancelOrder(ArrayList<Menu> bucket, int oneOrTwo){
        if(oneOrTwo==1){
            //bucket이 비어있지 않다면
            if(bucket!=null){
                bucket.clear();
                System.out.println("진행하던 주문이 취소되었습니다.");
                System.out.println("\n\n\n");
            }else{
                System.out.println("\n\n\n");
                return;
            }
        }else if(oneOrTwo==2){
            System.out.println("\n\n\n");
            return;
        }
    }
}
