import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> users = new HashMap<>();

    IDandPasswords(){
        users.put("Mr_Fluffy", "cod");
        users.put("Mr-Fluffy-Pants", "tanks");
        users.put("RNO", "|--|");
    }

    protected HashMap getLoginInfo() {
        return users;
    }
}
