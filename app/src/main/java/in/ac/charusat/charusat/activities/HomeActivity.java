package in.ac.charusat.charusat.activities;

import android.support.v4.app.Fragment;

import in.ac.charusat.charusat.fragments.HomeFragment;

public class HomeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment getFragment() {
        return new HomeFragment();
    }
}
