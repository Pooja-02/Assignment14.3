package com.acadgild.assignment_144;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PermissionFragment extends Fragment {
    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup conatiner, Bundle savedInsatnceState){
        return inflater.inflate(R.layout.fragment_main,null);
    }
}