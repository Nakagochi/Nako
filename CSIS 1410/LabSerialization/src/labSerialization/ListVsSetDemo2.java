package labSerialization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSetDemo2 implements Serializable {
    private final List<ColoredSquare> list;
    private final Set<ColoredSquare> set;

    public ListVsSetDemo2(ColoredSquare... elements) {
        list = new ArrayList<>(Arrays.asList(elements));
        set = new HashSet<>(Arrays.asList(elements));
    }

    public String getListElements() {
        StringBuilder sb = new StringBuilder();
        for (ColoredSquare el : list) {
            sb.append(el).append("\n");
        }
        return sb.toString();
    }

    public String getSetElements() {
        StringBuilder sb = new StringBuilder();
        for (ColoredSquare el : set) {
            sb.append(el).append("\n");
        }
        return sb.toString();
    }

    public void addElement(ColoredSquare el) {
        list.add(el);
        set.add(el);
    }
}