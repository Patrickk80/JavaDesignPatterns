package behavioural.visitor;

public interface AtvPartVisitor {

  void visit(Fender fender);

  void visit(Wheel wheel);

  void visit(Oil oil);

  void visit(PartsOrder partsOrder);
}
