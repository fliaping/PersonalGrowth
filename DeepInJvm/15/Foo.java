import java.util.ArrayList;
import java.lang.Integer;
class Foo {

    public void foo() {
        var value = 1;
        var list = new ArrayList<Integer>();
        list.add(value);
        list.add("1"); //这⼀句能够编译吗？
        }
}
