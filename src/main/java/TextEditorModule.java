import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class TextEditorModule extends AbstractModule {
  @Provides
  public SpellChecker provideSpellChecker(){
    String dbUrl = "jdbc:mysql://localhost:3306/test";
    String user = "root";
    String timeout = "10s";
    SpellChecker spellChecker = new SpellCheckerImpl(dbUrl,user,timeout);
    return spellChecker;
  }

}
