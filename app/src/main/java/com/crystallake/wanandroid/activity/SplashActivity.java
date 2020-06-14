package com.crystallake.wanandroid.activity;

import android.content.Intent;

import com.airbnb.lottie.LottieAnimationView;
import com.crystallake.wanandroid.MainActivity;
import com.crystallake.wanandroid.R;
import com.crystallake.wanandroid.contract.main.SplashContract;
import com.crystallake.wanandroid.mvp.presenter.SplashPresenter;

import butterknife.BindView;

/**
 * Created by yds
 * on 2020/6/14.
 */
public class SplashActivity extends BaseActivity<SplashPresenter> implements SplashContract.View {
    @BindView(R.id.one_animation)
    LottieAnimationView mOneAnimationView;
    @BindView(R.id.two_animation)
    LottieAnimationView mTwoAnimationView;
    @BindView(R.id.three_animation)
    LottieAnimationView mThreeAnimationView;
    @BindView(R.id.four_animation)
    LottieAnimationView mFourAnimationView;
    @BindView(R.id.five_animation)
    LottieAnimationView mFiveAnimationView;
    @BindView(R.id.six_animation)
    LottieAnimationView mSixAnimationView;
    @BindView(R.id.seven_animation)
    LottieAnimationView mSevenAnimationView;
    @BindView(R.id.eight_animation)
    LottieAnimationView mEightAnimationView;
    @BindView(R.id.nine_animation)
    LottieAnimationView mNineAnimationView;
    @BindView(R.id.ten_animation)
    LottieAnimationView mTenAnimationView;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initToolbar() {

    }

    @Override
    protected void initEventAndData() {
        startAnimation(mOneAnimationView, "W.json");
        startAnimation(mTwoAnimationView, "A.json");
        startAnimation(mThreeAnimationView, "N.json");
        startAnimation(mFourAnimationView, "A.json");
        startAnimation(mFiveAnimationView, "N.json");
        startAnimation(mSixAnimationView, "D.json");
        startAnimation(mSevenAnimationView, "R.json");
        startAnimation(mEightAnimationView, "I.json");
        startAnimation(mNineAnimationView, "O.json");
        startAnimation(mTenAnimationView, "D.json");
    }

    @Override
    public void jumpToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
    }
    private void startAnimation(LottieAnimationView lottieAnimationView,String animationName){
        lottieAnimationView.setAnimation(animationName);
        lottieAnimationView.playAnimation();
    }
    private void cancelAnimation(){
        cancelAnimation(mOneAnimationView);
        cancelAnimation(mTwoAnimationView);
        cancelAnimation(mThreeAnimationView);
        cancelAnimation(mFourAnimationView);
        cancelAnimation(mFiveAnimationView);
        cancelAnimation(mSixAnimationView);
        cancelAnimation(mSevenAnimationView);
        cancelAnimation(mEightAnimationView);
        cancelAnimation(mNineAnimationView);
        cancelAnimation(mTenAnimationView);
    }
    private void cancelAnimation(LottieAnimationView lottieAnimationView){
        if (lottieAnimationView!=null){
            lottieAnimationView.cancelAnimation();
        }
    }

    @Override
    protected void onDestroy() {
        cancelAnimation();
        super.onDestroy();
    }
}
