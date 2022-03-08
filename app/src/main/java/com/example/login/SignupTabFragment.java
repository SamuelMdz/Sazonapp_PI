package com.example.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {
    EditText nombre, email, contraseña, confcontraseña;
    Button signup;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);

        email = root.findViewById(R.id.email);
        contraseña = root.findViewById(R.id.password);
        confcontraseña = root.findViewById(R.id.password2);
        nombre = root.findViewById(R.id.nombre);
        signup = root.findViewById(R.id.Btn_signup);

        email.setTranslationX(800);
        contraseña.setTranslationX(800);
        confcontraseña.setTranslationX(800);
        nombre.setTranslationX(800);
        signup.setTranslationX(800);

        email.setAlpha(v);
        contraseña.setAlpha(v);
        confcontraseña.setAlpha(v);
        nombre.setAlpha(v);
        signup.setAlpha(v);

        nombre.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        contraseña.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();
        confcontraseña.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();
        signup.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(800).start();




        return root;
    }
}
