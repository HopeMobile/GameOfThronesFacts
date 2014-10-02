package davidhope.gameofthronesfacts;

import android.graphics.Color;

/**
 * Created by David on 9/29/2014.
 */
@SuppressWarnings("InfiniteRecursion")
public class BackgroundColorsForStarkFacts {
    TheFacts mHouseFacts = new TheFacts();
    public String[] mHouseBackgroundColors = {
        "#fff", // Stark
        "#e55757", // Lannister
        "#000", // Targaryen
        "#fff026", // Baratheon
        "#ff8d00"  // Martell
    };

    public int backgroundColorSelector(String[] mHouseBackgroundColor) {

        if (mHouseFacts.factSelector()==(mHouseFacts.mFactsAboutTheGreatHouses[0]))  {
           backgroundColorSelector(new String[]{mHouseBackgroundColors[0]});
        }
        else if (mHouseFacts.factSelector() == (mHouseFacts.mFactsAboutTheGreatHouses[1])) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[0]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[2]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[0]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[3]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[1]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[4]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[1]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[5]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[1]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[6]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[2]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[7]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[2]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[8]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[2]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[9]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[3]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[10]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[3]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[11]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[3]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[12]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[4]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[13]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[4]});
        }
        else if (mHouseFacts.factSelector() == mHouseFacts.mFactsAboutTheGreatHouses[14]) {
            backgroundColorSelector(new String[]{mHouseBackgroundColors[4]});
        }
      //String background = backgroundColorSelector(mHouseBackgroundColor);
        int backgrounds = Color.parseColor(String.valueOf(backgroundColorSelector(mHouseBackgroundColor)));

        return  backgrounds;
    }
}
