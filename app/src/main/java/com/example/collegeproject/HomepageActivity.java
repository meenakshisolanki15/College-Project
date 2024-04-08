package com.example.collegeproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.collegeproject.Adapters.ShopAdapter;
import com.example.collegeproject.models.ShopModel;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HomepageActivity extends AppCompatActivity implements RecyclerViewInterface{
    RecyclerView  recyclerView;

    ArrayList < ShopModel> list = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        recyclerView = findViewById(R.id.recyclarView);

        list.add(new ShopModel(R.drawable.mob,"Mobile","Price:-2% ₹1,80,990","Apple iPhone 15 Plus (128 GB) - Pink About this item\n" +
                " * DYNAMIC ISLAND COMES TO IPHONE 15 — Dynamic Island bubbles up alerts and Live Activities — so you don’t miss" +
                " them while you’re doing something else. Cinematic mode now in 4K Dolby Vision up to 30 fps\n" +
                "Action mode for smooth, steady, handheld videos\n" +
                "Vital safety technology — Crash Detection calls for help."));
        list.add(new ShopModel(R.drawable.img1,"MakeUP Kit","Price:3535","CAVALE TYA 6155 Makeup Kit with 5 Pink Makeup Brushes, 3in1 Combo, " +
                "36H Eyeliner, Kajal, Compact, Lipstick, Fixer, Primer, Contour, Foundation, 3 Makeup Puffs - (Pack of 20)  ABOUT THIS ITEM\n" +
                "【ALL IN ONE MAKEUP SET Pack of 20 】:-- A perfect starter all in one makeup kit that includes eyeshadow palette "));
        list.add(new ShopModel(R.drawable.pho2,"Watch", "6555","Fastrack Limitless Glide Advanced UltraVU HD Display|BT Calling|ATS Chipset|100+ Sports" +
                " Modes & Watchfaces|Calculator|Voice Assistant|in-Built Games|24 * 7 HRM|IP68 Smartwatch  About this item\n" +
                "UltraVU HD Display with Bright Pixel Resolution and is available in brand new amazing colours\n"));
        list.add(new ShopModel(R.drawable.pho4,"shoes", "876", "Campus Men's Clutch Running Shoes  About this item\n" +
                "Material Type: Mesh\n" +
                "Lifestyle: Sports"));
        list.add(new ShopModel(R.drawable.pho5,"Winter Clothes","-70% ₹599" , "Veirdo® Cotton Fleece Regular Fit Hooded Sweatshirt Full Sleeves Solid Jumper Hoodie for Men/Boys "));
        list.add(new ShopModel(R.drawable.pho6,"Ear buds", "54522" ,"boAt Airdopes 141 Bluetooth TWS Earbuds with 42H Playtime,Low Latency Mode for Gaming, ENx Tech, IWP, " +
                "IPX4 Water Resistance, Smooth Touch Controls(Bold Black)"));
        list.add(new ShopModel(R.drawable.pho7,"Laptop", "5566", "Dell G15 5520 Gaming Laptop, Intel i5-12500H/16GB DDR5/1TB SSD/15.6\" (39.62cm) FHD WVA AG 120Hz 250 " +
                "nits/NVIDIA RTX 3050, 4 GB GDDR6/Win 11 + MSO'21/15 Months McAfee/Backlit KB/Dark Shadow Grey/2.81kg"));
        list.add(new ShopModel(R.drawable.pho3,"Home Decoration", "533","jijiohdgohgoifiodjij"));
        list.add(new ShopModel(R.drawable.pho8,"Jewellery", "7546","hello jewewell"));
        list.add(new ShopModel(R.drawable.pho10,"Mobile Holder","24",  "helo mobilel holser"));
        list.add(new ShopModel(R.drawable.pho11,"Man's Clothing", " 454", "hielllo manskljfdjfdj"));
        list.add(new ShopModel(R.drawable.pho12,"Woman's Clothing", "454" , "hello jwommna"));




        ShopAdapter adapter = new ShopAdapter(list, this, this);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(HomepageActivity.this, MainActivity2.class);

        intent.putExtra("imagename", list.get(position).getPic());
        intent.putExtra("header", list.get(position).getText());
        intent.putExtra("Price", list.get(position).getPrice());
        intent.putExtra("Description", list.get(position).getDescription());

        startActivity(intent);
    }
}