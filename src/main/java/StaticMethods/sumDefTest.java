package StaticMethods;


class sumDefTest {
    public static void main(String[] args) {
        int result1 = sumDef.sum(4, 5, 6);
        System.out.println("Сумма: " + result1);

        int result2 = sumDef.sum(8, 9, 10);
        System.out.println("Сумма: " + result2);

        sumDef.div(20,5);
        sumDef.div(10,7);


        sumDef One = new sumDef();
        One.results(5);
    }

}
