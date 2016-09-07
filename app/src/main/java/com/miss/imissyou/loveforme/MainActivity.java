package com.miss.imissyou.loveforme;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Imissyou on 2016/9/4.
 */
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar mBoolbar;
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    private CharSequence mTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setActionBar();
        setViewListener();
    }

    /**
     * 添加控件监听事件
     */
    private void setViewListener() {
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    /**
     * 设置ActionBar
     */
    private void setActionBar() {
        setSupportActionBar(mBoolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                mDrawerLayout, mBoolbar, 0, 0);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setShowHideAnimationEnabled(true);
    }

    /**
     * 初始化控件
     */
    private void initView() {
        mBoolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.main_drawer_layout);
        mNavigationView = (NavigationView) findViewById(R.id.main_navigation);
        mTitle = getTitle();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_navigation_settings:
                break;
            case R.id.menu_navigation_original:
                break;
            case R.id.menu_navigation_other:
                break;
            default:
                break;
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }
}
