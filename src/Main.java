class Main{
    public static void main(String[]args){

        //Tutorial 1

        //Q1
        System.out.println("Welcome to online learning");
        System.out.println(" ");
        System.out.println("Please Virus go away");
        System.out.println("\n");

        //Q4

        for (int i=1;i<=100;i++){
            if(i%2==0){
            System.out.print(i);
            }
        }
        System.out.println("\n");
        //Q5
         int x=1;
        while(x<=100){
            if(x%2==0){
                System.out.print(x);
            }
            x++;
        }
        System.out.println("\n");
        //Q6
         for (int count=0;count<6;count++){
             int randomNum= (int) (Math.random()*49+1);
             System.out.print(randomNum+",");
         }


    }
}
