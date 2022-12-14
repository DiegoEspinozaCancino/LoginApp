package com.example.loginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class MainRecyclerView extends AppCompatActivity {

    private RecyclerView recyclerViewUser;
    private  RecyclerViewAdapter userAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_layout);

        recyclerViewUser = (RecyclerView)findViewById(R.id.recyclerUsers);
        recyclerViewUser.setLayoutManager(new LinearLayoutManager(this));

        userAdapter = new RecyclerViewAdapter(gettingUsers());
        recyclerViewUser.setAdapter(userAdapter);
    }


    public List<UserModel> gettingUsers(){
        List <UserModel> User = new ArrayList<>();
        User.add(new UserModel("annon","12-09-2022",R.drawable.vlogo));
        User.add(new UserModel("El_azikhalao20","12-09-2022",R.drawable.kidselfie));
        User.add(new UserModel("Andrea","12-09-2022",R.drawable.girlpic));
        User.add(new UserModel("Sandra","12-09-2022",R.drawable.animepic));
        User.add(new UserModel("annon","12-09-2022",R.drawable.vlogo));
        User.add(new UserModel("Andres","12-09-2022",R.drawable.userlogo2));
        User.add(new UserModel("El_azikhalao20","12-09-2022",R.drawable.kidselfie));
        User.add(new UserModel("Sandra","12-09-2022",R.drawable.animepic));
        User.add(new UserModel("annon","12-09-2022",R.drawable.vlogo));
        User.add(new UserModel("Andres","12-09-2022",R.drawable.userlogo2));
        User.add(new UserModel("Andrea","12-09-2022",R.drawable.girlpic));
        User.add(new UserModel("El_azikhalao20","12-09-2022",R.drawable.kidselfie));
        User.add(new UserModel("annon","12-09-2022",R.drawable.vlogo));
        User.add(new UserModel("Andres","12-09-2022",R.drawable.userlogo2));
        User.add(new UserModel("El_azikhalao20","12-09-2022",R.drawable.kidselfie));
        User.add(new UserModel("Sandra","12-09-2022",R.drawable.animepic));
        return User;
    }
}