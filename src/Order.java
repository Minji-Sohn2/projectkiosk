import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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

//    // bucket에 담긴 음식 확인 후 주문할지 메뉴판으로 돌아갈지 결정
//    public void checkBucket(ArrayList<Menu> bucket){
//        System.out.println("\n아래와 같이 주문 하시겠습니까?\n");
//        System.out.println("[ Orders ]");
//        double total = 0.0;
//        for(Menu m : bucket){
//            // collection 안에 같은 값의 개수 확인
//            int count = Collections.frequency(bucket,m);
//
//            System.out.println(m.getName() + "\t| W " + m.getPrice() + " | " + count + "개 | " + m.getDescription());
//            total += m.getPrice();
//
//            if (count > 1) {
//                bucket.removeIf(menu -> menu.getName().equals(m.getName()));
//            }
//        }
//        System.out.println("\n[ Total ]\nW " + total + "\n");
//        System.out.println("1. 주문       2. 메뉴판");
//    }

    public void checkBucket(ArrayList<Menu> bucket){
        Map<String, Integer> bucketMap = new HashMap<String, Integer>();
        
        System.out.println("\n아래와 같이 주문 하시겠습니까?\n");
        System.out.println("[ Orders ]");
        double total = 0.0;

        for(Menu m : bucket){
            if(bucketMap.containsKey(m.getName())){
                bucketMap.put(m.getName(),bucketMap.get(m.getName())+1);
            }
            bucketMap.put(m.getName(),1);
        }
        for(Menu m : bucket){
            System.out.println(m.toString());
            total += m.getPrice();
        }
        System.out.println("\n[ Total ]\nW" + total + "\n");
        System.out.println("1. 주문       2. 메뉴판");
    }

    // 주문완료 화면
    public void finishOrder(ArrayList<Menu> totalSales, ArrayList<Menu> bucket, int oneOrTwo) throws InterruptedException {
        if(oneOrTwo==1){
            // 주문 내용 totalSales에 복사
            for(Menu m : bucket){
                totalSales.add(m);
            }
            // 주문 완료된 장바구니 비우기
            bucket.clear();
            System.out.println("\n주문이 완료되었습니다!\n");
            waitingNumber++;
            System.out.println("대기번호는 [ " + waitingNumber + " ] 번 입니다.");
            System.out.println("(3초후 메뉴판으로 돌아갑니다.)\n\n");
            // 3초 대기
            TimeUnit.SECONDS.sleep(3);
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
            // bucket이 비어있지 않다면
            if(bucket!=null) {
                bucket.clear();
            }
            System.out.println("진행하던 주문이 취소되었습니다.");

        }else if(oneOrTwo==2){
            System.out.println("처음 화면으로 돌아갑니다.\n\n");
            return;
        }
    }
}
