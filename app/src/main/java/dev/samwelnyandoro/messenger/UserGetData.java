package dev.samwelnyandoro.messenger;


import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import dev.samwelnyandoro.messenger.service.model.UserModel;


public class UserGetData
{
    static FirebaseFirestore db;

    public static void user(String username)
    {
        db = FirebaseFirestore.getInstance();

        DocumentReference docRef = db.collection("users").document(username);
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>()
        {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task)
            {
                if (task.isSuccessful())
                {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists())
                    {
                        String name = document.getString("name");
                        String last_seen = document.getString("last_seen");
                        String on_off_status = document.getString("on_off_status");
                        String photo = document.getString("photo");
                        String status = document.getString("status");

                        UserModel.setLast_seen(last_seen);
                        UserModel.setOn_off_status(on_off_status);
                        UserModel.setStatus(status);
                        UserModel.setName(name);
                        UserModel.setPhoto(photo);

                       // Toast.makeText(context, username, Toast.LENGTH_SHORT).show();

                        UserModel.setUsername(username);

                        Log.d("TAG", "DocumentSnapshot data: " + document.getData());
                    }
                    else
                    {
                        Log.d("TAG", "No such document");
                    }
                } else {
                    Log.d("TAG", "get failed with ", task.getException());
                }
            }
        });


    }
}
