package com.example.td5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {
    List<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);

        // Initialisation
        contacts.add(new Contact("HRAMCHI", "Hamza", "https://cdn.iconscout.com/icon/free/png-256/developer-2309906-1943816.png"));
        contacts.add(new Contact("MOUSAOUI", "Yahya", "https://cdn3.iconfinder.com/data/icons/software-development-flat-colorful/2048/5438_-_Software_Developer-512.png"));
        contacts.add(new Contact("KHOUYA", "Ayoub", "https://cdn0.iconfinder.com/data/icons/search-engine-optimization-29/66/5-512.png"));
        contacts.add(new Contact("ATABIT", "Meryeme", "https://img.flaticon.com/icons/png/512/1508/1508843.png?size=1200x630f&pad=10,10,10,10&ext=png&bg=FFFFFFFF"));
        contacts.add(new Contact("EL HADRI", "Farah", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMeXbmn2_9-Y6lvkDJ_XuDVkNdcHj1OTAzQg&usqp=CAU"));

        // Create adapter + initialisation
        ContactsAdapter adapter = new ContactsAdapter(contacts);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

    }
}