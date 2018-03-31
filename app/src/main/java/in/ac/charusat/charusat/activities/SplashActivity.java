package in.ac.charusat.charusat.activities;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

import in.ac.charusat.charusat.R;

public class SplashActivity extends AwesomeSplash {


    @Override
    public void initSplash(ConfigSplash configSplash) {


        //Customize Circular Reveal
        configSplash.setBackgroundColor(R.color.colorPrimary); //any color you want form colors.xml
        configSplash.setAnimCircularRevealDuration(700); //int ms
        configSplash.setRevealFlagX(Flags.REVEAL_LEFT);  //or Flags.REVEAL_LEFT
        configSplash.setRevealFlagY(Flags.REVEAL_TOP); //or Flags.REVEAL_TOP

        //Customize Logo
        configSplash.setLogoSplash(R.drawable.splash);   //or any other drawable
        configSplash.setAnimLogoSplashDuration(1100); //int ms
        configSplash.setAnimLogoSplashTechnique(Techniques.ZoomIn); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)

        configSplash.setTitleSplash(" ");
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void animationsFinished() {
        Intent mainIntent = new Intent(this, HomeActivity.class);
        startActivity(mainIntent);
        finish();
        overridePendingTransition(R.anim.downtoup, R.anim.downtoup);

    }
}

