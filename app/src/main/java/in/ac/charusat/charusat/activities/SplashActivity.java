package in.ac.charusat.charusat.activities;

import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.View;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.fragments.SplashFragment;

public class SplashActivity extends SingleFragmentActivity {

    @Override
    protected Fragment getFragment() {
        Toolbar appToolbar = findViewById(R.id.app_action_bar);
        appToolbar.setVisibility(View.GONE);
        setSupportActionBar(appToolbar);
        return new SplashFragment();
    }
}

