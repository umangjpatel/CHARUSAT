package in.ac.charusat.charusat.activities;

import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.fragments.HomeFragment;

public class HomeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment getFragment() {
        Toolbar appToolbar = findViewById(R.id.app_action_bar);
        appToolbar.setTitle(R.string.app_name);
        setSupportActionBar(appToolbar);
        return new HomeFragment();
    }
}
