import java.util.Scanner;
public class restaurantmenuwithprice {
    public static void menusearch(String menu[] , int price[]){
        Scanner sc = new Scanner(System.in);
         System.out.println("......MENU......");
         for(int i = 0; i<menu.length;i++){
              System.out.println((i+1) + "." + menu[i]);
         }
         System.out.print("What would you like to eat = ");
         String item = sc.nextLine();
         for(int i = 0;i<menu.length;i++){
         if(menu[i].equalsIgnoreCase(item)){
            System.out.println("Price of the product you want "+item +" = "+ price[i]);
            return;
         }
   }
        System.out.println("Item isn't Available...");
     sc.close();  
    }
    public static void main(String[] args) {
        String menu[]={"Burger","Pizza","Margerita","WS Pasta","RS Pasta","French Fries","Zingy Parcel","Cold Coffee","Tea"};
        int price[]={120,260,210,260,255,130,70,140,30};
        menusearch(menu,price);
      
    }
    
}

