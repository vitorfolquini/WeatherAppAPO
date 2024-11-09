package com.example.weatherappapo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.widget.ImageView;
import android.widget.TextView;

public class SobreFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Infla o layout do fragmento "Sobre"
        View rootView = inflater.inflate(R.layout.fragment_sobre, container, false);

        // Referência aos elementos do layout (TextView e ImageView)
        TextView nomeTextView = rootView.findViewById(R.id.name_text);
        TextView raTextView = rootView.findViewById(R.id.ra_text);
        TextView cursoTextView = rootView.findViewById(R.id.course_text);
        ImageView fotoImageView = rootView.findViewById(R.id.profile_image);

        // Defina os dados a serem exibidos no fragmento (dados fictícios como exemplo)
        nomeTextView.setText("Vitor Rohling Folquini");
        raTextView.setText("RA: 09049985");
        cursoTextView.setText("Curso: Analise e desenvolvimento de sistemas-Toledo-EAD");
        fotoImageView.setImageResource(R.drawable.eu); // Coloque a foto que você deseja exibir

        return rootView;
    }
}
