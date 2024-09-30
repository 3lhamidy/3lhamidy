package org.mido.app.mymove;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.mido.app.mymove.R;

import java.util.ArrayList;
import java.util.List;

import Adapter.MoveAdapter;
import Model.MoveList;

public class MoveActivity extends AppCompatActivity {
    private List<MoveList> moveList= new ArrayList<>();
    private MoveAdapter myadabtor;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        recyclerView = findViewById(R.id.reycicleid);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(false);
        myadabtor= new MoveAdapter(this,moveList);
        recyclerView.setAdapter(myadabtor);

        aya();
    }

    private void aya() {
     //   moveList= new ArrayList<>();
        MoveList items = new MoveList("Hacker", "Akan Satayev", "Jul 11, 2024",R.drawable.my_lovee);
        moveList.add(items);
        MoveList items2 = new MoveList("The Cursed Land", "Panu Aree","11/5/2014",R.drawable.my_lovee);
        moveList.add(items2);
        MoveList items3= new MoveList("alaref","ahmed aza","23/3/2018",R.drawable.my_lovee);
        moveList.add(items3);
        MoveList items4 = new MoveList("Almotaswl","Adel Amam","14/5/2002",R.drawable.my_lovee);
        moveList.add(items4);
        MoveList items5 = new MoveList("Alakhter","Amear Karara","2019",R.drawable.my_lovee);
        moveList.add(items5);
        MoveList items6 = new MoveList("X Larg","Ahmed Halmy","2016",R.drawable.my_lovee);
        moveList.add(items6);
        MoveList items7 = new MoveList("in bany mousa","Aya Gamal Saper Abdelrohman","28/12/2002",R.drawable.my_lovee);
        moveList.add(items7);
        MoveList items8 = new MoveList("in heromlopis magna","Abdelhamid Maher Abdelhamid Fawzy","19/3/2003",R.drawable.my_lovee);
        moveList.add(items8);
        MoveList items9 = new MoveList("ismail yasen","ismail yasen","1998",R.drawable.my_lovee);
        moveList.add(items9);
        MoveList items10 = new MoveList("Alfel fy Amndel","Zaky Abass","2003",R.drawable.my_lovee);
        moveList.add(items10);
        MoveList items11 = new MoveList("Amer Alzalam","Adel Amam","15/7/2012",R.drawable.my_lovee);
        moveList.add(items11);
        MoveList items12 = new MoveList("Tatah","Mohameed saed","2020",R.drawable.my_lovee);
        moveList.add(items12);
        MoveList items13 = new MoveList("Alsarb","Ahmed Alsaka","2024",R.drawable.my_lovee);
        moveList.add(items13);
    }
}