package phoneIdee;

/**
 * Created by redi on 5/22/17.
 */
public class App {
    public static void main(String[] args) {
        Factory factory=new Factory();
        Phone mobilephone =factory.creatInstace("MoblilePhone");
        if(mobilephone instanceof MobilePhone){
            ((MobilePhone)mobilephone).sendSMS("How are you","094333333");
        }
        Phone smartphone =factory.creatInstace("SmartPhone");
        if(smartphone instanceof SmartPhone){
            ((SmartPhone)smartphone).connectWithInternet();
        }

    }
}
