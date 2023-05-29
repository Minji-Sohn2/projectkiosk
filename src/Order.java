import java.util.ArrayList;

public class Order {

    public Order(){

    }

    public void addToCart(Menu menu){
        System.out.println("\"" + menu.toString() + "\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인       2. 취소");
    }

    //장바구니 추가 여부 확인 및 장바구니(bucket)에 추가
    public void addMessage(ArrayList<Menu> bucket, Menu menu, int num){
        if(num==1){
            //bucket 배열에 menu 추가
            bucket.add(menu);
            System.out.println(menu.getName() + " 가 장바구니에 추가되었습니다.\n\n\n");
        }else if(num==2){
            System.out.println("처음 화면으로 돌아갑니다.");
        }
    }

    public void cancelOrderMessage(){
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인       2. 취소");
    }

    public void cancelOrder(ArrayList<Menu> bucket, int num){
        if(num==1){
            //bucket이 비어있지 않다면
            if(bucket!=null){
                bucket.clear();
                System.out.println("진행하던 주문이 취소되었습니다.");
                System.out.println("\n\n\n");
            }else{
                System.out.println("\n\n\n");
                return;
            }
        }else if(num==2){
            System.out.println("\n\n\n");
            return;
        }
    }
}
