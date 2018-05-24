package wyl.kobe.com.mytablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private BaseViewPager viewPager;
    private MyTabLayout myTabLayout;
    private String[] tabs = new String[]{"tab1", "tab2", "tab3"};
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        fragments.add(MyFragment.newInstance());
        fragments.add(MyFragment.newInstance());
        fragments.add(MyFragment.newInstance());
        adapter = new Adapter(getSupportFragmentManager(), fragments, tabs);
        viewPager.setAdapter(adapter);
        myTabLayout.setViewPager(viewPager);
    }
}
