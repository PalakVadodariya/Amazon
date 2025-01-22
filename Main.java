public class Main {
    
    public static void main(string args[]){
        Scanner sc=new Scanner(system.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sol = sc.nextInt();
        switch(sol){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:
               if(b==0)
               {
                System.out.println("undefined");
               }
               else{
                System.out.println(a/b);
               }
               break;
            case 6:System.out.println("default");   

        }
    } 
    
} 
