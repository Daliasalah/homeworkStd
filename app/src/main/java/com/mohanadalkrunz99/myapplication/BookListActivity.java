package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BookListActivity extends AppCompatActivity {

    RecyclerView booksList_rv;
    BookAdapter bookAdapter;

    List<Book> bookList  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        bookList.add(new Book("Dalia Salah ","student in alazhar uni","Styding software engineering","10/10/2010"));//
         bookList.add(new Book("Heba ","Islamic university","Building engineering","1/10/2010"));//
        bookList.add(new Book("Tasneem ","Palistine university","Biomedical engineering","3/10/2010"));//
        bookList.add(new Book("Tasneem ","Palistine university","Biomedical engineering","3/10/2010"));//
        bookList.add(new Book("Tasneem ","Palistine university","Biomedical engineering","3/10/2010"));//
        //


        booksList_rv = findViewById(R.id.booksList_rv);
        booksList_rv.setLayoutManager(new LinearLayoutManager(this));
        bookAdapter = new BookAdapter(this ,bookList);
        booksList_rv.setAdapter(bookAdapter);
    }
}
