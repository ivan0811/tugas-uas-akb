package com.ivan.catatan_harian_10119003.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.ivan.catatan_harian_10119003.MainActivity;
import com.ivan.catatan_harian_10119003.R;
import com.ivan.catatan_harian_10119003.view.Catatan.AddCatatanActivity;

/*
    Nama : Ivan Faathirza
    Kelas : IF1
    NIM : 10119003
 */

public class LogoutFragment extends Fragment {
    private FirebaseAuth auth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        auth = FirebaseAuth.getInstance();

        View view = inflater.inflate(R.layout.fragment_logout, container, false);

        auth.signOut();
        Intent intent = new Intent(getActivity(), LoginActivity.class);
        startActivity(intent);
        return view;
    }
}