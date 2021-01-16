package com.Martins.pidapp.ui.PID;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.Martins.pidapp.R;

public class PIDFragment extends Fragment {

    private PIDViewModel PIDViewModel;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PIDViewModel =
                new ViewModelProvider(this).get(PIDViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pid, container, false);

        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /*EditText ed = (EditText)getActivity().findViewById(R.id.txtKd);

        ed.getText();*/

        Button btnLoad = (Button) getActivity().findViewById(R.id.btnLoad);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtMaxSpeed = (EditText) getActivity().findViewById(R.id.txtMaxSpeed);
                EditText txtKp = (EditText) getActivity().findViewById(R.id.txtKp);
                EditText txtKd = (EditText) getActivity().findViewById(R.id.txtKd);
                EditText txtKi = (EditText) getActivity().findViewById(R.id.txtKi);

                // get PID parameters. Syntax: #[int],[float],[float],[float]\n

                txtMaxSpeed.setText("100");
                txtKp.setText("1.11");
                txtKd.setText("2.22");
                txtKi.setText("3.33");

                Context context = getActivity().getApplicationContext();
                Toast.makeText(context, "Loaded", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnSave = (Button) getActivity().findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtMaxSpeed = (EditText) getActivity().findViewById(R.id.txtMaxSpeed);
                EditText txtKp = (EditText) getActivity().findViewById(R.id.txtKp);
                EditText txtKd = (EditText) getActivity().findViewById(R.id.txtKd);
                EditText txtKi = (EditText) getActivity().findViewById(R.id.txtKi);


                // Update all PID parameters. Syntax: #[int],[float],[float],[float]\n

                txtMaxSpeed.setText("200");
                txtKp.setText("2.11");
                txtKd.setText("3.22");
                txtKi.setText("4.33");

                Context context = getActivity().getApplicationContext();
                Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        EditText txtMaxSpeed = (EditText) getActivity().findViewById(R.id.txtMaxSpeed);
        EditText txtKp = (EditText) getActivity().findViewById(R.id.txtKp);
        EditText txtKd = (EditText) getActivity().findViewById(R.id.txtKd);
        EditText txtKi = (EditText) getActivity().findViewById(R.id.txtKi);

        outState.putCharSequence("txtMaxSpeed", txtMaxSpeed.getText());
        outState.putCharSequence("txtKp", txtKp.getText());
        outState.putCharSequence("txtKd", txtKd.getText());
        outState.putCharSequence("txtKi", txtKi.getText());
    }

    @Override
    public void onDetach() {
        super.onDetach();

        /*EditText txtMaxSpeed = (EditText) getActivity().findViewById(R.id.txtMaxSpeed);
        EditText txtKp = (EditText) getActivity().findViewById(R.id.txtKp);
        EditText txtKd = (EditText) getActivity().findViewById(R.id.txtKd);
        EditText txtKi = (EditText) getActivity().findViewById(R.id.txtKi);

        Double val = Double.parseDouble(txtKp.toString());
        PIDViewModel.Kd = val;*/
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);

        /*EditText txtMaxSpeed = (EditText) getActivity().findViewById(R.id.txtMaxSpeed);
        EditText txtKp = (EditText) getActivity().findViewById(R.id.txtKp);
        EditText txtKd = (EditText) getActivity().findViewById(R.id.txtKd);
        EditText txtKi = (EditText) getActivity().findViewById(R.id.txtKi);

        txtMaxSpeed.setText(savedInstanceState.getCharSequence("txtMaxSpeed"));
        txtKp.setText(savedInstanceState.getCharSequence("txtKp"));
        txtKd.setText(savedInstanceState.getCharSequence("txtKd"));
        txtKi.setText(savedInstanceState.getCharSequence("txtKi"));*/
    }
}