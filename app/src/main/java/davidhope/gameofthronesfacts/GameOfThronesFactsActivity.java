package davidhope.gameofthronesfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class GameOfThronesFactsActivity extends Activity {
    TheFacts mTheFacts = new TheFacts();
    BackgroundColorsForStarkFacts mBackgroundColorsForEachFact = new BackgroundColorsForStarkFacts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_of_thrones_facts);

        final TextView factText = (TextView) findViewById(R.id.fact);
        final Button revealNextFact = (Button) findViewById(R.id.fact_button);
        final RelativeLayout appLayout = (RelativeLayout) findViewById(R.id.mainAppLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String facts = mTheFacts.factSelector();

           int backgrounds = mBackgroundColorsForEachFact.backgroundColorSelector((mBackgroundColorsForEachFact.mHouseBackgroundColors));

                factText.setText(facts);
             //factText.setTextColor();
            appLayout.setBackgroundColor(backgrounds);
            }
        };


        revealNextFact.setOnClickListener(listener);

    }
}
