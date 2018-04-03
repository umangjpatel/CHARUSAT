package in.ac.charusat.charusat.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.fragments.InfoListFragment;

public class InfoListActivity extends SingleFragmentActivity {

    private static final String EXTRA_DEPT_NAME =
            InfoListActivity.class.getSimpleName() + "extra_dept_name";

    @Override
    protected Fragment getFragment() {
        Toolbar appToolbar = findViewById(R.id.app_action_bar);
        appToolbar.setTitle(getIntent().getStringExtra(EXTRA_DEPT_NAME));
        appToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(appToolbar);
        appToolbar.setNavigationOnClickListener(v -> finish());
        return InfoListFragment.newInstance(getIntent().getStringExtra(EXTRA_DEPT_NAME));
    }

    public static Intent newIntent(Context packageContext, String deptName) {
        Intent intent = new Intent(packageContext, InfoListActivity.class);
        intent.putExtra(EXTRA_DEPT_NAME, deptName);
        return intent;
    }
}
