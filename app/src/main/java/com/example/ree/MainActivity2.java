package com.example.ree;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ree.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {

    ActivityMainBinding binding;
    String Names, Village,Age,Gender,Time,Date;
    FirebaseDatabase database;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        binding.but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Names = binding.Names.getText().toString();
                Village = binding.Village.getText().toString();
                Age = binding.Age.getText().toString();
                Gender = binding.Gender.getText().toString();
                Time = binding.Time.getText().toString();
                Date = binding.Date.getText().toString();

                if (Names.isEmpty() && Village.isEmpty() && Age.isEmpty() && Gender.isEmpty() && Time.isEmpty() && Date.isEmpty())
                {
                    doctor doctor = new doctor(Names, Village,Age,Gender,Time,Date);
                    database = FirebaseDatabase.getInstance();
                    reference = FirebaseDatabase.getInstance().getReference("doctor");

                    reference.child(Names).setValue(doctor).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            binding.Names.setText("");
                            binding.Village.setText("");
                            binding.Age.setText("");
                            binding.Gender.setText("");
                            binding.Time.setText("");
                            binding.Date.setText("");

                            Toast.makeText(MainActivity2.this, "Successfully Sent",Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
    }

    public void but(View view) {
    }
}