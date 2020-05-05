package org.example.pltw.medialib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);

        Greeter greeter = new Greeter();
        welcomeText.setText(greeter.message);
    }

    /**
     * This method is called when the Show Contents button is clicked
     **/
    public void showMedia(View v) {
        TextView outputText = (TextView) findViewById(R.id.mediaLibText);

        Song song1 = new Song(1, "The best song", .99, 7);
        Song song2 = new Song(1, "The second best song", .99, 7);
        Movie movie1 = new Movie("The best movie", 97);
        Movie movie2 = new Movie("The second best movie", 97);
        Book book1 = new Book("The best book", 4);
        Book book2 = new Book("The second best book", 4);

//        outputText.append("none");
        outputText.append("Songs:\n");
        outputText.append(song1.getTitle() + "\n");
        outputText.append(song2.getTitle() + "\n");
        outputText.append("\nMovies:\n");
        outputText.append(movie1.getTitle() + "\n");
        outputText.append(movie2.getTitle() + "\n");
        outputText.append("\nBooks:\n");
        outputText.append(book1.getTitle() + "\n");
        outputText.append(book2.getTitle() + "\n");

        System.out.print(song1.getTitle() + "\n");
        System.out.print(movie1.getTitle() + "\n");
        System.out.print(book1.getTitle() + "\n");
    }
}
