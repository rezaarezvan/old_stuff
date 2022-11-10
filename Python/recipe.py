class Recipe:
    def __init__(self, name, ingredients, difficulty, time, rating, URL):
        self.name:        str       = name
        self.ingredients: set = ingredients
        self.difficulty:  int       = difficulty
        self.time:        int       = time
        self.rating:      float     = rating
        self.URL:         str       = URL

    def __str__(self):
        return f"\nName: {self.name} \nIngredients: {self.ingredients} \nDifficulty: {self.ingredients} \nTime: {self.time} \nRating {self.rating} \nURL: {self.URL}"

def filter(recipeList: list[Recipe]):
    filter = input("\nFilter search - press Enter to skip, seperated by spaces - no commas\n")
    if(filter == ""):
        return
    else:
        t = set(filter.lower().split())
        if t == {'ingredients'} :
            ingredients = input("\nInput what ingredients you have available\n")
            ingredients = set(ingredients.split())

            for recipe in recipeList:
                if(recipe.ingredients == ingredients):
                    print("With the ingredients given you can make: " + recipe.name)

def main():
    recipeList = []
    test = Recipe("Test" , {"ägg", "socker", "smör"} , 1, 30, 4.5, "-")
    recipeList.append(test)

    filter(recipeList)

if __name__ == "__main__":
    main()


