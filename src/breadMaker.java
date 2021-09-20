public class breadMaker {
    private static whiteBread butter = new butterSauce();
    private static whiteBread jam = new JamBread();

    private static branBread Nutella = new NutellaBread();
    private static branBread Garlic = new GarlicBread();

    public static breadFactory getFactory(String choice){
        if("Barn Bread".equalsIgnoreCase(choice)){
            return new barnBreadFactory();
        }
        else if("White Bread".equalsIgnoreCase(choice)){
            return new whiteBreadFactory();
        }

        return null;
    }

    public static void makeWhiteBread()
    {
        butter.prepare();
        jam.prepare();
    }

    public static void makeBarnBread()
    {
        Nutella.prepare();
        Garlic.prepare();
    }
}
