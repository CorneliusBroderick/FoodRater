package ie.ul.cbroderick.foodrater;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by boutell on 11/6/2015.
 */
public class Food {

  private String mName;
  private int mImageResourceId;
  private float mRating;
  private Random random = new Random();

  public static final HashMap<String, Integer> sFoodImageMap;
  static {
    sFoodImageMap = new HashMap<>();
    sFoodImageMap.put("Jessica 1826", R.drawable.cow4);
    sFoodImageMap.put("Lotto  1377", R.drawable.cow1);
    sFoodImageMap.put("Nancy 853", R.drawable.cow3);
    sFoodImageMap.put("Danny  1021", R.drawable.cow3);

  }

  public Food() {
    mName = getRandomFoodName();
    mImageResourceId = sFoodImageMap.get(mName);
    mRating = 0.0f;
  }

  private String getRandomFoodName() {
    Object[] foods = Food.sFoodImageMap.keySet().toArray();
    return (String)foods[random.nextInt(foods.length)];
  }

  public String getName() {
    return mName;
  }

  public float getRating() {
    return mRating;
  }

  public void setRating(float rating) {
    mRating = rating;
  }

  public int getImageResourceId() {
    return mImageResourceId;
  }
}
