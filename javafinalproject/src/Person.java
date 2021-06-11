
public class Person {
    private int age=0;
    private String name="";
    private Account account;
    private int income=0;
    
    
    public Person(int age,String name){
        this.age=age;
        this.name=name;
        this.income=generateIncome();       
    }
    
    
   public int generateIncome(){
       int num=(int)(Math.random()*150)+50;
       num*=1000;             
       return num;      
   }
    
        
}
