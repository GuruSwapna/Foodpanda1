package com.example.enchanterswapna.foodpanda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Loginreg extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView img1;
    Button bt1;
    TextView tw1,tw2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginreg);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        img1=(ImageView)findViewById(R.id.fblogin);
        bt1=(Button)findViewById(R.id.logbtn);
        tw1=(TextView)findViewById(R.id.mailtx);
        tw2=(TextView)findViewById(R.id.regtxt);
        tw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intn=new Intent(Loginreg.this,Registermn.class);
                startActivity(intn);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intn1=new Intent(Loginreg.this,Loginpage.class);
                startActivity(intn1);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.loginreg, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_address) {

            Intent in1=new Intent(Loginreg.this,Pageaddress.class);
            startActivity(in1);

        } else if (id == R.id.nav_deals) {

            Intent in1=new Intent(Loginreg.this,Dealspage.class);
            startActivity(in1);

        } else if (id == R.id.nav_order) {
            Intent in1=new Intent(Loginreg.this,Loginreg.class);
            startActivity(in1);

        } else if (id == R.id.nav_account) {
            Intent in1=new Intent(Loginreg.this,Loginreg.class);
            startActivity(in1);

        } else if (id == R.id.nav_settings) {

            Intent in1=new Intent(Loginreg.this,settingspage.class);
            startActivity(in1);

        } else if (id == R.id.nav_livechat) {

        } else if (id == R.id.nav_info) {
            Intent in1=new Intent(Loginreg.this,Infonav.class);
            startActivity(in1);

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
