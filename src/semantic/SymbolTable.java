package visitor;
import ast.Definition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymbolTable {
    private int scope = 0;
    private List<Map<String, Definition>> st;

    public SymbolTable() {
        st = new ArrayList<>();
        st.add(new HashMap<>());
    }

    public void set() {
        scope++;
        while (st.size() <= scope) {
            st.add(new HashMap<>());
        }
    }

    public void reset() {
        if (scope > 0) {
            st.get(scope).clear();
            scope--;
        } else {
            throw new IllegalStateException("Cannot exit the global scope.");
        }
    }

    public boolean insert(Definition node) {
        Map<String, Definition> currentScope = st.get(scope);
        if (currentScope.containsKey(node.getName())) {
            return false;
        }
        currentScope.put(node.getName(), node);
        return true;
    }

    public Definition find(String id) {
        for (int i = scope; i >= 0; i--) {
            Map<String, Definition> currentScope = st.get(i);
            if (currentScope.containsKey(id)) {
                return currentScope.get(id);
            }
        }
        return null;
    }
}
