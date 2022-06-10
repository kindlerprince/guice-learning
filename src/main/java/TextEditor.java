import javax.inject.Inject;

// this the a client
public class TextEditor {
  private  SpellChecker spellChecker;
  @Inject
  public TextEditor(SpellChecker spellChecker){
    this.spellChecker = spellChecker;
  }
  void makeSpellChecking(){
    spellChecker.checkSpelling();
  }
}
