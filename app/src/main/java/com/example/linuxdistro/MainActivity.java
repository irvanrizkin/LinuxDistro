package com.example.linuxdistro;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    ListView listView;
    SimpleAdapter adapter;
    HashMap<String, String>map;
    ArrayList<HashMap<String, String>> mylist;

    String linuxtitle [] = {
            "Ubuntu",
            "Linux Mint",
            "CentOS",
            "Ubuntu MATE",
            "Kali Linux",
            "Steam OS",
            "Debian",
            "Elementary OS",
            "Ubermix",
            "Tails"};
    String linuxdecs [] = {
            "Untuk PC dan Laptop",
            "Untuk pemula",
            "Untuk server",
            "Untuk hardware lama",
            "Untuk ethical hacking",
            "Untuk bermain game",
            "Untuk pemrograman",
            "Desain paling indah",
            "Untuk anak-anak",
            "Untuk privasi"};

    String gambar [] = {
            Integer.toString(R.drawable.ubuntulogo),
            Integer.toString(R.drawable.linuxmintlogo),
            Integer.toString(R.drawable.centoslogo),
            Integer.toString(R.drawable.ubuntumatelogo),
            Integer.toString(R.drawable.kalilinuxlogo),
            Integer.toString(R.drawable.steamoslogo),
            Integer.toString(R.drawable.debianlogo),
            Integer.toString(R.drawable.elementaryoslogo),
            Integer.toString(R.drawable.ubermixlogo),
            Integer.toString(R.drawable.tailslogo)};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.about,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                Intent about = new Intent(MainActivity.this, About.class);
                startActivity(about);
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Daftar Distro Linux");

        listView = (ListView)findViewById(R.id.linuxlist);
        mylist = new ArrayList<HashMap<String, String>>();
        for (int i = 0;i<linuxtitle.length;i++){
            map = new HashMap<String, String>();
            map.put("judul", linuxtitle[i]);
            map.put("Keterangan", linuxdecs[i]);
            map.put("Gambar", gambar[i]);
            mylist.add(map);
        }
        adapter = new SimpleAdapter(this, mylist, R.layout.baris,
                new String[]{"judul", "Keterangan", "Gambar"}, new int[]{R.id.textview1,R.id.textview2,R.id.image});
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 :
                        intent = new Intent(MainActivity.this, Ubuntu.class);
                        startActivity(intent);
                        break;
                    case 1 :
                        intent = new Intent(MainActivity.this, LinuxMint.class);
                        startActivity(intent);
                        break;
                    case 2 :
                        intent = new Intent(MainActivity.this, CentOS.class);
                        startActivity(intent);
                        break;
                    case 3 :
                        intent = new Intent(MainActivity.this, UbuntuMATE.class);
                        startActivity(intent);
                        break;
                    case 4 :
                        intent = new Intent(MainActivity.this, KaliLinux.class);
                        startActivity(intent);
                        break;
                    case 5 :
                        intent = new Intent(MainActivity.this, SteamOS.class);
                        startActivity(intent);
                        break;
                    case 6 :
                        intent = new Intent(MainActivity.this, Debian.class);
                        startActivity(intent);
                        break;
                    case 7 :
                        intent = new Intent(MainActivity.this, ElementaryOS.class);
                        startActivity(intent);
                        break;
                    case 8 :
                        intent = new Intent(MainActivity.this, Ubermix.class);
                        startActivity(intent);
                        break;
                    case 9 :
                        intent = new Intent(MainActivity.this, Tails.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }








}
