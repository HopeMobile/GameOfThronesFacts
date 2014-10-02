package davidhope.gameofthronesfacts;

import java.util.Random;

/**
 * Created by David on 9/21/2014.
 */
public class TheFacts {
   public String[] mFactsAboutTheGreatHouses = {
           //Facts 0-2 are Stark, 3-5 Lannister, 6-8 Targaryen, 9-11 Baratheon, 12-14 Martell.
           "The Stark family are descendants of Bran the Builder",
           "The second-to-last King Stark was Torrhen",
           "House Stark was founded during the Age of Heroes",
           "House Lannister was founded by Lann the Clever",
           "The Lannisters once possed a Valyrian Steel Sword named Brighroar",
           "King Loren the First was the last Lannister to be King",
           "Aegon the Conquerer was the first Targaryen to rule the Seven Kingdoms",
           "King Baelor the Blessed brought the once-sovereign region of Dorne into the Seven Kingdoms",
           "The Targaryens are originally from Valyria",
           "House Baratheon was created during the Wars of Conquest",
           "King Robert Baratheon ended the 283 years of rule by the Targaryens",
           "House Baratheon is the youngest of the 5 Great Houses",
           "House Martell are the rulers of Westeros southern-most region",
           "Women have equal rights in the Martell-ruled south",
           "House Martell and the rest of Dorne were the last to join the Seven Kingdoms" };

    //Random Fact Selector Method
    public String factSelector() {

        Random randomFactGenerator = new Random();
        int randomFactNumber = randomFactGenerator.nextInt(mFactsAboutTheGreatHouses.length);
        String fact = mFactsAboutTheGreatHouses[randomFactNumber];

       return fact;
    }

}
