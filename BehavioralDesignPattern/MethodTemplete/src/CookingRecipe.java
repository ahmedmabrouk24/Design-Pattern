// الفئة الأساسية Template Class
abstract class CookingRecipe {
    
    // طريقة الـTemplate اللي بتحكم الخوارزمية العامة
    public final void prepareRecipe() {
        gatherIngredients();
        cook();
        serve();
    }

    // الخطوات اللي بيتم تنفيذها في جميع الوصفات
    private void gatherIngredients() {
        System.out.println("Gathering basic ingredients.");
    }
    
    // خطوة طبخ الطعام اللي الفئات الفرعية هتخصصها
    protected abstract void cook();
    
    // الخطوة الأخيرة، تقديم الطعام
    private void serve() {
        System.out.println("Serving the dish.");
    }
}