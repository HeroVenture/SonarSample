public class NewFum extends Fum {  // Noncompliant; Fum is deprecated
    public void myMethod() {
      Baz baz = new Baz();  // okay; the class isn't deprecated
      baz.doTheThing();  // Noncompliant; doTheThing method is deprecated
    }
}