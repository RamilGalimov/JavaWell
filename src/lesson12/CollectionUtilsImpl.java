package lesson12;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer i : a) {
            if (b.contains(i)) {
                result.add(i);
            }
        }
        for (Integer j : b) {
            if (a.contains(j)) {
                result.add(j);
            }
        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>();
        for (Integer in : a) {
            if (!b.contains(in)) {
                result.addAll(a);
                result.addAll(b);
            }
        }
        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>();
        for (Integer i : a) {
            if (b.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        for (Integer i : a) {
            if (!b.contains(i)) {
                result.add(i);
            }
        }
        for (Integer j : b) {
            if (!a.contains(j)) {
                result.add(j);
            }
        }
        return result;
    }
}
