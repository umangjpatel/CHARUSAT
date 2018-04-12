package in.ac.charusat.charusat.fragments;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.animation.SpringAnimation;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

import in.ac.charusat.charusat.R;
import in.ac.charusat.charusat.activities.HomeActivity;
import in.ac.charusat.charusat.activities.SplashActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SplashFragment extends Fragment {


    public SplashFragment() {
        // Required empty public constructor
    }

    CardView mCharusatLogo;
    @RequiresApi(api = Build.VERSION_CODES.ECLAIR)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_splash,container,false);
        mCharusatLogo = view.findViewById(R.id.card_view);
        Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.custom_animation);
        mCharusatLogo.startAnimation(animation);

        new Handler().postDelayed(() -> {
            /* Create an Intent that will start the Menu-Activity. */
            startActivity(new Intent(getActivity(),HomeActivity.class));
            Objects.requireNonNull(getActivity()).overridePendingTransition(R.anim.downtoup, R.anim.downtoup);
            getActivity().finish();
        }, 2000);
        return view;

    }

}
