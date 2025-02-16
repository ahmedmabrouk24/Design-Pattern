// فئة فرعية وصفة أكلة مختلفة
class SoupRecipe extends CookingRecipe {
    
    @Override
    protected void cook() {
        System.out.println("Boiling vegetables and adding broth.");
    }
}