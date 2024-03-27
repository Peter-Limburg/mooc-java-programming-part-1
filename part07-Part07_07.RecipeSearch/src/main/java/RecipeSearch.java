
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class RecipeSearch {
    static ArrayList<Recipe> recipes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read:");
        String input = scanner.nextLine();
        readerSorter(input);
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println();
        System.out.println("Enter command:");
        String command = scanner.nextLine();
        switch (command) {
            case "list":
                readerList(input);
                break;
            case "find name":
                System.out.println("Searched word:");
                String searchedWord = scanner.nextLine();
                readerName(searchedWord);
                break;
            case "find cooking time":
                System.out.println("Max cooking time:");
                String timing = scanner.nextLine();
                readerTime(Integer.parseInt(timing));
                break;
            case "find ingredient":
                System.out.println("Ingredient:");
                String ing = scanner.nextLine();
                readerIng(ing);
                break;
        }
    }

        public static void readerList (String input) {
            for (Recipe recipe : recipes) {
                System.out.println(recipe);
            }
        }

        public static void readerName (String searchedWord){
            for (Recipe recipe : recipes) {
                if (recipe.getName().contains(searchedWord)) {
                    System.out.println(recipe);
                }
            }
        }

        public static void readerSorter(String inp) {
            try (Scanner scan = new Scanner(Paths.get(inp))) {
                recipes.clear();
                while (scan.hasNextLine()) {
                    String row = scan.nextLine();
                    int cookTime = Integer.valueOf(scan.nextLine());
                    List<String> ingredients = new ArrayList<>();
//                    String line = scan.nextLine();
//                    while (!line.isEmpty()) {
//                        ingredients.add(line);
//                        line = scan.nextLine();
//                    }
                    while (scan.hasNextLine()) {
                        String line = scan.nextLine();
                        if (line.isEmpty()) {
                            break; // Exit the loop if an empty line is encountered
                        }
                        ingredients.add(line);
                    }
                    Recipe recipe = new Recipe(row, cookTime, ingredients);
                    recipes.add(recipe);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    public static void readerTime(int tim) {
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= tim) {
                System.out.println(recipe);
            }
        }

    }


        public static void readerIng(String ingr) {
            for (Recipe recipe : recipes) {
                if (recipe.getIngredients().contains(ingr)) {
                    System.out.println(recipe);
                }
        }

    }
}





//read file given by user
//when reading, search by specified criteria of name, time, ingredients