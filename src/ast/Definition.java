package ast;

import semantic.LValueVisitor;
import types.Type;
import visitor.Visitor;

public interface Definition {
   // <TP, TR> TR accept(Visitor<TP, TR> visitor, Void param);

    /**
     * Returns the name of the definition.
     *
     * For VarDefinition, this might return the first name in the list of names.
     * For FuncDefinition, this will return the function name.
     *
     * @return the name of the definition.
     */
    String getName();
    Type getType();



    <TP, TR> TR accept(Visitor<TP, TR> visitor, TP param);
}
