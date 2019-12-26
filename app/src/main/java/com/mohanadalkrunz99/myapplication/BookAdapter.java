package com.mohanadalkrunz99.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookVh> {

    Context context ;
    List<Book> bookList;

    public BookAdapter(Context context ,  List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.row_book , parent , false);
        return new BookVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookVh holder, int position) {
        holder.setData(bookList.get(position));
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    class BookVh extends RecyclerView.ViewHolder{
      TextView  book_name , author_name , book_desc , book_date;
        public BookVh(@NonNull View itemView) {
            super(itemView);
            book_name = itemView.findViewById(R.id.book_name);
            author_name = itemView.findViewById(R.id.std_name);
            book_desc = itemView.findViewById(R.id.std_desc);
            book_date = itemView.findViewById(R.id.std_date);
         }

        public void setData(Book book) {
            book_name.setText(book.getName());
            author_name.setText(book.getAuthor());
            book_desc.setText(book.getDescription());
            book_date.setText(book.getDate());
        }
    }
}
