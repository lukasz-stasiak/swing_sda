
public class StoreLogin  {

    String login;

    private static StoreLogin instance = null;

    public static StoreLogin getInstance()
    {
        if(instance==null)
            instance = new StoreLogin();
        return instance;
    }

     public StoreLogin() {
          }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
}
