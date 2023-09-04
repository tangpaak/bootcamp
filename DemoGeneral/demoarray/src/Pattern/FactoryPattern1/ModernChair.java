public class ModernChair implements Chair {
  @Override
  public boolean hasLegs() {
    return true;
  }

  @Override
  public boolean sitOn() {
    return true;
  }

  @Override
  public void destroy() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'destroy'");
  }
}