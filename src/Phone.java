public class Phone {
    String number;
    String model;
    int weight;

    public Phone(String number ,String model, int weight){
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number ,String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){
        this.number = "Unknown";
        this.model = "Unknown";
        this.weight = 0;
    }

    public void printInfo(){
        System.out.println("Number: " + number);
        System.out.println("Model: " + model);
        System.out.println("Weight: " + weight);
    }


    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    public void receiveCall(String caller){
        System.out.println(caller + " is ringing");
    }

    public void receiveCall(String caller, String number){
        System.out.println(caller + '(' + number + ')' + " is ringing");
    }

    public void sendMessages(String message, String... phoneNumbers){
        System.out.println("Sending message: " + message + ". to the following numbers: ");
        for (String number:phoneNumbers){
            System.out.println(number);
        }
    }

    public static void main(String[] args){
        Phone samsung = new Phone("87051682938", "Samsung",200);
        Phone iphone  = new Phone("87029329328","Iphone");
        Phone nokia = new Phone();

        samsung.printInfo();
        iphone.printInfo();
        nokia.printInfo();

        System.out.println();
        samsung.receiveCall("Temutjin");
        samsung.receiveCall("Bekzat", iphone.getNumber());
        iphone.sendMessages("Салам брат как ты?", samsung.getNumber(), iphone.getNumber());
    }
}


/* 1. Phone class.
Create a Phone class that contains the number, model, and weight variables.
Create three instances of this class.
Print the values of their variables to the console.
Add methods to the Phone class: receiveCall, has one parameter - the name of the caller. Prints the message “{name} is ringing” to the console. getNumber method - returns the phone number. Call these methods for each of the objects.
Add a constructor to the Phone class that takes three parameters as input to initialize the class variables - number, model and weight.
Add a constructor that takes two parameters as input to initialize class variables - number, model.
Add constructor without parameters.
Call a constructor with two parameters from a constructor with three parameters.
Add an overloaded receiveCall method that takes two parameters - the name of the caller and the phone number of the caller. Call this method.
Create a sendMessage method with variable length arguments. This method accepts as input the phone numbers to which the message will be sent. The method prints the numbers of these phones to the console.
Change the Phone class to match the JavaBean concept.
*/