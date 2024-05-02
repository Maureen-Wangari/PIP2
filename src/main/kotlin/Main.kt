fun main(args: Array<String>) {
    addUser("user1", listOf("bread, milk, flour, cocoa, corn flakes"))
    addUser("user2", listOf("antiseptic, soap, colgate, wet wipes"))
    println(getRecommendations("user1"))
}
// Step 1: Define data structure for user preferences
val userPreferences: MutableMap<String, List<String>> = mutableMapOf()

fun addUser(userId: String, preferredCategories: List<String>) {
    userPreferences[userId] = preferredCategories
}
// get recommendations for users from system
fun getRecommendations(userId: String): List<String> {
    val preferredCategories = userPreferences[userId] ?: return emptyList()

    val recommendations = mutableListOf<String>()
    for (category in preferredCategories) {
        recommendations.add("userItems: $category")
        recommendations.add("userItems:$category")
    }
    return recommendations
}
