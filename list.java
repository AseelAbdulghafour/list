import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<String> FavList = new ArrayList<>();
    FavList.add("lord of the rings");
    FavList.add("harry potter");
    FavList.add("black list");
    FavList.add("the hunger games");
    FavList.add("game of thrones");

    FavList.remove(2);

    for (int i = 0; i < FavList.size(); i++)

      System.out.println(FavList.get(i));

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}