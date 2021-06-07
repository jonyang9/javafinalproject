
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
    public void passwordCheck(){
        
    }
    
    public int createAccNum(){
        String temp="";
        int num=0;
        for(int k=0;k<10;k++){
            num=(int)(Math.random()*9);
            temp+=Integer.toString(num);           
        }
        num=Integer.parseInt(temp);
        return num;
}
}
