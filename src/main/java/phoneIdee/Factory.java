package phoneIdee;

/**
 * Created by redi on 5/22/17.
 */
public class Factory {
    public Phone creatInstace(String type){
        if("MobilePone".equalsIgnoreCase(type)){
            return new MobilePhoneImpl();
        }

        if("FixedPhone".equalsIgnoreCase(type)){
            return new FixedPhoneImpl();
        }
        if("IpTelephone".equalsIgnoreCase(type)){
            return new IpTelephoneImpl();
        }
        if("SmartPhone".equalsIgnoreCase(type)){
            return new SmartPhoneImpl();
        }
        return null;
    }

}
