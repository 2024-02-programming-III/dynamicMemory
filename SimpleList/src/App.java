import java.util.List;

public class App {

    static List<Integer> list;
    private static int[] nums = new int[100000];

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.generateNums();

        DemoArrayList da = new DemoArrayList();
        da.testArrayList(nums);
        DemoSimpleList ds = new DemoSimpleList();
        ds.testArrayList(nums);
    }

    public void generateNums(){
        for (int i = 0; i < 100000; i++) {
            nums[i] = (int) (Math.random()*10000);
        }
    }
}
