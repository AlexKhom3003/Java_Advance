package be.IntecBrussel.obdrachten;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamObdrahten {
    //        obracht1
    public List<String> toUppercase(List<String> strings) {
        return strings.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }

    //        obracht2
    public List<String> filterA(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
    }

    //        obracht3
    public List<String> filterB(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length() > 3)
                .collect(Collectors.toList());
    }

    public List<String>filterC(List<String>strings){
        return strings.stream()
                .filter(s -> s.startsWith("a") && s.length() > 3)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

    }

}

