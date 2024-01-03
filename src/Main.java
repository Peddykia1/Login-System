public class Main {
    public static void main(String[] args) {
        IDandPasswords idandpasswords = new IDandPasswords();
        LoginPage loginepage = new LoginPage(idandpasswords.getLoginInfo());
    }

}
