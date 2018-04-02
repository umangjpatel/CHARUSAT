package in.ac.charusat.charusat.activities;

import android.support.v4.app.Fragment;

import in.ac.charusat.charusat.fragments.SplashFragment;

public class SplashActivity extends SingleFragmentActivity {

    @Override
    protected Fragment getFragment() {
        return new SplashFragment();
    }
}

