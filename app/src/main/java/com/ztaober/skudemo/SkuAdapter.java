package com.ztaober.skudemo;

import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.ztaober.skudemo.bean.Attr;
import com.ztaober.skudemo.bean.AttrList;
import com.ztaober.skudemo.bean.GoodAttrBean;
import com.ztaober.skudemo.bean.SkuBean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by troy on 2017/10/27.
 * Gmail ztaober@gmail.com
 * Description
 */
public class SkuAdapter extends BaseQuickAdapter<AttrList, BaseViewHolder> {


    /**
     * 商品列表
     */
    private List<SkuBean> skuBeanList;


    /**
     * @param attrList    商品属性值集
     * @param skuBeanList 商品列表
     */
    public SkuAdapter(@Nullable List<AttrList> attrList, List<SkuBean> skuBeanList) {
        super(R.layout.item_sku, attrList);
        this.skuBeanList = skuBeanList;
    }

    @Override
    protected void convert(BaseViewHolder helper, AttrList item) {
        helper.setText(R.id.attr_name, item.attrName);
        ViewGroup flowLayout = helper.getView(R.id.flow_layout);
        if (flowLayout.getChildCount() != 0)
            flowLayout.removeAllViews();

        //通过选中的属性集合 处理当前行相关属性是否enable
        checkEnable(item);

        for (Attr attr : item.valueList) {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(5, 5, 5, 0);
            TextView textView = new TextView(mContext);
            textView.setGravity(Gravity.CENTER);
            textView.setPadding(25, 15, 25, 15);
            textView.setLayoutParams(params);
            int bgResId;
            int colorResId;
            if (attr.enable) {
                if (attr.select) {
                    colorResId = mContext.getResources().getColor(R.color.red_txt_color);
                    bgResId = R.drawable.shape_select;
                } else {
                    colorResId = mContext.getResources().getColor(R.color.black_txt_color);
                    bgResId = R.drawable.shape_normal;
                }
            } else {
                colorResId = mContext.getResources().getColor(R.color.grey_txt_color);
                bgResId = R.drawable.shape_normal;
            }
            textView.setTextColor(colorResId);
            textView.setBackgroundResource(bgResId);
            textView.setText(attr.attributeValue);
            textView.setOnClickListener(new SkuOnClickListener(item, attr));

            flowLayout.addView(textView);
        }
    }

    /**
     * 根据所有出当前类别之外的选择 判断按钮的enable ？ false or true
     *
     * @param item
     */
    private void checkEnable(AttrList item) {
        //当前类别之外的选择列表
        List<Attr> attrsOtherSelect = new ArrayList<>();
        for (AttrList attrList : getData()) {
            if (attrList.id != item.id) {
                for (Attr attr : attrList.valueList) {
                    if (attr.enable && attr.select) attrsOtherSelect.add(attr);
                }
            }
        }
        //当前行可以选择的商品id属性集合 用set去重 增加效率
        Set<Integer> enableIds = new HashSet<>();
        for (SkuBean skuBean : skuBeanList) {
            boolean enable = true;
            for (Attr attr : attrsOtherSelect) {
                enable = false;
                for (GoodAttrBean goodAttrBean : skuBean.attributes) {
                    /**
                     * attr 选中属性  goodAttrBean 商品的属性
                     * 条件1 判断是否同种类别  条件2 判断是否存在此属性
                     */
                    if (attr.attributeId == goodAttrBean.attributeId && attr.id == goodAttrBean.attributeValId) {
                        enable = true;
                        break;
                    }
                }
            }
            //enable为true 代表此商品可选
            if (enable) {
                for (GoodAttrBean goodAttrBean : skuBean.attributes) {
                    //把当前行的所有可选属性插入
                    if (item.id == goodAttrBean.attributeId)
                        enableIds.add(goodAttrBean.attributeValId);
                }
            }
        }

        ArrayList<Integer> integers = new ArrayList<>(enableIds);
        //当前类别属性是否enable
        for (Attr attr : item.valueList) {
            attr.enable = integers.indexOf(attr.id) != -1;
        }

    }

    /**
     * 属性点击事件
     */
    private class SkuOnClickListener implements View.OnClickListener {

        private AttrList item;
        private Attr attr;

        /**
         * @param item 行属性
         * @param attr 当前对象
         */
        public SkuOnClickListener(AttrList item, Attr attr) {
            this.item = item;
            this.attr = attr;
        }

        @Override
        public void onClick(View v) {
            if (!attr.enable)
                return;

            boolean select = !attr.select;
            for (Attr a : item.valueList) {
                a.select = false;
            }
            attr.select = select;
            notifyDataSetChanged();
        }
    }
}
