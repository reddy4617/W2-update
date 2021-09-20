public class TestClass {
    public static void main(String[] args) {
        breadMaker.getFactory("Barn Bread");
        breadMaker.getFactory("White Bread");

        System.out.println("White Bread");
        breadMaker.makeWhiteBread();
        System.out.println();

        System.out.println("Barn Bread");
        breadMaker.makeBarnBread();
    }
}
