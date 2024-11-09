package com.example.weatherappapo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa TabLayout e ViewPager2
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        ViewPager2 viewPager = findViewById(R.id.view_pager);

        // Configura o adaptador para o ViewPager2
        FragmentAdapter fragmentAdapter = new FragmentAdapter(this);
        viewPager.setAdapter(fragmentAdapter);

        // Associa o TabLayout ao ViewPager2
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            // Definir o título das abas
            if (position == 0) {
                tab.setText("RecyclerView");
            } else if (position == 1) {
                tab.setText("Sobre");
            }
        }).attach();
    }
}
