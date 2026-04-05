package lesson_11

fun main() {

}

class RecipeCategory(
    val id: Int,
    val categoryName: String,
    val imageUrl: String,
)

class Ingredient(
    val id: Int,
    val ingredientName: String,
    val quantity: Double,
    val unit: String,
)

class Recipe(
    val id: Int,
    val categoryId: Int,
    val title: String,
    val imageUrl: String,
    val ingredients: List<Ingredient>,
    val description: String,
    val cookMethod: List<String>,
    val numberServings: Int,
    val isFavorite: Boolean = false,
)