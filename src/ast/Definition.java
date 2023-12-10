package ast;

import types.Type;
import visitor.Visitor;

public interface Definition {
    String getName();
    Type getType();

    <TP, TR> TR accept(Visitor visitor, TP param);
}
