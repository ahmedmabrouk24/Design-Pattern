public class Main {
    public static void main(String[] args) {
        // طهي الباستا
        CookingRecipe pasta = new PastaRecipe();
        pasta.prepareRecipe();
        
        System.out.println();

        // طهي الحساء
        CookingRecipe soup = new SoupRecipe();
        soup.prepareRecipe();
    }
}