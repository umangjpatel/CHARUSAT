package in.ac.charusat.charusat.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.fragments.DetailFragment;
import in.ac.charusat.charusat.models.Detail;

public class DetailActivity extends SingleFragmentActivity {
    private static final String EXTRA_DETAIL =
            DetailActivity.class.getSimpleName() + ".extra_word",
            EXTRA_DETAIL_TOOLBAR_TITLE =
            DetailActivity.class.getSimpleName() + ".extra_detail_toolbar_title";

    @Override
    protected Fragment getFragment() {
        Toolbar appToolbar = findViewById(R.id.app_action_bar);
        appToolbar.setTitle(getIntent().getStringExtra(EXTRA_DETAIL_TOOLBAR_TITLE));
        appToolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        setSupportActionBar(appToolbar);
        appToolbar.setNavigationOnClickListener(v -> {
            finish();
        });
        Bundle bundle = getIntent().getBundleExtra("Bundle");
        ArrayList<Detail> details = bundle.getParcelableArrayList(EXTRA_DETAIL);
        return DetailFragment.newInstance(details);
    }

    public static Intent newIntent(Context packageContext, String titleResString, ArrayList<Detail> details) {
        Intent intent = new Intent(packageContext, DetailActivity.class);
        intent.putExtra(EXTRA_DETAIL_TOOLBAR_TITLE, titleResString);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(EXTRA_DETAIL, details);
        intent.putExtra("Bundle", bundle);
        return intent;
    }
}
