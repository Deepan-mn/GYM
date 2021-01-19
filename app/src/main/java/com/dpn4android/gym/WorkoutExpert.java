package com.dpn4android.gym;

import java.util.ArrayList;
import java.util.List;
// part 4 steps
public class WorkoutExpert {

    List<String> getWorkouts(String workoutTypes) {

        ArrayList<String> workout = new ArrayList<>();

        if (workoutTypes.equals("Chest"))
        {
            workout.add("Barbell bench press");
            workout.add("pec Deck");
            workout.add("Cable crossover");
            workout.add("Chest press");
            workout.add("Inclined dumbbell flies");
            workout.add("Dips");
            workout.add("Pushpups");


        }
//        Barbell bench press.
//                Pec deck.
//                Cable crossover.
//                Chest press.
//                Inclined dumbbell flies.
//        Dips.
//                Pushups.
        if(workoutTypes.equals("Shoulder"))
        {
            workout.add("Seated Dumbbell Shoulder Press");
            workout.add("Front Raise");
            workout.add("Reverse Pec Deck Fly");
            workout.add("Bent-Over Dummbbell Lateral Raise");
            workout.add("Reverse Cable Crossover");

        }
//        Seated Dumbbell Shoulder Press. ...
//        Front Raise. ...
//        Reverse Pec Deck Fly. ...
//        Bent-Over Dumbbell Lateral Raise. ...
//        Dumbbell Lateral Raise. ...
//        Push Press. ...
//        Reverse Cable Crossover.
        if(workoutTypes.equals("Bisceps"))
        {
            workout.add("Alternating Incline Dumbbel curl");
            workout.add("Seated Alternating Hammer curl");
            workout.add("Standing Reverse Barbell curll");
            workout.add("Seated Alternating Dumbbel curl");
            workout.add("Zottman curl");
            workout.add("Decline Dumbbell curl");
        }
//        Alternating Incline Dumbbell Curl. ...
//        Seated Alternating Hammer Curl. ...
//        Standing Reverse Barbell Curl. ...
//        Seated Alternating Dumbbell Curl. ...
//        Standing Cable Curl. ...
//        Standing Barbell Curl. ...
//        Zottman Curl. ...
//        Decline Dumbbell Curl.
        if(workoutTypes.equals("Triceps")){
            workout.add("Lying Tricerps Extension");
            workout.add("Tricep Dips");
            workout.add("Diamon push-ups");
            workout.add("Bench Dip");
        }
//        Lying Triceps Extension. ...
//        Tricep Dips. ...
//        Diamond Push-Ups. ...
//        Bench Dip. ...
//        One-Arm Overhead Extension. ...
//        Standard Push-Up.

    return workout;

    }
}
