package com.Martins.pidapp.ui.dashboard;

import android.widget.EditText;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.Martins.pidapp.R;

public class DashboardViewModel extends ViewModel {

    public double Kp;
    public double Kd;
    public double Ki;
    public int MaxSpeed;


    public DashboardViewModel() {

        
    }
}