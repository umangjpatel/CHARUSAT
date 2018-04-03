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
    TextView mTitle;
    TextView mFullFormTitle;
    TextView mCaptionTitle;
    TextView mSubtitle;
    @RequiresApi(api = Build.VERSION_CODES.ECLAIR)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_splash,container,false);
        mCharusatLogo = view.findViewById(R.id.card_view);
        mTitle = view.findViewById(R.id.main_title);
        mFullFormTitle = view.findViewById(R.id.fullForm_text);
        mCaptionTitle = view.findViewById(R.id.fullInfo_text);
        mSubtitle = view.findViewById(R.id.extraInfo_text);
        Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.custom_animation);
        mCharusatLogo.startAnimation(animation);

        Animation mTitleAnimation = AnimationUtils.loadAnimation(getActivity(),R.anim.text_animation);
        Animation mFullFormAnimation = AnimationUtils.loadAnimation(getActivity(),R.anim.text_animation);
        Animation mCaptionAnimation = AnimationUtils.loadAnimation(getActivity(),R.anim.text_animation);
        Animation mSubtitleAnimation = AnimationUtils.loadAnimation(getActivity(),R.anim.text_animation);
        mTitle.startAnimation(mTitleAnimation);
        mFullFormTitle.setAnimation(mFullFormAnimation);
        mCaptionTitle.setAnimation(mCaptionAnimation);
        mSubtitle.setAnimation(mSubtitleAnimation);


        new Handler().postDelayed(() -> {
            /* Create an Intent that will start the Menu-Activity. */
            startActivity(new Intent(getActivity(),HomeActivity.class));
            Objects.requireNonNull(getActivity()).overridePendingTransition(R.anim.downtoup, R.anim.downtoup);
            getActivity().finish();
        }, 3500);
        return view;

    }

}
