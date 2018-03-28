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
            DetailActivity.class.getSimpleName() + ".extra_word";

    @Override
    protected Fragment getFragment() {
        Toolbar toolbar = findViewById(R.id.detail_action_bar);
        setSupportActionBar(toolbar);
        Bundle bundle = getIntent().getBundleExtra("Bundle");
        ArrayList<Detail> details = bundle.getParcelableArrayList(EXTRA_DETAIL);
        return DetailFragment.newInstance(details);
    }

    public static Intent newIntent(Context packageContext, ArrayList<Detail> details) {
        Intent intent = new Intent(packageContext, DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(EXTRA_DETAIL, details);
        intent.putExtra("Bundle", bundle);
        return intent;
    }
}
