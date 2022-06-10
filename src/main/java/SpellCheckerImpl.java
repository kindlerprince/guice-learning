// this is a service class
public class SpellCheckerImpl implements  SpellChecker{
  String dbUrl;
  String user;
  String timeout;
  public SpellCheckerImpl(String dbUrl,String user, String timeout){
    this.dbUrl = dbUrl;
    this.user = user;
    this.timeout = timeout;
  }
  @Override
  public void checkSpelling() {
    System.out.println("Inside the checkSpelling function");
    System.out.println(dbUrl);
    System.out.println(user);
    System.out.println(timeout);
  }
}
