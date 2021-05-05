
public class UserManager implements UserService{
    private EdevletManager eDevletLogger;

    public UserManager(EdevletManager eDevletLogger) {
        this.eDevletLogger = eDevletLogger;
    }

    @Override
    public void register(User user) {
        // TODO Auto-generated method stub
        if(eDevletLogger.check(user) == true) {

            System.out.println("Kayit Olundu: " + user.getFirstName());
        }
        else
            System.out.println("Lutfen Gecerli Kimlik No Giriniz.");
    }

    @Override
    public void login(User user) {
        // TODO Auto-generated method stub
        if(eDevletLogger.check(user) == true) {

            System.out.println("giris yapıld: " + user.getFirstName());
        }
        else
            System.out.println("Lutfen Gecerli Kimlik No Giriniz.");
    }

    @Override
    public void delete(User user) {
        if(eDevletLogger.check(user) == true) {

            System.out.println("hesabiniz silindi: " + user.getFirstName());
        }
        else
            System.out.println("Lutfen Gecerli Kimlik No Giriniz.");
    }


}
