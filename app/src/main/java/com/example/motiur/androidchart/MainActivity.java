package com.example.motiur.androidchart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends ActionBarActivity {
    int a=89;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BarChart chart = (BarChart) findViewById(R.id.chart);

        BarData data = new BarData(getXAxisValues(), getDataSet());
        chart.setData(data);
        chart.setDescription("My Chart");
        chart.animateXY(2000, 2000);
        chart.invalidate();
    }

    private ArrayList<BarDataSet> getDataSet() {
        ArrayList<BarDataSet> dataSets = null;



        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(a, 0); // Jan
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(90.000f, 1); // Feb
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(120.000f, 2); // Mar
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(60.000f, 3); // Apr
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(20.000f, 4); // May
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(80.000f, 5); // Jun
        valueSet2.add(v2e6);
        BarEntry v2e7 = new BarEntry(100, 6); // Jun
        valueSet2.add(v2e7);

        BarEntry v2e8 = new BarEntry(20, 7); // Jun
        valueSet2.add(v2e8);
        BarEntry v2e9 = new BarEntry(125, 8); // Jun
        valueSet2.add(v2e9);
        BarEntry v2e10 = new BarEntry(89, 9); // Jun
        valueSet2.add(v2e10);
        BarEntry v2e11 = new BarEntry(45, 10); // Jun
        valueSet2.add(v2e11);
        BarEntry v2e12= new BarEntry(30, 11); // DEc
        valueSet2.add(v2e12);


        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "Achievement");
        barDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet2);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        xAxis.add("JUL");
        xAxis.add("AUG");
        xAxis.add("SEP");
        xAxis.add("AUG");
        xAxis.add("NOV");
        xAxis.add("DEC");
        return xAxis;
    }
}
/*
* Add Dependency compile 'com.github.PhilJay:MPAndroidChart:v2.0.9' on Gradle app file
* Add Repository at Project Gradle  maven { url "https://jitpack.io" }
* Final java code is here
* */