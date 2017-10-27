package com.ztaober.skudemo;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.gson.reflect.TypeToken;
import com.ztaober.skudemo.bean.AttrList;
import com.ztaober.skudemo.bean.Convert;
import com.ztaober.skudemo.bean.GoodsDetailBean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by troy on 2017/10/27.
 * Gmail ztaober@gmail.com
 * Description 多级属性选择
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView skuRecycler;
//    private RecyclerView goodsRecycler;
    private List<AttrList> attrLists;
    private GoodsDetailBean goodsDetailBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        init();
    }

    private void loadData() {
        //商品种类集合
        attrLists = Convert.fromJson(getJson("attrlist.json",this), new TypeToken<ArrayList<AttrList>>() {}.getType());
        //商品详情 包含所有种类
        goodsDetailBean = Convert.fromJson(getJson("goodsdetail.json",this),GoodsDetailBean.class);
    }

    private void init() {
        skuRecycler = findViewById(R.id.sku_recycler);
        skuRecycler.setLayoutManager(new LinearLayoutManager(this));
        SkuAdapter skuAdapter = new SkuAdapter(attrLists,goodsDetailBean.firstSkuList);
        skuRecycler.setAdapter(skuAdapter);


//        goodsRecycler = findViewById(R.id.goods_recycler);
//        goodsRecycler.setLayoutManager(new LinearLayoutManager(this));
    }



    public static String getJson(String fileName, Context context) {
        //将json数据变成字符串
        StringBuilder stringBuilder = new StringBuilder();
        try {
            //获取assets资源管理器
            AssetManager assetManager = context.getAssets();
            //通过管理器打开文件并读取
            BufferedReader bf = new BufferedReader(new InputStreamReader(
                    assetManager.open(fileName)));
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
