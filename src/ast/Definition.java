package ast;

public interface Definition {
    /**
     * Returns the name of the definition.
     *
     * For VarDefinition, this might return the first name in the list of names.
     * For FuncDefinition, this will return the function name.
     *
     * @return the name of the definition.
     */
    String getName();
}
