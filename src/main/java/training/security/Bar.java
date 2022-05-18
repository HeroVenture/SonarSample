public class Bar {
    /**
     * @deprecated  As of release 1.7, replaced by {@link #doTheThingBetter()}
     */
    @Deprecated(forRemoval=true)
    public void doTheThing() { }
  
    public void doTheThingBetter() { }
  
    /**
     * @deprecated As of release 1.14 due to poor performances.
     */
    @Deprecated(forRemoval=false)
    public void doTheOtherThing() { }
}