public class MadLibs {
  /*
   * This program generates a mad libbed story.
   * Author: junowoz
   * Date: 2023
   */
  public static void main(String[] args) {

    String name1 = "Juan";
    String name2 = "Pedro";
    String adjective1 = "happy";
    String adjective2 = "sad";
    String adjective3 = "angry";
    String verb1 = "run";
    String noun1 = "dog";
    String noun2 = "cat";
    String noun3 = "bird";
    String noun4 = "fish";
    String noun5 = "water";
    String noun6 = "human";
    int number = 2023;
    String place1 = "Mexico";

    String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2
        + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to "
        + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3
        + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped "
        + name1 + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number
        + ", in a world where " + noun6 + "s ruled the world.";

      System.out.println(story);

  }
}
