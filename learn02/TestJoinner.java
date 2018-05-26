package wjt.learn02;


import java.util.HashSet;
import java.util.Set;

public class TestJoinner {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("ab");
        set.add("opp");
        // 可以在java中直接使用kotlin的类，但是kotlin的部分特性会失效（比如此处的默认参数等）
        System.out.print(LearnJoinerKt.joinerToString(set, " ", "(", ")"));
    }
}
