package com.example.weatherappapo;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(FragmentActivity fa) {
        super(fa);
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new RecyclerViewFragment();
            case 1:
                return new SobreFragment();
            default:
                return new RecyclerViewFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
