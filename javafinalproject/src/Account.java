
public class Account {
    private String password="";
    private String username="";
    private int bankAccountNum=0;
    private int creditScore=0;
    private int balance=0;
    
    public Account(){
    this.bankAccountNum=createAccNum();
        System.out.println("Your account number is "+bankAccountNum);
        
    }
   
    public String getPW(){
        return password;
    }
    
    public String getUN(){
        return username;
    }
    
    public int getAN(){
        return bankAccountNum;
    }
    
    public int getCS(){
        return creditScore;
    }
    public int getBal(){
        return balance;
    }
    
    public void withdraw(int x){
        if(x<=balance)
        balance-=x;
        else
            System.out.println("Insufficient funds");
    }
    
    public void deposit(int x){   
        balance+=x;       
    }
    
    
    
    
    
    
    
    
    
    
    
    public boolean passwordCheck(String p){
        if(p.length()<8)
            return false;
        int upperCount=0;
        int lowerCount=0;
        int numCount=0;
        int symbolCount=0;
        String symbols="!@#$%^&*()=/?";
        char c;
        for(int k=0;k<p.length();k++){
            c=p.charAt(k);
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c))
                    upperCount++;
                else
                    lowerCount++;
            }
            else if(Character.isDigit(c))
                numCount++;
            else{
                for(int i=0;i<p.length();i++){
                    if(symbols.indexOf(c)>0)
                        symbolCount++;
                    else
                        return false;
                }           
            }        
        }
        if((upperCount<1)||(lowerCount<1)||(numCount<1)||(symbolCount<1))
            return false;
        return true;
    }
    
    public int createAccNum(){
        String temp="";
        int num=0;
        for(int k=0;k<10;k++){
            num=(int)(Math.random()*3);
            temp+=Integer.toString(num);           
        }
        num=Integer.parseInt(temp);
        return num;
}
}
