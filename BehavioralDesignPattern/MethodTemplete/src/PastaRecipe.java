// فئة فرعية وصفة أكلة محددة
class PastaRecipe extends CookingRecipe {
    
    @Override
    protected void cook() {
        System.out.println("Boiling pasta and adding sauce.");
    }
}