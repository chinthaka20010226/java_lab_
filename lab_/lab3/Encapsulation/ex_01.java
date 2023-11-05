import java.util.*;

class Account{
    private String acc_no;
    private String name;
    private String email;
    private String id;
    private double amount;

    public void setAccNo(String acc_no){
        this.acc_no=acc_no;
    }
    public String getAccNo(){
        if(this.checkAccNo()){
            return acc_no;
        }
        return "Invalid";
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }

    boolean checkAccNo(){
        if(this.acc_no == null){
            System.out.println("Invalid Account Number");
            return false;
        }
        return true;
    }
}

class Bank{
    public static void main(String args[]){
        Account a1=new Account();

        // a1.setAccNo("39929911234");
        a1.setName("Nimal Jayasinghe");
        a1.setId("981232234V");
        a1.setEmail("nimalj@gamil.com");
        a1.setAmount(25000.00);

        System.out.println( "Account Number              :"+a1.getAccNo()+"\n"+
                            "Name of the account holder  :"+a1.getName()+"\n"+
                            "ID of the account holder    :"+a1.getId()+"\n"+
                            "E-mail of the account holder:"+a1.getEmail()+"\n"+
                            "Total amount deposite       :"+a1.getAmount()
        );
    }
}