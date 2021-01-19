package com.dpn4android.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private WorkoutExpert expert =new WorkoutExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindWorkout(View view){

        TextView workouts =findViewById(R.id.textview);
        Spinner workoutType=findViewById(R.id.workouttype);
        String workout=String.valueOf(workoutType.getSelectedItem());
//        workouts.setText(workout);
        List<String> workoutList =expert.getWorkouts(workout);

        StringBuilder workoutformatted=new StringBuilder();
        for(String work:workoutList){
            workoutformatted.append(work).append("\n");
        }
        workouts.setText(workoutformatted);




    }
}