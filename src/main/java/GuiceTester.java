
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTester {
  public static void main(String[] args){
    System.out.println("This GuiceTester Main Application");
    Injector injector = Guice.createInjector(new TextEditorModule());
    TextEditor textEditor = injector.getInstance(TextEditor.class);
    textEditor.makeSpellChecking();
  }
}
