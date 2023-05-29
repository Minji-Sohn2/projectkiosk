public class Order {

    public Order(){

    }

    public void addToCart(Menu menu){
        System.out.println("\"" + menu.toString() + "\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인       2. 취소");
    }

    public void addMessage(Menu menu, int num){
        if(num==1){
            //bucket 배열에 menu 추가
//            bucket.add(menu);
            System.out.println(menu.getName() + " 가 장바구니에 추가되었습니다.");
        }else if(num==2){
            System.out.println("처음 화면으로 돌아갑니다.");
        }
    }
}
